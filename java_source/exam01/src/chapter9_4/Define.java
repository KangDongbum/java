package chapter9_4;


public class Define {
	/**
	 * final ���� �߰��� ��� - > ������ ������ ����
	 * 
	 */
	public static final int MIN = 1; // static - �ν��Ͻ� ���� ���� ���� ����
	public static final int MAX = 10000; // static
	public final int num =10; // static�� �ƴ� ��� - �ν��Ͻ� ���� �� ���� ����
	
	public static void main(String[] args) {
		Define d = new Define();
		System.out.println("�Ϲ� ��� -" + d.num);
		
		System.out.println(Define.MIN +","+d.MAX);
	}
}
