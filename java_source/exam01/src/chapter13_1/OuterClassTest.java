package chapter13_1;

public class OuterClassTest {
	public static void main(String[] args) {
		OuterClass out = new OuterClass();
		OuterClass.InnerClass in = out.new InnerClass();
		
		OuterClass.InnerClass.StaticMethod();
		in.innerMethod();
	}
}
