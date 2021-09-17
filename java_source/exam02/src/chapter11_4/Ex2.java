package chapter11_4;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;


public class Ex2 {
	public static void main(String[] args) {
	Class cls = Book.class;
	Constructor[] cons = cls.getConstructors();
	System.out.println("-----������-----");
	for(Constructor con : cons) {
		System.out.println(con);
	}
	
	System.out.println("-----����-----");
	Field[] fields = cls.getFields();
	for(Field f1 : fields) {
		System.out.println(f1);
	}
 }
}
