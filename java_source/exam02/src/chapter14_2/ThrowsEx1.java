package chapter14_2;

public class ThrowsEx1 {
	public void method() {
		/**
		 *  �ܺο����� ���ܰ� �߻� �ߴ��� �� �� X
		 *  �޼ҵ尡 ���������� ���� -> ���� X
		 *  �ٸ� �޼ҵ忡�� ȣ���� ���� �ǰ� ���� ����Ǵ� ������ �ٸ� ���
		 *  ���ܵ� ���� �ٸ��� ó��
		 */
		try {
		Class.forName("chapter14_2.ResourceEx2");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 *  method2()�� ȣ���ϴ� �ʿ��� ClassNotFoundException�� ó���ϵ��� ����
	 * 
	 */
	public void method2() throws ClassNotFoundException{
		Class.forName("chapter14_2.ResourceEx2");
	}
}
