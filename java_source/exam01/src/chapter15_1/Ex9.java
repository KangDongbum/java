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
		String typeStr = (type == 0)?"지출":"수입";
		return "날짜: " +date +", 품목: "+item+", 구분: "+typeStr+", 금액: " + price;
	}
}

public class Ex9 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<History>list = new ArrayList<>();
		
		System.out.print("날짜 : ");
		int date = Integer.parseInt(scan.nextLine());// next() -> 단어별로, nextLine() -> 문장 전체 
		System.out.println();
		System.out.print("품목명 : ");
		String item = scan.nextLine();
		System.out.println();
		System.out.print("지출(0), 수입(1) : ");
		int type = Integer.parseInt(scan.nextLine());
		System.out.println();
		System.out.print("금액 : ");
		int price = Integer.parseInt(scan.nextLine());
		
		list.add(new History(date, item, type, price));
		
		for(History history : list) {
			System.out.println(list);
		}
	}
}
