package ch04;

public class StringConcatTest {
	public static void main(String[] args) {
		Concat cc = new Concat();
		cc.makeString("hello", "world!");
		cc.showAllMember();
		
		StringConcat sc = (s1,s2)->{
			System.out.println(s1+s2);;
		};
		
		sc.makeString("helloLamda", "world!");
		
		//StringConcat ss = new StringConcat() �δ� �������x. �����Լ��� ���ηθ�... �ܺ�ȣ��x
		new StringConcat() {
	
			public void makeString(String s1, String s2) {
				System.out.println(s1+s2);
			}
		}.makeString("helloEM", "world!");
		
		System.out.println(sc);	//�Լ��� �ܺη� �Űܼ� ��뵵 ���������� ��ȣ�����ʴ´�~
		
	}
}
