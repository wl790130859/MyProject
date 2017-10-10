package com.wanglei.web;

import com.wanglei.dto.Exposer;
import com.wanglei.dto.SeckillExecute;
import com.wanglei.dto.SeckillResult;
import com.wanglei.entity.Seckill;
import com.wanglei.enums.SeckillStatEnum;
import com.wanglei.exception.RepeatKillException;
import com.wanglei.exception.SeckillCloseException;
import com.wanglei.exception.SeckillException;
import com.wanglei.service.SeckillService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/seckill")
public class SeckillController {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private SeckillService seckillService;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(Model model) {
		//获取列表页
		List<Seckill> list = seckillService.getSeckillList();
		model.addAttribute("list", list);
		//list.jsp + model =ModelAndView
		return "list";
	}

	@RequestMapping(value="/{seckillId}/detail", method=RequestMethod.GET)
	public String detail(@PathVariable("seckillId") Long seckillId, Model model) {
		if(seckillId == null) {
			return "redirect:/seckill/list";
		}
		Seckill seckill = seckillService.getById(seckillId);
		if(seckill == null) {
			return "forward:/seckill/list";
		}
		model.addAttribute("seckill", seckill);
		return "detail";
	}

	@RequestMapping(value="/{seckillId}/exposer", method=RequestMethod.POST,
			produces={"application/json;charset=UTF-8"})
	@ResponseBody
	public SeckillResult<Exposer> exposer(@PathVariable("seckillId") Long seckillId) {
		SeckillResult<Exposer> result;
		try {
			Exposer exposer = seckillService.exportSeckillUrl(seckillId);
			result = new SeckillResult<Exposer>(true, exposer);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			result = new SeckillResult<Exposer>(false, e.getMessage());
		}
		return result;
	}

	@RequestMapping(value="/{seckillId}/{md5}/execution", method=RequestMethod.POST,
			produces={"application/json;charset=UTF-8"})
	@ResponseBody
	public SeckillResult<SeckillExecute> execute(
			@PathVariable("seckillId") Long seckillId,
			@CookieValue(value="killPhone", required=false) Long userPhone,
			@PathVariable("md5") String md5) {

		if(userPhone == null) {
			return new SeckillResult<SeckillExecute>(false, "未登录");
		}

		try {
//			SeckillExecute execution = seckillService.executeSeckill(seckillId, userPhone, md5);

			//通过存储过程执行秒杀
			SeckillExecute execution = seckillService.executeSeckillByProcedure(seckillId, userPhone, md5);
			return new SeckillResult<SeckillExecute>(true, execution);
		} catch (RepeatKillException e) {
			SeckillExecute execution = new SeckillExecute(seckillId, SeckillStatEnum.REPEAT_KILL);
			return new SeckillResult<SeckillExecute>(true, execution);
		} catch (SeckillCloseException e) {
			SeckillExecute execution = new SeckillExecute(seckillId, SeckillStatEnum.END);
			return new SeckillResult<SeckillExecute>(true, execution);
		} catch (SeckillException e) {
			SeckillExecute execution = new SeckillExecute(seckillId, SeckillStatEnum.INNER_ERROR);
			return new SeckillResult<SeckillExecute>(true, execution);
		}
	}

	@RequestMapping(value="/time/now", method=RequestMethod.GET)
	@ResponseBody
	public SeckillResult<Long> time() {
		Date now = new Date();
		return new SeckillResult<Long>(true, now.getTime());
	}

}
