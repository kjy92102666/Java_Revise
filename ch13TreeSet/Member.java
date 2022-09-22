package ch13;


public class Member implements Comparable<Member>{
	private int memberId;
	private String memberName;
	
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
	public int hashCode() {
		//
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		//
		if(obj instanceof Member) {// Object�� �ν��Ͻ��� Member��?
			Member member = (Member)obj;
			if(this.memberId == member.memberId) {
				return true;
			}

		}
		return false;
	}

	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberName=" + memberName + "]";
	}

	@Override
	public int compareTo(Member o) {
//		System.out.println("this.memberid = " + this.memberId + 
//				"other.memberId = " + o.memberId);
//		if(this.memberId < o.memberId) return -1;
//		else if(this.memberId == o.memberId) return 0;
//		else return 1;	//�ڸ��� �ٲ۴�~
		return this.memberName.compareTo(o.memberName);
		//String,compareTo���� �⺻������ ���ڸ� ������������ ����. ���������� *-1.
	}

}
