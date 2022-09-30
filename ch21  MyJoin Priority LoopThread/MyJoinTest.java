package ch21;

public class MyJoinTest {
	public static void main(String[] args) {
		MyJoin j1 = new MyJoin(1, 50);
		MyJoin j2 = new MyJoin(51,100);
		
		Thread n1 = new Thread(j1);
		Thread n2 = new Thread(j2);
		
		n1.start();
		n2.start();
		
		/*//Total is >>>>> 0. main쓰레드가 호출되는 시점에 n1,n2가 각자 끝나기도 전에 시작됨. CPU할당에 따라다름.
		int total = j1.getSum() + j2.getSum();
		System.out.println("Total is >>>>>" + total);
		
		*/
		try {//메인쓰레드가 try에서 만나면 n1 Thread가 다 실행될 때 가지 waitting.
			n1.join();
			n2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int total = j1.getSum() + j2.getSum();
		System.out.println("Total is >>>>>" + total);
		
		//run()블럭이 끝나면 G.C가 자동으로 Dead상태 시켜줌.
	}
}
