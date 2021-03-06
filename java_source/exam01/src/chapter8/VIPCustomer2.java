package chapter8;

public class VIPCustomer2 extends Customer {
	private double bonusRatio;
	private double discountRatio; //상품 할인율 10%
	private int agentID; // 전문 상담원 ID
	
	/*
	public VIPCustomer2() {
		super(); // Customer클래스의 인스턴스가 VipCustomer 인스턴스보다 먼저 생성
		bonusRatio = 0.05;
		customerGrade ="VIP";
		discountRatio = 0.1;
		
		System.out.println("VIPCustomer2 생성자");
	} */
	
	public VIPCustomer2(int CustomerID, String CustomerName, int agentID) {
		super(CustomerID, CustomerName);
		this.agentID = agentID;
		
		bonusRatio = 0.05;
		customerGrade ="VIP";
		discountRatio = 0.1;
	}

	public int getAgentID() {
		return agentID;
	}

	public void setAgentID(int agentID) { 
		this.agentID = agentID;
	}
	
	@Override
	public int calcPrice(int price) { // 메소드 오버라이드
		int bonus = (int)(price * bonusRatio); // 적립 비율에 따른 적립급
		bonusPoint += bonus;
		 
		int discount = (int)(price * discountRatio);
		
		return price - discount;
	}
	
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("상담원 ID : " + agentID);
	}
	
}
