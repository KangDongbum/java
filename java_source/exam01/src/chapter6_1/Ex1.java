package chapter6_1;

public class Ex1 {
	static int serialNum; // 0
	int studentID;
	int cardNum;
	
	public Ex1() {
		studentID = ++serialNum;
		cardNum = studentID + 100;
	}
	
	public int getCardNum() {
		return cardNum;
	}
	
	public static void main (String[] args) {
		Ex1 st1 = new Ex1();
		Ex1 st2 = new Ex1();
		
		System.out.println("st1 ī���ȣ = " + st1.getCardNum());
		System.out.println("st2 ī���ȣ = " + st2.getCardNum());
	}
}
