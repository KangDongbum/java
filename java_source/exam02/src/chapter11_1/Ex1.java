package chapter11_1;

public class Ex1 {
	public static void main(String[] args) {
		String text1 = new String("ABC"); // Èü
		String text2 = new String("ABC"); // Èü
		System.out.println(text1 == text2);
		
		String text3 = "ABC";
		String text4 = "ABC";
		System.out.println(text3 == text4);
	}
}
