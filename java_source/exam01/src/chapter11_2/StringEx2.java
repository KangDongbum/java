package chapter11_2;

public class StringEx2 {
	public static void main(String[] args) {
		String text1 = "ABC";
		String text2 = "ABC";
		System.out.println(text1 == text2); //상수풀에 ABC를 둘다 가리키고 있어서 주소값이 같음
		
		String st1 = new String("ABC");
		String st2 = new String("ABC");
		System.out.println(st1 == st2); // 인스턴스 주소값 비교
		System.out.println(st1.equals(st2)); // 인스턴스 주소값 비교인데 String클래스(내부 hashcode, equals메소드가 재정의 되어있음)로 만들었기때문에 논리적 비교
	}
}
