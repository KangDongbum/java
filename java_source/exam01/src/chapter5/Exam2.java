package chapter5;

public class Exam2 {
	long orderNum;
	String memId;
	String orderDate;
	String memNm;
	String orderGoodsNum;
	String address;
	
	public void setOrder(long orderNum, String memId, String orderDate, String memNm, String orderGoodsNum, String address) {
		this.orderNum = orderNum;
		this.memId = memId;
		this.orderDate = orderDate;
		this.memNm = memNm;
		this.orderGoodsNum = orderGoodsNum;
		this.address = address;
	}
	
	public void showInfo() {
		System.out.println("�ֹ���ȣ : " + orderNum);
		System.out.println("�ֹ��� ���̵� : " + memId);
		System.out.println("�ֹ� ��¥ : " + orderDate);
		System.out.println("�ֹ��� �̸� : " + memNm);
		System.out.println("�ֹ� ��ǰ ��ȣ : " + orderGoodsNum);
		System.out.println("��� �ּ� : " + address);
	}
	
	public static void main(String[] args) {
		Exam2 exam2 = new  Exam2();
		exam2.setOrder(201803120001L, "abc123", "2018�� 3�� 12��", "ȫ���", "PD0345-12", "����� �������� ���ǵ��� 20����" );
		
		exam2.showInfo();
	}
}
