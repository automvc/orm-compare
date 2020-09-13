package org.teasoft.orm.compare.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.teasoft.orm.compare.model.Orders;

public interface OrdersMapper {

	@Select("SELECT id,userid,name,total,createtime,remark,sequence,abc,updatetime FROM orders limit #{from}, #{pageSize}")
	public List<Orders> getOrdersList(@Param("pageSize") int pageSize);

    @Insert({
   	 "<script>",
   	 "INSERT INTO orders(id,userid,name,total,remark,sequence) VALUES ",
   	 "<foreach collection='list' item='item' index='index' separator=','>",
   	 "(#{item.id}, #{item.userid}, #{item.name}, #{item.total},  #{item.remark}, #{item.sequence})",
   	 "</foreach>",
   	 "</script>"
   	})
	int insertBatch(List<Orders> ordersList);

	@Insert("INSERT INTO orders(id,userid,name,total,remark,sequence) VALUES (#{id},#{userid},#{name},#{total},#{remark},#{sequence})")
	int insert(Orders orders);

	@Select("select id,userid,name,total,remark,sequence from orders where id=#{id} ")
	public Orders selectById(@Param("id") long id);

	@Update("update orders set total=total+#{num} where id=#{id}")
	public void updateTotalById(@Param("num") double num, @Param("id") long id);
}
