package chapter9_5;

import java.util.HashSet;

public class BT {
	public static void main(String[] args) {
		/**
		 * equals, hashCode() -> ��ġ -> ���� �ڷᰡ �ν�
		 * 
		 */
		
		HashSet<B1>list =new HashSet <>();
		
		list.add(new B1(100,"å1"));
		list.add(new B1(100,"å2"));
		list.add(new B1(102,"å3"));
		list.add(new B1(100,"å1"));
		
		for(B1 book : list) {
			//System.out.println(System.identityHashCode(book));
			System.out.println(book);
		}
		
	}
}
