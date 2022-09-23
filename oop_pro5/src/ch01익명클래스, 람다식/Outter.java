package ch01;

public class Outter {
	private int outNum = 100;
	
	public void getRunnanble(int i) {
		   int num = 100;
		   
//		    new Runnable() {                  //익명 메서드
//		      @Override
//		      public void run() {//익명 내부 클래스
//		         System.out.println("i="+i);
//		         System.out.println("num="+num);  //run()안에 메소드는 메인쓰레드와 별개로 돌아간다.
//		      }
//		   }.run();  //비동기적으로 실행될때 사용.  
		   
		   
		   //람다식으로 변환.
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
		    new Runnable() {                  //익명 메서드
			 //class MyRunnable implements Runnable {
				//class MyRunnable implements는 의미가없다. 내부 클래스이므로.
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