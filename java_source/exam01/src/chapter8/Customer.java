package chapter8;

public class Customer extends Object {
	protected int CustomerID; // 고객번호
	protected String CustomerName; // 고객이름
	protected String customerGrade; // 고객 등급 SILVER
	protected int bonusPoint; //적립금
	protected double bonusRatio; //1%
	
	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		System.out.println("Customer 생성자");
	}

	public int calcPrice(int price) {
		 int bonus = (int)(price * bonusRatio); // 적립 비율에 따른 적립급
		bonusPoint += bonus;
		 
		 return price;
	}
	
	public void showInfo() {
		System.out.println(CustomerName + " 님의 등급은 "+ customerGrade + "이며, 보너스 포인트는"+ bonusPoint +"입니다.");
	}
	
	public int getCustomerID() {
		return CustomerID;
	}

	public void setCustomerID(int customerID) {
		CustomerID = customerID;
	}

	public String getCustomerName() {
		return CustomerName;
	}

	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}

	public String getCustomerGreade() {
		return customerGrade;
	}

	public void setCustomerGreade(String customerGreade) {
		this.customerGrade = customerGreade;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public double getBonusRatio() {
		return bonusRatio;
	}

	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
	
	
}
