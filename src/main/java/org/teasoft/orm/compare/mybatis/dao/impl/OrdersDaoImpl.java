package org.teasoft.orm.compare.mybatis.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import org.teasoft.orm.compare.model.Orders;
import org.teasoft.orm.compare.mybatis.dao.OrdersDao;
import org.teasoft.orm.compare.mybatis.dao.OrdersMapper;

public class OrdersDaoImpl implements OrdersDao {

	SqlSessionFactory sqlSessionFactory;
	
	public OrdersDaoImpl(DataSource dataSource) {
		initDs(dataSource);
	}

	private void initDs(DataSource dataSource) {
		TransactionFactory transactionFactory = new JdbcTransactionFactory();
		Environment environment = new Environment("development", transactionFactory, dataSource);
		Configuration configuration = new Configuration(environment);
		configuration.addMapper(OrdersMapper.class); //要设置mapper
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(configuration);
	}

	@Override
	public List<Orders> getOrdersList(int from, int pageSize) {
		SqlSession sqlSession = sqlSessionFactory.openSession(false);
		Map map = new HashMap();
		map.put("from", from);
		map.put("pageSize", pageSize);
		try {
			return sqlSession.selectList("org.teasoft.orm.compare.mybatis.dao.OrdersMapper.getOrdersList", map);  //改了包名,就要换.   否则报错.
		} finally {
			sqlSession.close();
		}
	}

	@Override
	public int insertBatch(List<Orders> ordersList) {

		SqlSession sqlSession = sqlSessionFactory.openSession(true); //auto Commit
		try {
			return sqlSession.insert("org.teasoft.orm.compare.mybatis.dao.OrdersMapper.insertBatch", ordersList);
		} finally {
			sqlSession.close();
		}
	}

	@Override
	public int insert(Orders orders) {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		try {
			return sqlSession.insert("org.teasoft.orm.compare.mybatis.dao.OrdersMapper.insert", orders);
		} finally {
			sqlSession.close();
		}
	}

	@Override
	public Orders updateTotalByIdAndGet(double num, long id) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			Map map = new HashMap();
			map.put("num", num);
			map.put("id", id);
			sqlSession.update("org.teasoft.orm.compare.mybatis.dao.OrdersMapper.updateTotalById", map);
			Orders result = sqlSession.selectOne("org.teasoft.orm.compare.mybatis.dao.OrdersMapper.selectById", id);
			sqlSession.commit();
//			sqlSession.commit(true);
			return result;
		} finally {
			sqlSession.close();
		}
	}

}
