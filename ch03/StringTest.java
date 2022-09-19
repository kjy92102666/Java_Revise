package oop_pro3.ch03;

public class StringTest {
	public static void main(String[] args) {
		String str1 = new String("abc");	//new로 생성된 인스턴스
		String str2 = new String("abc");	//""
		System.out.println(str1 == str2);		//주소값 비교 (CallByAddress)
		System.out.println(str1.equals(str2));	//값 비교    (CallByValue)
		
		
		String str3 = "abc"; //상수풀이라는 메모리에 저장된다.
		String str4 = "abc"; //""
		System.out.println(str3 == str4);		//C.B.A
		System.out.println(str3.equals(str4));	//C.B.V
		
	}
}


