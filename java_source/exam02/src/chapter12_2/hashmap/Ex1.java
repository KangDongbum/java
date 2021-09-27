package chapter12_2.hashmap;

import chapter12_2.Member;

public class Ex1 {
	public static void main(String[] args){
		MemberHashMap list = new MemberHashMap();
		list.addMember(new Member(1000,"�̸�1"));
		list.addMember(new Member(1001,"�̸�2"));
		list.addMember(new Member(1002,"�̸�3"));
		
		list.showInfo();
		System.out.println("==============");
		list.removeMember(1001);
		list.showInfo();
	}
}