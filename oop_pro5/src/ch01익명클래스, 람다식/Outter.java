package ch01;

public class Outter {
	private int outNum = 100;
	
	public void getRunnanble(int i) {
		   int num = 100;
		   
//		    new Runnable() {                  //�͸� �޼���
//		      @Override
//		      public void run() {//�͸� ���� Ŭ����
//		         System.out.println("i="+i);
//		         System.out.println("num="+num);  //run()�ȿ� �޼ҵ�� ���ξ������ ������ ���ư���.
//		      }
//		   }.run();  //�񵿱������� ����ɶ� ���.  
		   
		   
		   //���ٽ����� ��ȯ.
		   Runnable runnable = ()->{
			   System.out.println("i="+i);
			   System.out.println("num="+num);
		   };
		   runnable.run();

		   
	}
}

/*
package ch01;

public class Outter {
	private int outNum = 100;
	
	public void getRunnanble(int i) {
		   int num = 100;
		   
		   //class MyRunnable implements Runnable{
		    new Runnable() {                  //�͸� �޼���
			 //class MyRunnable implements Runnable {
				//class MyRunnable implements�� �ǹ̰�����. ���� Ŭ�����̹Ƿ�.
		      @Override
		      public void run() {
		         // TODO Auto-generated method stub
		         System.out.println("i="+1);
		         System.out.println("num="+num);  
		      }
		         
		   }.run();;            
		//   return new MyRunnable();
		}
}


 */