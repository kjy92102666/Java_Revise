package ch01;

public class OutClass {//�Ϲ� �ܺ�Ŭ����.
	
	private int num = 10;
	private final static int num1 = 10;
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass();
	}
	
	//innerŬ������ �ܺΰ� ������ �Ŀ� ���ΰ� �����ȴ�.
	public class InClass {//�ν��Ͻ� ����Ŭ����
		int inNum = 10;
		//num1=10; ���ο��� ���ٺҰ�.
		
		public void inTest() { //inŬ������ ���ο����� ���� ������ �������
			//static int i=10; //����Ŭ�������� ������ �ȵǴµ� ����ƽ�̶�� �ǰڳ�?
			System.out.println("Out class num : " + num);
			System.out.println("In class inNum : " + inNum);
		}
	}
	
	
	public void usingInClass() {
		inClass.inTest();
		inClass.inNum = 5;// ���ο��� ���� ������ �����ϴ�~
	}
	
}
