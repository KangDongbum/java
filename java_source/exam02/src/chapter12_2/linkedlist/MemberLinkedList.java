package chapter12_2.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import chapter12_2.Member;

public class MemberLinkedList {
	private LinkedList<Member> members = new LinkedList<>();
	
	public MemberLinkedList() {
		members = new LinkedList<Member>();
	}
	
	/** ȸ�� �߰� */
	public void addMember(Member member){
		members.add(member);
	}
	
	/** ������ ȸ�� ���� */
	public void popMember() {
		members.pop();
	}
	
	/** ȸ�� ���� */
	public boolean removeMember(int memberId) {
		Iterator<Member> ir = members.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();
			if(member.getMemberId() == memberId) {
				members.remove(member);
				return true;
			}
		}
		return false;
	}
	
	/** ȸ�� ��� */
	public void showMembers() {
		for(Member member : members) {
			System.out.println(member);
		}
	}
}
