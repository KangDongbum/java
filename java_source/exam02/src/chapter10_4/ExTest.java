package chapter10_4;

public class ExTest {
	Ex1 ex2 = new Ex1() {
		public int add(int num1, int num2) {
			return num1+num2;
		}
	};
	
	public static void main(String[] args) {
		int num3 = 30;
		Ex1 ex = new Ex1() {
			public int add(int num1, int num2) {
				return num1+num2+num3;
			}
		};
		
		System.out.println(ex.add(10, 30));
		
		ExTest ex1 = new ExTest();
		System.out.println(ex.add(30,50));
	}
	
	
}
