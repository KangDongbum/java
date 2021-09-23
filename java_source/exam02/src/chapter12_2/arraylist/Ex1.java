package chapter12_2.arraylist;

import chapter12_2.Member;

public class Ex1 {
	public static void main(String[] args) {
		MemberArrayList list = new MemberArrayList();
		
		list.addMember(new Member(1001,"이름1"));
		list.addMember(new Member(1002,"이름2"));
		list.addMember(new Member(1003,"이름3"));
		list.addMember(new Member(1001,"이름1"));
		
		list.showMembers();
		
		list.removeMember(1001);
		System.out.println("------------------------");
		list.showMembers();
	}
}
