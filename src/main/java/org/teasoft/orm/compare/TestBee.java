/*
 * Copyright 2016-2020 the original author.All rights reserved.
 * Kingstar(honeysoft@126.com)
 * The license,see the LICENSE file.
 */

package org.teasoft.orm.compare;

import org.teasoft.orm.compare.bee.service.BeeOrdersService;
import org.teasoft.orm.compare.service.OrdersService;

/**
 * @author Kingstar
 * @since  1.8
 */
public class TestBee {

	public static void main(String[] args) {

		OrdersService service = new BeeOrdersService();
		String ormName = "Bee";

		TestORM.test(service, ormName);
//		TestORM_Large.test(service, ormName);
		
	}
}
