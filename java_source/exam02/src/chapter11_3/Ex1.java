package chapter11_3;

public class Ex1 {
	public static void main(String[] args) {
		String text = "AB";
		System.out.println("text : "+System.identityHashCode(text));
		
		StringBuilder sb = new StringBuilder(text);
		System.out.println("sb : "+ System.identityHashCode(sb));
		
		sb.append("CD");
		System.out.println("sb : "+ System.identityHashCode(sb));
		
		text = sb.toString();
		System.out.println("text : "+System.identityHashCode(text));
		System.out.println(text);
	}
}
