package chapter7;

public class ArrayEx3 {
	public static void main(String[] args) {
		Book[] book = new Book[3]; //Book ���� �ڷ��� �� ���� 4��
		Book[] book2 = new Book[3]; //book�� ������ �迭
		
		book[0] = new Book("�ڹ����α׷��� �Թ�", 20000);
		book[1] = new Book("�����ͺ��̽� ���а� �ǽ�", 25000);
		book[2] = new Book("�������α׷� ����", 0);
		
		//System.arraycopy(book, 0, book2, 0, 3);
		for(int i = 0; i < book2.length; i++) {
			book2[i] = new Book(book[i].getName(), book[i].getPrice());
		}
		
		System.out.println("----------book--------");
		book[2].setName("���� ���� JSP");
		book[2].setPrice(18000);
		for(int i = 0; i < book.length; i++) {
			book[i].showInfo();
		}
		
		System.out.println("----------book2--------");
		for(int i = 0; i < book.length; i++) {
			book2[i].showInfo();
		}
	
	}
}
