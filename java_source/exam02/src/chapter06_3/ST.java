package chapter06_3;

public class ST {
	public static void main(String[] args) {
		Sd.getSerialNum(); // 정적 메소드라 인스턴스 생성전에도 접근가능
		
		Sd s1 = new Sd();
		Sd s2 = new Sd();
		
		s1.serialNum  = 1000;
		
		System.out.println(s1.serialNum);
		System.out.println(s2.serialNum);
		
	}
}
