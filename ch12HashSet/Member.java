package ch12;

public class Member {
	private int memberId;
	private String memberName;
	
	//자기가 가진 속성들을 초기화하는데 쓰임. 생성자함수를 짧게 작성해서 끝내야 빨리 생성된다.
	public Member(int memberId, String memberName) { 
		this.memberId = memberId;
		this.memberName = memberName;
		
	}

	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	
	@Override
	public String toString() { //자체적으로 toString 오버라이딩하는걸로 하자! 다른 패키진데 불러와짐.
		//로그 찍어서 확인 하는 함수.
		return "Member [memberId = " + memberId + ", memberName = " + memberName + "]";
	}
	
	//member라는 객체가 같냐안같냐를 주소에 기준으로 판단.
	@Override
	public int hashCode() {
		// 
		return memberId;
	}
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Member) {// Object의 인스턴스가 Member냐?
			Member member = (Member)obj;
			if(this.memberId == member.memberId) {
				return true;
			}
		}
		
		return false;
	}
	
	
	
	
}
