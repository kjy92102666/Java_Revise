package ch12;

public class MemberHashSetTest {
	public static void main(String[] args) {
		MemberHashSet mhs = new MemberHashSet();
		
		Member memberKim = new Member(1001, "Kim");
		Member memberLee = new Member(1002, "Lee");
		Member memberPark = new Member(1003, "Park");
		Member memberPark1 = new Member(1004, "Park1");
		
		
		mhs.addMember(memberKim);
		mhs.addMember(memberLee);
		mhs.addMember(memberPark);
		mhs.addMember(memberPark1);
		
		
		mhs.addMember(memberLee);
		//mhs.removeMember(memberPark1);
		
		mhs.showAllMember();
	}
}
