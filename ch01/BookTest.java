package oop_pro3;

public class BookTest {
	public static void main(String[] args) {
		
		Book book = new Book("데미안", "헤세");
		System.out.println(book);
		
		String str1 = new String("kim");
		String str2 = new String("kim");
		
		if(str1.equals(str2)) {
			System.out.println("동일한 글자입니다.");
		}else {
			System.out.println("동일하지 않은 글자입니다.");
		}
		//equals도 기본적으로 주소값을 비교하지만 값을 비교한다.
		
		int i=1;
		int j=2;
		
		if(str1 == str2) {
			System.out.println("같은 문자.");
		}else {
			System.out.println("다른 문자.");
		}
		//객체가 새로 생성 되었기 때문에 참조하는 주소값이 다르므로 "다른 문자" 출력.
		
		
		
		
	}
}
