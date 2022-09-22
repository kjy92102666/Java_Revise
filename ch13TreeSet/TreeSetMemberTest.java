package ch13;

public class TreeSetMemberTest {
	public static void main(String[] args) {
		//MemberTreeSet mts = new MemberTreeSet();
		MemberTreeSet mts = new MemberTreeSet();
		
		Member memberKim3 = new Member(1003, "kim3");
		Member memberKim1 = new Member(1001, "Aim1");
		Member memberKim2 = new Member(1002, "Gim2");
		
		
		mts.addMember(memberKim3);
		mts.addMember(memberKim1);
		mts.addMember(memberKim2);
		

		mts.showMember();
	}
	
}
