package org.teasoft.orm.compare.mybatis.service;

import java.util.List;

import org.teasoft.orm.compare.InitData;
import org.teasoft.orm.compare.model.Orders;
import org.teasoft.orm.compare.mybatis.dao.OrdersDao;
import org.teasoft.orm.compare.mybatis.dao.impl.OrdersDaoImpl;
import org.teasoft.orm.compare.service.OrdersService;

import com.alibaba.druid.pool.DruidDataSource;

public class MybatisOrdersService implements OrdersService{
	private  int createSize;
	
	private DruidDataSource dataSource;
	OrdersDao dao;

	public MybatisOrdersService(){
		dataSource = new DruidDataSource();
		dataSource.setUrl("jdbc:mysql://localhost:3306/pro?characterEncoding=UTF-8");
		dataSource.setUsername("root");
		dataSource.setPassword("");
		try {
			dataSource.init();
		} catch (Exception e) {
			e.printStackTrace();
		}

		dao = new OrdersDaoImpl(dataSource);
	}

	@Override
	public List<Orders> getOrdersList(int from, int pageSize) {
		return dao.getOrdersList(from, pageSize);
	}

	@Override
	public void insertBatch() {
		int num = dao.insertBatch(InitData.getOrdersList(createSize));
		System.out.println("insert  " + num + " record(s)!");
	}
	
	@Override
	public void insertOne() {
		int num = dao.insert(InitData.getOneOrders());
		System.out.println("insert  " + num + " record(s)!");
	}

	@Override
	public Orders updateTotalByIdAndGet(double num, long id) {
		return dao.updateTotalByIdAndGet(num, id);
	}
	
	@Override
	public void setCreateSize(int size){
		createSize=size;
	}
}
