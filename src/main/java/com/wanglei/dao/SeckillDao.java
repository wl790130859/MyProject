package com.wanglei.dao;

import com.wanglei.entity.Seckill;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface SeckillDao {

	/**
	 * 减库存
	 * @param seckillId	秒杀商品的id
	 * @param killTime	秒杀时间  对应数据库的create_time
	 * @return	表示更新的记录行数
	 */
	int reduceNumber(@Param("seckillId") long seckillId, @Param("killTime") Date killTime);

	/**
	 * 通过Id查询秒杀对象
	 * @param seckillId
	 * @return
	 */
	Seckill queryById(long seckillId);

	/**
	 * 根据偏移量查询秒杀商品列表
	 * @param offset
	 * @param limit
	 * @return
	 */
	// 这里使用了myBatis提供的@Param注解 是为了防止xml文件多个参数时找不到对应的参数
	// 这是java语言本身没有保存形参记录引起的
	List<Seckill> queryAll(@Param("offset") int offset, @Param("limit") int limit);

	/**
	 * 使用存储过程进行秒杀
	 * @param paramMap
	 */
	void killByProcedure(Map<String, Object> paramMap);

}
