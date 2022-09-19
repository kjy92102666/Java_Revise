package oop_pro3.ex;

import java.lang.reflect.Constructor;

public class PersonTest {
	public static void main(String[] args) throws Exception {
		//객체 생성방법 1. 생성자로 생성하기.
		Person person = new Person("Lee", 18); //이미 자바 vm에 로드되어있는(복제된 할당?), new생성시 동적 메모리 할당.
		System.out.println(person);
		
		//객체 생성방법 2-1.class.forName("풀패키지명"); db드라이버or프린트드라이버를 제공할때, 사용할때 생성&호출되는 방법을 쓴다.
		
			
		Class c1 = Class.forName("oop_pro3.ex.Person");  //이 코드를 만나기 전까지 vm에 로드조차 하지 않는다. 
		//대신 "oop_pro3.ex.Person"이코드를 만나면 stack으로 선언된 애들을 vm이 static 로드시킨다~
		//c1을 통해서 생성자 함수를 찾는다.
		Class[] params = {String.class, Integer.class};//타입 정의
		Constructor cons = c1.getConstructor(params);  //
		Object[] initArgs = {"kim",31};	
		
		Person p1 = (Person)cons.newInstance(initArgs);
		System.out.println(p1);


		
			//객체 생성방법 2-2
		
//		try {//full 패키지명 다 찍어줘야...
//				//'oop_pro3.ex.'이 위치에 있는 Person클래스를 생성해라~
//				Class c1 = Class.forName("oop_pro3.ex.Person");  //이 코드를 만나기 전까지 vm에 로드조차 하지 않는다.
//				//Person클래스 생성자를 불러오는데 자료형이~
//				Class[] params = {String.class, Integer.class};//타입 정의
//				Constructor cons = c1.getConstructor(params);  //정의된 타입을 변수대입
//				Object[] initArgs = {"kim",31};				//값 초기화
//				Person p1 = (Person)cons.newInstance(initArgs);
//				System.out.println(p1); //심각한 오류발생! 
//				//생성자 int는 못찾는다~
//			
//		}catch (Exception e){
//			e.printStackTrace();//e.printStackTrac생성시 오류를 콘솔로그에 찍어줌.
//			System.out.println("심각한 오류 발생!");
//		}
		
	}
}
