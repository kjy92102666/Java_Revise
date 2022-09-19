package oop_pro3.ch03;

public class StringBuilderTest {
	public static void main(String[] args) {
		
		String java = new String("java");
		String android = "android";
		
		StringBuilder stringBuilder = new StringBuilder("java");
		stringBuilder.append(java);	//append 추가된다. 문자열을
		System.out.println(stringBuilder.hashCode());
		stringBuilder.append(android);
		System.out.println(stringBuilder.hashCode());
		System.out.println(stringBuilder);
		//주소값이 똑같다. == 동일 메모리공간을 계속 쓰고있다는 것을 증명.
		
		
		//StringBuilder. 클래스 내에서만 문자 하나하나 비교할때 쓰임. 타 클래스에서 동시사용가능.
		//동시 수정가능. == 잘못된 값이 입력될 수 있다.
		StringBuilder stringBuilder1 = new StringBuilder();
		stringBuilder1.append(java);
		System.out.println(stringBuilder1.hashCode());
		stringBuilder1.append(android);
		System.out.println(stringBuilder1.hashCode());
		
		String result = stringBuilder1.toString();//다른 변수에 대입하는 등 옮길때는 toString()사용.
		System.out.println(result);
		System.out.println(stringBuilder1.toString());//toString 생략되도 같음
		
		//StringBuffer. StringBuffer변수(멤버변수로) 하나 만들어놓고 서로 다른쓰레드에서 문자 변형할때 사용.
		//StringBuilder보다 더 많이 쓰임. 다른 사람들과의 중첩을 막기위한 안전장치가 있음.
		//ex. a클래스에서 멤버변수로 선언해서 쓰고, 다른사람이 b클래스에서 쓰려하면 웨이팅이나 락을 걸어준다~ 잠시나마.
		StringBuffer strBuffer = new StringBuffer();
		strBuffer.append(java);
		strBuffer.append(android);
		System.out.println(strBuffer);
		
		
		System.out.println(java.hashCode());
		System.out.println(android.hashCode());
		
		java = java+android;
		
		
		System.out.println(java.hashCode());
	}
}
