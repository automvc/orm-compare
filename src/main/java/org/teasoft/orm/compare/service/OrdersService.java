/*
 * Copyright 2016-2020 the original author.All rights reserved.
 * Kingstar(honeysoft@126.com)
 * The license,see the LICENSE file.
 */

package org.teasoft.orm.compare.service;

import java.util.List;

import org.teasoft.orm.compare.model.Orders;

/**
 * @author Kingstar
 * @since  1.8
 */
public interface OrdersService {
	public List<Orders> getOrdersList(int from, int pageSize);

	public void insertBatch();

	public void insertOne();

	public Orders updateTotalByIdAndGet(double num, long id);
	
	public void setCreateSize(int size);
}
