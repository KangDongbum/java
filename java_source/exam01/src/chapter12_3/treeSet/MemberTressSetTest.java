package chapter12_3.treeSet;

import chapter12_3.Member;

public class MemberTressSetTest {
	public static void main(String[] args) {
		MemberTreeSet list = new MemberTreeSet();
		list.addMember(new Member(1003,"�̸�3"));
		list.addMember(new Member(1001,"�̸�2"));
		list.addMember(new Member(1002,"�̸�1"));
		list.addMember(new Member(1004,"�̸�4"));
		list.addMember(new Member(1001,"�̸�2"));
		
		list.showMembers();
	}
}
