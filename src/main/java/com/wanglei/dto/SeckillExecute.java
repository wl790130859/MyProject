package com.wanglei.dto;

import com.wanglei.entity.SuccessKilled;
import com.wanglei.enums.SeckillStatEnum;

/**
 * 封装秒杀执行后结果
 * @author zzh
 *
 */
public class SeckillExecute {
	//秒杀产品ID
	private long seckillId;
	//秒杀执行结果状态
	private int state;
	//状态表示
	private String stateInfo;
	//秒杀成功对象
	private SuccessKilled successKilled;

	public SeckillExecute(long seckillId, SeckillStatEnum statEnum,
			SuccessKilled successKilled) {
		super();
		this.seckillId = seckillId;
		this.state = statEnum.getState();
		this.stateInfo = statEnum.getStateInfo();
		this.successKilled = successKilled;
	}

	public SeckillExecute(long seckillId, SeckillStatEnum statEnum) {
		super();
		this.seckillId = seckillId;
		this.state = statEnum.getState();
		this.stateInfo = statEnum.getStateInfo();
	}

	public long getSeckillId() {
		return seckillId;
	}
	public void setSeckillId(long seckillId) {
		this.seckillId = seckillId;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getStateInfo() {
		return stateInfo;
	}
	public void setStateInfo(String stateInfo) {
		this.stateInfo = stateInfo;
	}
	public SuccessKilled getSuccessKilled() {
		return successKilled;
	}
	public void setSuccessKilled(SuccessKilled successKilled) {
		this.successKilled = successKilled;
	}

	@Override
	public String toString() {
		return "SeckillExecute [seckillId=" + seckillId + ", state=" + state
				+ ", stateInfo=" + stateInfo + ", successKilled="
				+ successKilled + "]";
	}


}
