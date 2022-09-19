package oop_pro3.ch02;

import java.lang.Comparable;

public class EqualsTest {
	public static void main(String[] args)  
			throws CloneNotSupportedException{
		//clone�� ������������ ��ü�� exception�� �߻��ϴ°��� ���. �ڹٴ� �������� �߱��ϴ� ���
		//clone���� ���� ���ܴ� �������� ������ ���� ������ vm���� ������.
		Student Lee = new Student(100,"100");
		Student Lee2 = Lee;
		
		System.out.println(Lee==Lee2);
		//Overriding �� �޼ҵ带 ������ ���ٰ� ���´�.
		System.out.println(Lee.hashCode()+","+Lee2.hashCode());
		
		if(Lee.equals(Lee2))
			 { System.out.println("���� ����");   }
		else { System.out.println("���� �ٸ���"); }
		
		
		
		//String�� ��ü��!, StringŬ�������� �⺻������ ������ �Ǿ� �ֱ⿡ �����ѱ���.
		if(Lee==Lee2) 
			 { System.out.println("�����ϴ� �ּҰ��� ����");	 }
		else { System.out.println("�����ϴ� �ּҰ��� �ٸ���"); }
		
		System.out.println("=============================");
		
		Student Park = new Student(100,"Lee");
		if(Park.equals(Lee2))
			 { System.out.println("���� ����"); }
		else {	System.out.println("���� �ٸ���");	}
		
		if(Park==Lee2) 
			 { System.out.println("�����ϴ� �ּҰ��� ����");	}
		else { System.out.println("�����ϴ� �ּҰ��� �ٸ���");	}
		
		
		
		Student studentLee = new Student(100, "Lee");
		Student cloneStudent = (Student)studentLee.clone(); //clone�� Object�̹Ƿ� �ٿ�ĳ����.
		if(studentLee == cloneStudent) 
			 { System.out.println("clone�� �����մϴ�."); }
		else { System.out.println("clone�� �������� �ʽ��ϴ�.");	}
		
		if(studentLee.equals(cloneStudent)) 
			 { System.out.println("clone�� �����մϴ�."); }
		else { System.out.println("clone�� �������� �ʽ��ϴ�.");	}
		

		
		
		
		//		try {
//			Student cloneStudent = (Student)studentLee.clone();
//		}catch(CloneNotSupportedException e){
//			e.printStackTrace(e.));
//		}
		
		
	}
}
