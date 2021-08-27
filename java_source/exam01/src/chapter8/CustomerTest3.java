package chapter8;

import java.util.ArrayList;

public class CustomerTest3 {
	public static void main(String[] args) {
		// 배열 - 동일한 자료형의 연속된 공간
		
		Customer c1 = new Customer(1000, "고객1");
		VIPCustomer2 vc = new VIPCustomer2(1001,"고객2", 1000); // Customer인스턴스, VIPCustomer인스턴스가 공유
		GoldCustomer gc = new GoldCustomer(1002, "고객3"); // Customer인스턴스, GoldCustomer인스턴스가 공유
		
		/*
		Customer[] list = new Customer[3];
		list[0] = c1;
		list[1] = vc;
		list[2] = gc;
		*/
		
		ArrayList<Customer> list = new ArrayList<Customer>();
		list.add(c1);
		list.add(vc);
		list.add(gc);
		
		for(Customer lists : list) {
			lists.showInfo();
			if(lists instanceof VIPCustomer2) {
				VIPCustomer2 vip = (VIPCustomer2)lists;
				System.out.println("AgentID : " + vip.getAgentID());
			}
		}
		
	}
}
