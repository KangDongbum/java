package chapter9_1;

public class Test {
	Ex1 ex2 = new Ex1() {
		int add(int num1, int num2) {
			return num1+num2;
		}
	};
	
	public static void main(String[] args) {
		/**
		 * 1. ���� ���� Ŭ���� -> �޼ҵ��
		 * 2. Ŭ������ ������ ����
		 * 	+ �� ������ �κ��� ���� ������
		 * 
		 * �ν��Ͻ��� ���� �� �� �ִ�.
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
