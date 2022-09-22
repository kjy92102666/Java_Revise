package ch12;

public class Member {
	private int memberId;
	private String memberName;
	
	//�ڱⰡ ���� �Ӽ����� �ʱ�ȭ�ϴµ� ����. �������Լ��� ª�� �ۼ��ؼ� ������ ���� �����ȴ�.
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
	public String toString() { //��ü������ toString �������̵��ϴ°ɷ� ����! �ٸ� ��Ű���� �ҷ�����.
		//�α� �� Ȯ�� �ϴ� �Լ�.
		return "Member [memberId = " + memberId + ", memberName = " + memberName + "]";
	}
	
	//member��� ��ü�� ���ľȰ��ĸ� �ּҿ� �������� �Ǵ�.
	@Override
	public int hashCode() {
		// 
		return memberId;
	}
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Member) {// Object�� �ν��Ͻ��� Member��?
			Member member = (Member)obj;
			if(this.memberId == member.memberId) {
				return true;
			}
		}
		
		return false;
	}
	
	
	
	
}
