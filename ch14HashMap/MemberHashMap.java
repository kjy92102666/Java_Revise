package ch14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;		//Set은 모든 key값의 부모?

import ch13.Member;


public class MemberHashMap {
	
	private HashMap<Integer, Member> hashMap; //hash맵은 <key, value>로 구성.
	
	public MemberHashMap() {
		hashMap = new HashMap<Integer, Member>();	//선언부에 제네릭타입 적혀 있지만, 생략가능.
		
	}
	
	public void addMember(Member member) {
		hashMap.put(member.getMemberId(), member);	//학번만 알면 멤버를 뽑을 수...
		
	}
	
	
	public Member getMember(int memberId) {
		if(hashMap.containsKey(memberId)) {
			return hashMap.get(memberId);	//get()은 value를 리턴한다.
		}
		return null;	//위에서 미리 return을 해줬기떄문에 null이다~
	}
	
	public boolean removeMember(int memberId) {
		//Iterator,for로 구현해보기
		if(hashMap.containsKey(memberId)) {	//containsKey를 통해 key가 있냐없냐 체크.
			hashMap.remove(memberId);
			return true;
		}
		System.out.println("not exist key!");
		return false;
	}
	
	public void showallMember() {	//key는 중복이 안되니까 set이 올 수 있다.
		//Iterator
		Iterator<Integer> ir = hashMap.keySet().iterator();
		while(ir.hasNext()) {
			int key = ir.next();
			//hashMap은 key를 통해서만 뽑을 수 있다.
			Member member = hashMap.get(key);
			System.out.println(member);
		}
		
		
		
		/* 상향포문으론 안되는것일까?
		 * Set s = hashMap.keySet(); for(Integer i : s) {
		 * 
		 * }
		 */
		
		
	}
	
	
	
}
