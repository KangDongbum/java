package chapter06_3;

public class Sd {
	public static int serialNum;
	public int SdID;
	public String name;
	
	public Sd() {
	SdID = ++serialNum;
	}
	
	public int getSdID() {
		return SdID;
	}
	
	public static int getSerialNum() {
		return serialNum;
	}
	
	public void showInfo() {
		serialNum=100;
		
		System.out.println("학번: "+ SdID +"이름 : "+name );
	}
}
