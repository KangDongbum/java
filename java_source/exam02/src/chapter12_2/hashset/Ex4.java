package chapter12_2.hashset;

import java.util.TreeSet;
import chapter12_2.Member;

public class Ex4 {
	public static void main(String[] args) {
		TreeSet<Member> list = new TreeSet<>();
		list.add(new Member(1002,"이름3"));
		list.add(new Member(1000,"이름1"));
		list.add(new Member(1001,"이름2"));
		list.add(new Member(1003,"이름4"));
		
		for(Member member : list) {
			System.out.println(member);
		}
	}
}
