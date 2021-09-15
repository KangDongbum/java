package chapter9_1;

public class Test {
	Ex1 ex2 = new Ex1() {
		int add(int num1, int num2) {
			return num1+num2;
		}
	};
	
	public static void main(String[] args) {
		/**
		 * 1. 지역 내부 클래스 -> 메소드안
		 * 2. 클래스의 변수로 지정
		 * 	+ 미 구현된 부분을 구현 함을써
		 * 
		 * 인스턴스를 생성 할 수 있다.
		 */
		int num3 = 30;
		
		Ex1 ex = new Ex1() {
			int add(int num1, int num2) {
				return num1+num2+num3;
			}
		};
	
		System.out.println(ex.add(10, 20));
		
		Test ex3 =new Test();
		System.out.println(ex3.ex2.add(30,50));
	}
}
