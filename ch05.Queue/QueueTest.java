package ch05;

public class QueueTest {
	public static void main(String[] args) {
		MyListQueue mlq = new MyListQueue();
		mlq.enQueue("a");
		mlq.enQueue("b");
		mlq.enQueue("c");
		mlq.enQueue("d");
		System.out.println("===================");
		mlq.printAll();
		System.out.println();
		
		System.out.println("===================");
		mlq.deQueue();
		mlq.printAll();
	}
}
