package chapter12_2.arraylist;

import chapter12_2.Member;

public class Ex1 {
	public static void main(String[] args) {
		MemberArrayList list = new MemberArrayList();
		
		list.addMember(new Member(1001,"�̸�1"));
		list.addMember(new Member(1002,"�̸�2"));
		list.addMember(new Member(1003,"�̸�3"));
		list.addMember(new Member(1001,"�̸�1"));
		
		list.showMembers();
		
		list.removeMember(1001);
		System.out.println("------------------------");
		list.showMembers();
	}
}
