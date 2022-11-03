package Sync;

public class SynchronizedEx {

	public static void main(String[] args) {
		SharedBoard board = new SharedBoard(); // 집계판 공유 데이터 생성
		
		//스레드 생성 시 집계판의 주소를 아려준다. 두 스레드는 집계판에 동시에 접
		Thread th1 = new StudentThread("kitae",board);//"kitae"이름의 스레드 생성
		Thread th2 = new StudentThread("hyosoo", board); // "hyosoo" 이름의 스레드 생성
		
		// 두 스레드를 실행시킨다.
		th1.start();
		th2.start();
	}
}