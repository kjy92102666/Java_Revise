package ch12;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
	//Member ArrayList 와 같이 Member HashSet을 가진다.
	private HashSet<Member> hashSet;
	
	public MemberHashSet() {
		hashSet = new HashSet<>();
		
	}
	
	public void addMember(Member member) {
		if(member.getMemberId()>0) {
			hashSet.add(member);
		}else 
			System.out.println("없는 객체입니다.");
		
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
				//return hashSet.remove(a);  쓸데없는 메모리를 주지않는 refactoring
				//hashSet이 어차피 반환값이 boolean이라 가능.
			}
		}
		
		System.out.println("동일한 아이디가 없습니다.");
		return false;
	}
	
	
	public void showAllMember() {
		for(Member m : hashSet) {
			System.out.println(m);
		}
		System.out.println();
	}
	
}
