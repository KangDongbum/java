package chapter11_4;

import java.lang.reflect.Constructor;

public class Ex3 {
	public static void main(String[] args) throws Exception {
		Class cls = Class.forName("chapter11_4.Book");
		Constructor c = cls.getDeclaredConstructor(String.class, int.class);
		Book book = (Book) c.newInstance("å1",20000);
		System.out.println(book);
	}
}
