package ch21;

public class LoopThread extends Thread{
	
	private boolean flag;	//boolean타입의 default값이 false.
	
	//Thread에 이름을 넣고 싶을때, 부모에 넣으면 된다.
	public LoopThread(String name) {
		super(name);		//LoopThread 생성자가 생성될 떄 super를 통해서 setName()된다.
	}
	
	public void run() {
		while(!flag) {	//flag!==false
			try {
				sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(getName() + " end");
	}
	
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
}
