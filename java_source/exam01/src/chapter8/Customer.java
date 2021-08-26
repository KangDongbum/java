package chapter8;

public class Customer extends Object {
	protected int CustomerID; // ����ȣ
	protected String CustomerName; // ���̸�
	protected String customerGrade; // �� ��� SILVER
	protected int bonusPoint; //������
	protected double bonusRatio; //1%
	
	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		System.out.println("Customer ������");
	}

	public int calcPrice(int price) {
		 int bonus = (int)(price * bonusRatio); // ���� ������ ���� ������
		bonusPoint += bonus;
		 
		 return price;
	}
	
	public void showInfo() {
		System.out.println(CustomerName + " ���� ����� "+ customerGrade + "�̸�, ���ʽ� ����Ʈ��"+ bonusPoint +"�Դϴ�.");
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
