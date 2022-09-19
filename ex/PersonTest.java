package oop_pro3.ex;

import java.lang.reflect.Constructor;

public class PersonTest {
	public static void main(String[] args) throws Exception {
		//��ü ������� 1. �����ڷ� �����ϱ�.
		Person person = new Person("Lee", 18); //�̹� �ڹ� vm�� �ε�Ǿ��ִ�(������ �Ҵ�?), new������ ���� �޸� �Ҵ�.
		System.out.println(person);
		
		//��ü ������� 2-1.class.forName("Ǯ��Ű����"); db����̹�or����Ʈ����̹��� �����Ҷ�, ����Ҷ� ����&ȣ��Ǵ� ����� ����.
		
			
		Class c1 = Class.forName("oop_pro3.ex.Person");  //�� �ڵ带 ������ ������ vm�� �ε����� ���� �ʴ´�. 
		//��� "oop_pro3.ex.Person"���ڵ带 ������ stack���� ����� �ֵ��� vm�� static �ε��Ų��~
		//c1�� ���ؼ� ������ �Լ��� ã�´�.
		Class[] params = {String.class, Integer.class};//Ÿ�� ����
		Constructor cons = c1.getConstructor(params);  //
		Object[] initArgs = {"kim",31};	
		
		Person p1 = (Person)cons.newInstance(initArgs);
		System.out.println(p1);


		
			//��ü ������� 2-2
		
//		try {//full ��Ű���� �� ������...
//				//'oop_pro3.ex.'�� ��ġ�� �ִ� PersonŬ������ �����ض�~
//				Class c1 = Class.forName("oop_pro3.ex.Person");  //�� �ڵ带 ������ ������ vm�� �ε����� ���� �ʴ´�.
//				//PersonŬ���� �����ڸ� �ҷ����µ� �ڷ�����~
//				Class[] params = {String.class, Integer.class};//Ÿ�� ����
//				Constructor cons = c1.getConstructor(params);  //���ǵ� Ÿ���� ��������
//				Object[] initArgs = {"kim",31};				//�� �ʱ�ȭ
//				Person p1 = (Person)cons.newInstance(initArgs);
//				System.out.println(p1); //�ɰ��� �����߻�! 
//				//������ int�� ��ã�´�~
//			
//		}catch (Exception e){
//			e.printStackTrace();//e.printStackTrac������ ������ �ַܼα׿� �����.
//			System.out.println("�ɰ��� ���� �߻�!");
//		}
		
	}
}
