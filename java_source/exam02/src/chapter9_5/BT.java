package chapter9_5;

import java.util.HashSet;

public class BT {
	public static void main(String[] args) {
		/**
		 * equals, hashCode() -> 일치 -> 같은 자료가 인식
		 * 
		 */
		
		HashSet<B1>list =new HashSet <>();
		
		list.add(new B1(100,"책1"));
		list.add(new B1(100,"책2"));
		list.add(new B1(102,"책3"));
		list.add(new B1(100,"책1"));
		
		for(B1 book : list) {
			//System.out.println(System.identityHashCode(book));
			System.out.println(book);
		}
		
	}
}
