package chapter10_6;

public class Customer implements Buy, Sell {
	public void buy() {
		System.out.println("Buy �޼ҵ�");
	}
	public void sell() {
		System.out.println("Sell �޼ҵ�");
	}
	public void pay() {
		System.out.println("�ߺ��� �޼ҵ� pay");
	}
	@Override
	public int getPrice() {
		return Buy.super.getPrice();
	}
	@Override
	public void showInfo() {
		System.out.println("Customer Ŭ����");
	}
}
