package test;

public class Samsung extends Charging implements ChargeAdapter  {
	public void galaxy() {
		System.out.println("충전방법은 USB-C타입 입니다.");
	}
	
	public void iphone() {
		System.out.println("USB-C타입 어댑터를 꽂아주셔야 합니다.");
	};
	
	public void charging() {
		System.out.println("갤럭시 충전중입니다.");
	}
}
