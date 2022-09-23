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
		
		//StringConcat ss = new StringConcat() 로는 사용하지x. 내부함수는 내부로만... 외부호출x
		new StringConcat() {
	
			public void makeString(String s1, String s2) {
				System.out.println(s1+s2);
			}
		}.makeString("helloEM", "world!");
		
		System.out.println(sc);	//함수를 외부로 옮겨서 사용도 가능하지만 선호하진않는다~
		
	}
}
