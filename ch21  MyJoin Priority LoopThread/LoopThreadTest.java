package ch21;

import java.io.IOException;

public class LoopThreadTest {
	public static void main(String[] args) {
		
		LoopThread threadA = new LoopThread("A");
		LoopThread threadB = new LoopThread("B");
		LoopThread threadC = new LoopThread("C");
		
		threadA.start(); //Runnable����. ��� ���ѷ�������.
		threadB.start(); //Runnable����.
		threadC.start(); //Runnable����.
		
		while(true) {
			try {
				int in = System.in.read();	//ǥ�� �Է�.
				//System.out.println((char)in); ����Ű�� �ԷµǴ°��� Ȯ���ϴ� �ҽ�
				if(in=='A') {
					threadA.setFlag(true);	//sleep �ֱ� ���� 
				}else if(in=='B') {
					threadB.setFlag(true);
				}else if(in == 'C') {
					threadC.setFlag(true);
				}else if(in == 'M'){
					//�� ���̰� ���� ���������� �ҽ�.
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
