/*
 * Copyright 2016-2020 the original author.All rights reserved.
 * Kingstar(honeysoft@126.com)
 * The license,see the LICENSE file.
 */

package org.teasoft.orm.compare;

import java.util.List;

import org.teasoft.orm.compare.bee.service.BeeOrdersService;
import org.teasoft.orm.compare.model.Orders;
import org.teasoft.orm.compare.service.OrdersService;

/**
 * @author Kingstar
 * @since  1.8
 */
public class TestORM_Large {
	
	public static void test(OrdersService service,String ormName) {
		
		System.out.println("Now test the ORM: "+ormName);
		
		int insertBatchSize;
		int selectUpdateSize;
//		for (int i = 1; i <= 4; i++) {
		for (int i = 5; i <= 5; i++) {
			
			if(i==1){
				 insertBatchSize=5000;
				 selectUpdateSize=20;
			}else if(i==2){
				 insertBatchSize=10000;
				 selectUpdateSize=50;
			}else if(i==3){
				 insertBatchSize=20000;
				 selectUpdateSize=100;
			}else if(i==4){
				 insertBatchSize=50000;
				 selectUpdateSize=200;
			}
			else{ //i=5
				 insertBatchSize=100000; //10w
				 selectUpdateSize=500;
			}
			System.out.println("Now it is "+ i + " time.");
			doTest(ormName, service, insertBatchSize, selectUpdateSize);
		}

	}

	
	private static void doTest(String ormName,OrdersService service,int insertBatchSize,int selectUpdateSize){
		
		service.setCreateSize(insertBatchSize);
		
		service.insertOne(); //can start the ds.
	
		//test 1
		long start=System.currentTimeMillis();
//		service.insertBatch();  //will use insertBatchSize
		long end=System.currentTimeMillis();
		
		System.out.print("----test batch insert:  ");
		System.out.println((end-start)+ " ms");
		
		//test 2
		long start2=System.currentTimeMillis();
		for (int i = 0; i < selectUpdateSize; i++) {//22001
			List<Orders> list=service.getOrdersList(30000, 100);
		}
		long end2=System.currentTimeMillis();
		
		System.out.println("----test select "+selectUpdateSize+" times:  "+(end2-start2)+ " ms");
		
		//test 3
		long start3=System.currentTimeMillis();
		for (int i = 0; i < selectUpdateSize; i++) {
		  service.updateTotalByIdAndGet(100, 12345678912L); //can change the select id.
//		  service.updateTotalByIdAndGet(100, 487024993763334L); //can change the select id.
		}
		long end3=System.currentTimeMillis();
		System.out.println("----test update and select "+selectUpdateSize+" times:  "+(end3-start3)+ " ms");

		System.out.println((end-start)+"   "+(end2-start2)+ "  "+(end3-start3));
		System.out.println();
		
		//not for test this time.
		BeeOrdersService beeservice=new BeeOrdersService();
		beeservice.deleteOrdersById(12345678912L);
	}

}
