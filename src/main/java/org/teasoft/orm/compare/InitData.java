package org.teasoft.orm.compare;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.teasoft.honey.distribution.GenIdFactory;
import org.teasoft.orm.compare.model.Orders;

public class InitData {
    private static boolean isFirst=true;	
	public static Orders getOneOrders(){
		Orders orders=new Orders();
		long id=GenIdFactory.get("TestORM");  //use Bee's GenId: SerialUniqueId
		orders.setId(id);
		if(isFirst) {
			orders.setId(12345678912L);  //for select
			isFirst=false;  //fixed bug
		}
		orders.setUserid("testid");
		orders.setName("ormtest");
		orders.setTotal(new BigDecimal("99.96"));
		orders.setRemark("test");
		
		// id gen from PearFlowerId as order id.
		long seqNo=GenIdFactory.get("","PearFlowerId"); 
		orders.setSequence(seqNo+"");
		
		return orders;
	}
	
	
	public static List<Orders> getOrdersList(int size){
		List<Orders> list =new ArrayList<>();
		for (int i = 0; i < size; i++) {
			list.add(getOneOrders());
		}
		return list;
	}
	
	public static Orders[] getOrdersArray(int size){
		List<Orders> list=getOrdersList(size);
		Orders array[]=new Orders[list.size()];
		for (int i = 0; i < array.length; i++) {
			array[i]=list.get(i);
		}
		
		return array;
	}

}
