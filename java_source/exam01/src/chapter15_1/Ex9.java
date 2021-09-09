package chapter15_1;

import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

class History{
	private int date;
	private String item;
	private int type;
	private int price;
	
	public History(int date, String item, int type, int price) {
		this.date = date;
		this.item = item;
		this.type = type;
		this.price = price;
	}
	
	public String toString() {
		String typeStr = (type == 0)?"����":"����";
		return "��¥: " +date +", ǰ��: "+item+", ����: "+typeStr+", �ݾ�: " + price;
	}
}

public class Ex9 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<History>list = new ArrayList<>();
		
		System.out.print("��¥ : ");
		int date = Integer.parseInt(scan.nextLine());// next() -> �ܾ��, nextLine() -> ���� ��ü 
		System.out.println();
		System.out.print("ǰ��� : ");
		String item = scan.nextLine();
		System.out.println();
		System.out.print("����(0), ����(1) : ");
		int type = Integer.parseInt(scan.nextLine());
		System.out.println();
		System.out.print("�ݾ� : ");
		int price = Integer.parseInt(scan.nextLine());
		
		list.add(new History(date, item, type, price));
		
		for(History history : list) {
			System.out.println(list);
		}
	}
}
