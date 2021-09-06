package chapter12_3.treeSet;

import java.util.TreeSet;
import chapter12_3.Member;
import java.util.Iterator;

/**
 * 	추가, 삭제, 조회
 */
public class MemberTreeSet {
	private TreeSet<Member> memberList;
	
	public MemberTreeSet() {
		memberList = new TreeSet<Member>();
	}
	
	/** 추가 */
	public void addMember(Member member) {
		memberList.add(member);
	}
	
	/** 삭제 */
	public boolean removeMember(int memberId) {
		Iterator<Member> ir = memberList.iterator();
		/**
		 * 	hasNext()
		 * 	next()
		 */
		while(ir.hasNext()){
			Member member = ir.next();
			if(member.getMemberId() == memberId) {
				memberList.remove(member);
				return true;
			}
		}
		return false;
	}
	
	/** 출력 */
	public void showMembers() {
		for(Member member : memberList) {
			System.out.println(member);
		}
	}
}
