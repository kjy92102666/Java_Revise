package ch13;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {
	private TreeSet<Member> treeSet;
	
	public MemberTreeSet() {
		treeSet = new TreeSet<>();
	}
	
	public void addMember(Member member) {
		treeSet.add(member);	//add()�� boolean ����.
	}
	
	
	public boolean removeMember(int memberId) {
		Iterator<Member> im = treeSet.iterator();
		while(im.hasNext()) {
			Member member = im.next();
			int tmpId = member.getMemberId();
			if(tmpId == memberId) {
				treeSet.remove(member);
				return true;
			}
		}
		return false;
	}
	
	
	//getMember�غ���!
	
	public void showMember() {
		for(Member m : treeSet) {
			System.out.println(m);
		}
		
		System.out.println();
	}
	
}
