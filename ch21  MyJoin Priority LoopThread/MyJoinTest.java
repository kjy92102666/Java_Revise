package ch21;

public class MyJoinTest {
	public static void main(String[] args) {
		MyJoin j1 = new MyJoin(1, 50);
		MyJoin j2 = new MyJoin(51,100);
		
		Thread n1 = new Thread(j1);
		Thread n2 = new Thread(j2);
		
		n1.start();
		n2.start();
		
		/*//Total is >>>>> 0. main�����尡 ȣ��Ǵ� ������ n1,n2�� ���� �����⵵ ���� ���۵�. CPU�Ҵ翡 ����ٸ�.
		int total = j1.getSum() + j2.getSum();
		System.out.println("Total is >>>>>" + total);
		
		*/
		try {//���ξ����尡 try���� ������ n1 Thread�� �� ����� �� ���� waitting.
			n1.join();
			n2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int total = j1.getSum() + j2.getSum();
		System.out.println("Total is >>>>>" + total);
		
		//run()���� ������ G.C�� �ڵ����� Dead���� ������.
	}
}
