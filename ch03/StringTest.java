package oop_pro3.ch03;

public class StringTest {
	public static void main(String[] args) {
		String str1 = new String("abc");	//new�� ������ �ν��Ͻ�
		String str2 = new String("abc");	//""
		System.out.println(str1 == str2);		//�ּҰ� �� (CallByAddress)
		System.out.println(str1.equals(str2));	//�� ��    (CallByValue)
		
		
		String str3 = "abc"; //���Ǯ�̶�� �޸𸮿� ����ȴ�.
		String str4 = "abc"; //""
		System.out.println(str3 == str4);		//C.B.A
		System.out.println(str3.equals(str4));	//C.B.V
		
	}
}


