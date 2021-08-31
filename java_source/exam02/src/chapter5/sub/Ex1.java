package chapter5.sub;

import chapter5.*;
public class Ex1 {
	
	public static void main(String[] args) {
		Person person = new Person();
		Person person2 = new Person();
		
		/**
		 *  main() ->  JVMÈ£Ãâ (1)
		 *  showInfo() -> main() -> showInfo(); (2)
		 */
		person.showInfo();
		System.out.println(person);
		System.out.println(person2);
		
	}
}
