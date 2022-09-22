package ch10;
import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {
	
	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {
		arrayList = new ArrayList<>();	//ArrayList를 생성하면 cacacity가 10개생성
		
	}
	
	public void addMember(Member member) {
		if(member.getMemberId() > 0) arrayList.add(member);
	}
	
	public Member getMember(int memberId) {
		Member member = null;
		
//		for(int i=0; i<arrayList.size(); i++) {
//			member = arrayList.get(i);		
//			if(member.getmemberId() == memberId) {
//				member =  arrayList.get(i);
//				break;
//			}
//		}
//		return member;
		
		for(Member m : arrayList) {
			if(m.getMemberId() == memberId) {
				return m;
			}
		}
		return null;
	}
	
	
	public Member removeMember(int memberId) {

		for(int i=0; i<arrayList.size(); i++) {
			Member member = arrayList.get(i);
			if(member.getMemberId() == memberId) {
				member =  arrayList.remove(i);
				return member;
			}
		}
		
		
		//Iterator예제
//		Iterator<Member> ir = arrayList.iterator();
//		while(ir.hasNext()) { 	//ir배열안에 다음 요소가 있느냐~?
//			Member member = ir.next();
//			int tempId = member.getMemberId();
//			if(tempId == memberId) {
//				boolean ret = arrayList.remove(member);	//삭제된 멤버를ret에 대입.
//				//why? iterator에 반환값이 bool이니까 맞춰준거다~ 
//				if(ret) return member;		//멤버가 삭제 되었으면 멤버리턴.
//			}
//		}
		
		return null;
	}
	
	public void showAllMember() {
		for(Member m : arrayList) {	//상향포문은 두 집단의 값비교, 인덱스필요없을떄 사용.
			System.out.println(m);
		}
	}
	
	
	
}
