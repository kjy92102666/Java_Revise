package ch21;

public class PriorityTest {
	public static void main(String[] args) {
		
		PriorityThread p1 = new PriorityThread();
		PriorityThread p2 = new PriorityThread();
		PriorityThread p3 = new PriorityThread();
		
		p1.setPriority(Thread.MAX_PRIORITY);	
		p3.setPriority(Thread.MIN_PRIORITY);
		//�켱������ �ִ�,�ּҷ� ������ �Ҵ�Ǵ°� �ý��ۿ��� �Ҵ�Ǳ⿡ �߱�����
		
		p1.start(); //Runnable���·� ����
		p2.start(); //Runnable���·� ����
		p3.start(); //Runnable���·� ����
	}
}



Thread[main,5,main]start 
sum  : [1784293664] Priority : 5 end
Thread[main,5,main]start 
sum  : [1784293664] Priority : 5 end
Thread[main,5,main]start 
sum  : [1784293664] Priority : 5 end


