package ch10;

public class MemberArrayTest {
	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberKim = new Member(1153023, "�����");
		Member memberLee = new Member(53023, "�̼���");
		Member memberPark = new Member(23, "�ڼ���");
		Member memberChoi = new Member(3, "�ּ���");
		
		memberArrayList.addMember(memberKim);
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberChoi);
		
		memberArrayList.showAllMember();
		
		memberArrayList.getMember(1153023);
		
//		Member member = memberArrayList.getMember(2132);
//		if(member != null) System.out.println(member);
//		else System.out.println("wrong member id.....");
		
		Member member = memberArrayList.removeMember(23);		
		if(member != null) System.out.println(member);
		else System.out.println("wrong member id.....");
		System.out.println("--------");
		memberArrayList.showAllMember();
		
		
		
		
	}
}
