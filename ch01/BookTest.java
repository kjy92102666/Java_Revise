package oop_pro3;

public class BookTest {
	public static void main(String[] args) {
		
		Book book = new Book("���̾�", "�켼");
		System.out.println(book);
		
		String str1 = new String("kim");
		String str2 = new String("kim");
		
		if(str1.equals(str2)) {
			System.out.println("������ �����Դϴ�.");
		}else {
			System.out.println("�������� ���� �����Դϴ�.");
		}
		//equals�� �⺻������ �ּҰ��� �������� ���� ���Ѵ�.
		
		int i=1;
		int j=2;
		
		if(str1 == str2) {
			System.out.println("���� ����.");
		}else {
			System.out.println("�ٸ� ����.");
		}
		//��ü�� ���� ���� �Ǿ��� ������ �����ϴ� �ּҰ��� �ٸ��Ƿ� "�ٸ� ����" ���.
		
		
		
		
	}
}
