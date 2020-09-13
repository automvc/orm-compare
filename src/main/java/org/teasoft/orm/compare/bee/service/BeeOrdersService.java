/*
 * Copyright 2016-2020 the original author.All rights reserved.
 * Kingstar(honeysoft@126.com)
 * The license,see the LICENSE file.
 */

package org.teasoft.orm.compare.bee.service;

import java.util.List;

import org.teasoft.bee.osql.Condition;
import org.teasoft.bee.osql.SuidRich;
import org.teasoft.bee.osql.transaction.Transaction;
import org.teasoft.honey.osql.core.BeeFactory;
import org.teasoft.honey.osql.core.ConditionImpl;
import org.teasoft.honey.osql.core.SessionFactory;
import org.teasoft.orm.compare.InitData;
import org.teasoft.orm.compare.model.Orders;
import org.teasoft.orm.compare.service.OrdersService;

import com.alibaba.druid.pool.DruidDataSource;

/**
 * @author Kingstar
 * @since  1.8
 */
public class BeeOrdersService implements OrdersService {

	private int createSize;

	static {
		DruidDataSource dataSource;
		dataSource = new DruidDataSource();
		dataSource.setUrl("jdbc:mysql://localhost:3306/pro?characterEncoding=UTF-8");
		dataSource.setUsername("root");
		dataSource.setPassword("");
		try {
			dataSource.init();
		} catch (Exception e) {
			e.printStackTrace();
		}

		BeeFactory.getInstance().setDataSource(dataSource);
	}

	private SuidRich suidRich = BeeFactory.getHoneyFactory().getSuidRich();

	@Override
	public List<Orders> getOrdersList(int from, int pageSize) {
		//		List<Orders> list=suidRich.select(new Orders(), 700000, 2);
		List<Orders> list = suidRich.select(new Orders(), from, pageSize);
		return list;
	}

	@Override
	public void insertBatch() {
		Orders array[] = InitData.getOrdersArray(createSize);
		//		int num = suidRich.insert(array, 10000);
		int num = suidRich.insert(array);
		System.out.println("insert  " + num + " record(s)!");
	}

	@Override
	public void insertOne() {
		int num = suidRich.insert(InitData.getOneOrders());
		System.out.println("insert  " + num + " record(s)!");
	}

	@Override
	public Orders updateTotalByIdAndGet(double num, long id) {
		Transaction transaction = SessionFactory.getTransaction();
		Orders orders = null;
		Orders orders1 = null;
		//模拟：total涨100，完成后查询最新的数额
		transaction.begin();
		orders = new Orders();
		orders.setId(id);
		Condition condition = new ConditionImpl();
		condition.setAdd("total", num);
		suidRich.update(orders, "total", condition); //total=total+100

		orders1 = suidRich.selectOne(orders);

		transaction.commit();

		return orders1;
	}

	@Override
	public void setCreateSize(int size) {
		createSize = size;
	}

	//other
	public int deleteOrdersById(long id) {
		SuidRich suidRich = BeeFactory.getHoneyFactory().getSuidRich();
		return suidRich.deleteById(Orders.class, id);
	}

}
