package ch20;
//Thread�� ��ӹ޾� run()�� ����. �� 3���� �����尡 ������ ����Ǵ� �ڵ�.

public class MyThreadTest {
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread()+"start~");	//���� �����带 ȣ��.;
		MyThread mt = new MyThread();
		mt.start();
		
		MyThread mt2 = new MyThread();
		mt2.start();
		
		//mt,mt2�� ���� �ٸ� �������� �����带 ����ϰ� �ֱ⿡ ����ڴ�� ����~
		
		System.out.println(Thread.currentThread()+"end~");
		
		//���ν����� ����>>> mt������ ����>>> mt2������ ����>>>
		//mt������ ����>>> mt2����������>>> ���ν����� ����
	}
}
