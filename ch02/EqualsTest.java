package oop_pro3.ch02;

import java.lang.Comparable;

public class EqualsTest {
	public static void main(String[] args)  
			throws CloneNotSupportedException{
		//clone에 구현되지않은 객체나 exception이 발생하는것을 우려. 자바는 안정성을 추구하는 언어
		//clone에서 던진 예외는 메인으로 던지고 받은 메인은 vm으로 던진다.
		Student Lee = new Student(100,"100");
		Student Lee2 = Lee;
		
		System.out.println(Lee==Lee2);
		//Overriding 된 메소드를 지워도 같다고 나온다.
		System.out.println(Lee.hashCode()+","+Lee2.hashCode());
		
		if(Lee.equals(Lee2))
			 { System.out.println("값이 같다");   }
		else { System.out.println("값이 다르다"); }
		
		
		
		//String도 객체다!, String클래스에서 기본적으로 구현이 되어 있기에 가능한구문.
		if(Lee==Lee2) 
			 { System.out.println("참조하는 주소값이 같다");	 }
		else { System.out.println("참조하는 주소값이 다르다"); }
		
		System.out.println("=============================");
		
		Student Park = new Student(100,"Lee");
		if(Park.equals(Lee2))
			 { System.out.println("값이 같다"); }
		else {	System.out.println("값이 다르다");	}
		
		if(Park==Lee2) 
			 { System.out.println("참조하는 주소값이 같다");	}
		else { System.out.println("참조하는 주소값이 다르다");	}
		
		
		
		Student studentLee = new Student(100, "Lee");
		Student cloneStudent = (Student)studentLee.clone(); //clone은 Object이므로 다운캐스팅.
		if(studentLee == cloneStudent) 
			 { System.out.println("clone과 동일합니다."); }
		else { System.out.println("clone과 동일하지 않습니다.");	}
		
		if(studentLee.equals(cloneStudent)) 
			 { System.out.println("clone과 동일합니다."); }
		else { System.out.println("clone과 동일하지 않습니다.");	}
		

		
		
		
		//		try {
//			Student cloneStudent = (Student)studentLee.clone();
//		}catch(CloneNotSupportedException e){
//			e.printStackTrace(e.));
//		}
		
		
	}
}
