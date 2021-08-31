package chapter10_6;

public class Customer implements Buy, Sell {
	public void buy() {
		System.out.println("Buy 메소드");
	}
	public void sell() {
		System.out.println("Sell 메소드");
	}
	public void pay() {
		System.out.println("중복된 메소드 pay");
	}
	@Override
	public int getPrice() {
		return Buy.super.getPrice();
	}
	@Override
	public void showInfo() {
		System.out.println("Customer 클래스");
	}
}
