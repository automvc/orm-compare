package org.teasoft.orm.compare.mybatis.dao;

import java.util.List;

import org.teasoft.orm.compare.model.Orders;

public interface OrdersDao {
	public List<Orders> getOrdersList(int from, int pageSize);

	int insertBatch(List<Orders> ordersList);

	int insert(Orders orders);

	public Orders updateTotalByIdAndGet(double num, long id);
}
