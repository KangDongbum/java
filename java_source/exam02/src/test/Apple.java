package test;

public class Apple extends Charging implements ChargeAdapter  {
	public void iphone() {
		System.out.println("충전방법은  8핀입니다.");
	}
	public void galaxy() {
		System.out.println("8핀 어댑터를 꽂아주셔야 합니다.");
	};
	
	public void charging() {
		System.out.println("아이폰 충전중입니다.");
	}
}
