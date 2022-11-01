스레드 (일종의 응용프로그램 조각.).
 - 사용자가 작성한 코드, JVM에 의해 스케줄링되어 실행되는단위   
 - 4mips : 초당 4밀리언스?
 멀티태스킹 : 하나의 응용프로그램이 여러 개의 작업을 동시에 처리.(워낙 빠르게 조각내서 처리하기에, 동시...급으로 작동되는것.)
Thread_LifeCycle
 yield() : cpu를 아예 포기하고 벗어남. sleep() : cpu를 포기하고 잠시 멈춤.
 
Thread 사용방법
1. 상속 extends Thread.(run())  
2. Implements Runnable.(run())
 - 다중 상속이 가능함에 2번방법을 사용하자~
 - TimerThread runable = new TimerThread(timerLabel);
			Thread th = new Thread(runable);
			//이렇게 2개 나뉘어서 하는 이유를 생각하자. 인터페이스~
		-  Thread th = new Thread(this);	//this로 가리키면서 처리하는방법도 있.
Run() 메소드가 종료하면 스레드는 종료한다.
 스레드가 계속 살아있게 하려면 루프.![[Thread_LifeCycle.png]]