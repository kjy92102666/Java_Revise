package ch21;

import java.io.IOException;

public class LoopThreadTest {
	public static void main(String[] args) {
		
		LoopThread threadA = new LoopThread("A");
		LoopThread threadB = new LoopThread("B");
		LoopThread threadC = new LoopThread("C");
		
		threadA.start(); //Runnable상태. 계속 무한루프상태.
		threadB.start(); //Runnable상태.
		threadC.start(); //Runnable상태.
		
		while(true) {
			try {
				int in = System.in.read();	//표준 입력.
				//System.out.println((char)in); 엔터키값 입력되는건지 확인하는 소스
				if(in=='A') {
					threadA.setFlag(true);	//sleep 주기 위해 
				}else if(in=='B') {
					threadB.setFlag(true);
				}else if(in == 'C') {
					threadC.setFlag(true);
				}else if(in == 'M'){
					//다 죽이고 구문 빠져나가는 소스.
					threadA.setFlag(true);
					threadB.setFlag(true);
					threadC.setFlag(true);
					
					break;
				}
			} catch (IOException e) {
				e.printStackTrace();
			}//
		}
	}
}
