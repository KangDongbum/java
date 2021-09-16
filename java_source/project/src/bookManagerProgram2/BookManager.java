package bookManagerProgram2;

import java.util.HashMap;
import java.util.Scanner;

public class BookManager {
	Scanner scan = new Scanner(System.in);
	HashMap<String, Book> bookList = new HashMap<String, Book>();

	public void Load() {
		bookList.put("1001", new Book("1001", "1������ �ѱ��� 365", "�ɿ�ȯ", "���ǽ�"));
		bookList.put("1002", new Book("1002", "�� ����", "�󽴹� �õ������ǵ�", "�ֺ���"));
		bookList.put("1003", new Book("1003", "������ �ູ", "������", "���೪��"));
	}

	public void Run() {
		int key = 0;
		while ((key = selectMenu()) != 0) {
			switch (key) {
				case 1:
					listBook();
					break;
				case 2:
					searchBook();
					break;
				case 3:
					addBook();
					break;
				case 4:
					removeBook();
					break;

				default:
					System.out.println("�߸� �����߽��ϴ�.");
					break;
			}
		}
		System.out.println("�����մϴ�...");
	}

	int selectMenu() {
		System.out.println("=================���� ���� ���α׷� �Դϴ�================");
		System.out.println("============���ϴ� ����� ��ȣ�� �Է��� �ּ���============");
		System.out.println("1:���� ���  2:���� �˻�  3:���� �߰�  4:���� ����  0:����");
		System.out.println("");
		//System.out.print("");
		int key = scan.nextInt();
		scan.nextLine();
		return key;
	}

	void listBook() {
		System.out.println("���� ���");

		int count = bookList.size();
		System.out.println("���� ��: " + count);
		for (Book book : bookList.values()) {
			System.out.println(book.toString());
		}
	}

	void addBook() {
		String bookNumber;
		System.out.print("���� ��ȣ:");
		bookNumber = scan.nextLine();
		if (bookList.containsKey(bookNumber)) {
			System.out.println("�̹� �����ϴ� ���� ��ȣ �Դϴ�.");
			return;
		}
		String bookName;
		String author;
		String publisher;

		System.out.print("���� ����:");
		bookName = scan.nextLine();
		System.out.print("����:");
		author = scan.nextLine();
		System.out.println("���ǻ�:");
		publisher = scan.nextLine();
		Book book = new Book(bookNumber, bookName, author, publisher);
		bookList.put(bookNumber, book);
		System.out.println(book.toString() + " ��� �Ͽ����ϴ�.");
	}

	void removeBook() {
		String bookNumber;
		System.out.print("������ ���� ��ȣ");
		bookNumber = scan.nextLine();
		if (bookList.containsKey(bookNumber)) {
			bookList.remove(bookNumber);
			System.out.println("�����Ͽ����ϴ�.");
		} else {
			System.out.println("�������� �ʽ��ϴ�.");
		}
	}

	void searchBook() {
		String bookNumber;
		System.out.print("�˻��� ���� ISBN:");
		bookNumber = scan.nextLine();
		if (bookList.containsKey(bookNumber)) {
			Book book = bookList.get(bookNumber);
			System.out.println("�˻� ���>>" + book.toString());
		} else {
			System.out.println("�������� �ʽ��ϴ�.");
		}
	}
}
