package ch12;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
	//Member ArrayList �� ���� Member HashSet�� ������.
	private HashSet<Member> hashSet;
	
	public MemberHashSet() {
		hashSet = new HashSet<>();
		
	}
	
	public void addMember(Member member) {
		if(member.getMemberId()>0) {
			hashSet.add(member);
		}else 
			System.out.println("���� ��ü�Դϴ�.");
		
	}
	
	public Member getMember(int memberId) {
		Member member = null;
		
		for(Member a : hashSet) {
			if(a.getMemberId() == memberId) {
				return a;
			}
		}
		return null;
	}
	
	public boolean removeMember(int memberId) {
		
		Iterator<Member> ir = hashSet.iterator();
		
//		while(ir.hasNext()) {
//			Member member = ir.next();
//			int tmpId = member.getMemberId();
//			
//			if(tmpId == memberId) {
//				boolean ret = hashSet.remove(member);
//				return ret;
//			}
//		}
		
		for(Member a : hashSet) {
			int tmpId = a.getMemberId();
			if(tmpId == memberId) {
				boolean ret = hashSet.remove(a);
				return ret;
				//return hashSet.remove(a);  �������� �޸𸮸� �����ʴ� refactoring
				//hashSet�� ������ ��ȯ���� boolean�̶� ����.
			}
		}
		
		System.out.println("������ ���̵� �����ϴ�.");
		return false;
	}
	
	
	public void showAllMember() {
		for(Member m : hashSet) {
			System.out.println(m);
		}
		System.out.println();
	}
	
}
