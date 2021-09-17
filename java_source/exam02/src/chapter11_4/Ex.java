package chapter11_4;

public class Ex {
	public static void main(String[] args) throws Exception{
		Book book = new Book("å1", 20000);
		Class cls = book.getClass();
		System.out.println(cls.getName());
		
		Class cls2 = Book.class;
		System.out.println(cls2.getName());
		
		Class cls3 = Class.forName("chapter11_4.Book");
		System.out.println(cls3.getName());
	}
}
