package ch05;

import ch03.MyLinkedList;
import ch03.MyListNode;

//상속받은 MyLinkedList클래스에서 printAll()함수를 선언했기 때문에 @Over..에 뜨지않.
public class MyListQueue extends MyLinkedList implements IQueue{
	
	MyListNode front;	//==head
	MyListNode rear;
	
	//멤버변수에 선언하고,
	public MyListQueue() {	//생성자에 자기 멤버를 초기화. 비지니스로직은 x
		front = null;
		rear = null;
	}
	
	@Override//IQueue인터페이스에서 추상메소드로 선언되어 있지만,(1
	public void enQueue(String data) {	//데이터를 집어넣는 함수.
		MyListNode newNode;
		if(isEmpty()) {	//queue공간에 비어있다면,
			newNode = AddElement(data);
			front = newNode;
			rear = newNode;
		}else {
			newNode = AddElement(data);
			//System.out.println(front);
			rear = newNode;
		}
		
	}

	//annotation을 생략해도 시스템적으론 붙여진 걸로 인식.(2
	public String deQueue() {	//데이터를 뽑아내는 함수.
		String data = front.getData();
		front = front.next;
		//deQueue니까 맨앞에껄 뻇으니, 없어져야 하니 없어지는 요소의 다음요소를 가리켜 front에 넣어준다.
		
		if(front == null) {
			rear = null;//뺄것도 없고, 넣을것도 없는 null 상태.
		}
		return data;	//맨 앞에 요소를 뺴온다.==head
	}
	
	
	@Override
	public void printAll() {
		
		MyListNode temp = front;	//front == head
		
		while(temp!=null) {
			
			System.out.print(temp.getData());
			temp = temp.next;
			if(temp != null) {
				System.out.print("->");
			}
		}
	}
	
	
	
	
	
	

	
}
