package chapter8;

public class CustomerTest2 {
	public static void main(String[] args) {
		//VIPCustomer2 vip = new VIPCustomer2();
		//VIPCustomer2 vip2 = new VIPCustomer2();
		//System.out.println(vip.equals(vip2));
		
		//VIPCustomer2 vip = new VIPCustomer2(1001,"VIP ��",1000);		
		Customer vip = new VIPCustomer2(1001,"VIP ��",1000);
		System.out.println(vip.calcPrice(50000));
		vip.showInfo();

	}
}
