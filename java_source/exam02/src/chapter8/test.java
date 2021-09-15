package chapter8;

public class test {
	public static void main(String[] args) {
		//B d= new C();
		C c = new C();
		
		System.out.println(c instanceof B);
		System.out.println(c instanceof A);
		
		// 하위 클래스 -> 상위 클래스로 형변환 -> 묵시적으로 가능(업캐스팅)
		B d = new C();
		A e = new C();
		
		// 상위 클래스 형변환 -> 하위 클래스 변경 -> 명시적으로 형변환(다운캐스팅)
		C f = (C)e;
		
	}
}
