package ch20;

public class MyThread2Test {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		MyThread2 mt2 = new MyThread2();
		Thread th1 = new Thread(mt2);
		th1.start();
		
		Thread mt22 = new Thread(new MyThread2());
		mt22.start(); 
		
		//익명 클래스 . 추상화메소드 하나밖에 없는놈을 함수안에서 할필요없이, 생략시키고 사용하는 문법.
		Runnable runnable = new Runnable() {
			public void run() {
				System.out.println("runnable 익명함수");
			}
		};	
		runnable.run();
		
		Runnable runnable2 = ()-> System.out.println("runnable 익명함수");
		runnable2.run();
		
		
		System.out.println(Thread.currentThread() + "end! ");
	}
}
