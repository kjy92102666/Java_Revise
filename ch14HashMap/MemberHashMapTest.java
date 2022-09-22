package ch14;
import ch13.Member;

public class MemberHashMapTest {
	public static void main(String[] args) {
		MemberHashMap mhm = new MemberHashMap();
		
		Member m1 = new Member(1001, "Kim1");
		Member m2 = new Member(1002, "Kim2");
		Member m3 = new Member(1003, "Kim3");
		Member m4 = new Member(1004, "Kim4");
		
		mhm.addMember(m1);
		mhm.addMember(m2);
		mhm.addMember(m3);
		mhm.addMember(m4);
		
		mhm.showallMember();
		System.out.println("===========================");
		
		mhm.removeMember(1003);
		mhm.showallMember();
		System.out.println("===========================");
		
		Member member = mhm.getMember(1004); //리턴값이 있으니까 
		System.out.println(member);
		mhm.showallMember();
		
	}
}
