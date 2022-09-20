package ch03;

public class MyLinkedList {
	
	private MyListNode head;
	private int count;
	
	public MyLinkedList() {
		head = null;
		count = 0;
	}
	
	public void AddElement(String data) {	//�ǵڿ� �ִ°�...
		
		MyListNode newNode; //����
		if(head == null) { //ó������Ҷ�,
			newNode = new MyListNode(data);
			head = newNode;
		}else {
			newNode = new MyListNode(data);
			MyListNode temp = head;		//A==head==temp
			//temp.next�� null��x,
			while(temp.next != null){//null�� ���°��� �� ���̰ų� �� �������̰ų�.
				temp = temp.next;	//A->head
			}
			temp.next = newNode;//A->D.
		}
		count++;
		
	}
	
	//LinkedList�� ������ ó������ ã�ƾ��Ѵ�.
	public void insertElement(int position, String data) {
		MyListNode tempNode = head;
		MyListNode newNode = new MyListNode(data);
		
		if( position == 0) {	//head�� ����Ŵ.
			newNode.next = head;	//head�� newNode�� �ٲ�
			head = newNode;		//head�� �ٲ����� �ص�μ���.
		}else {
			MyListNode preNode = null;
			for(int i=0; i<position; i++) {
				preNode = tempNode;		//tempNode==head
				tempNode = tempNode.next; //position���� head�� ��� ã�ư�.
				//tempNode�� ����position
				//������� ������带 ��� �ٲ㰣��. �����Ǳ���
			}
			
			newNode.next = preNode.next;
			preNode.next = newNode;
		}
	}
	
	
	public MyListNode removeElement(int position) {
		MyListNode tempNode = head;
		
		if( position == 0) {	//�ֻ�ܳ�带 ������.
			//tempNode.next = head;	
			head = tempNode;	
		}else {
			MyListNode preNode = null;
			for(int i=0; i<position; i++) {//�ش� ���� ���� tempNode, 
				preNode = tempNode;	
				tempNode = tempNode.next; //tempNode == D
			}
			preNode.next = tempNode.next;
		}
		count--;
		return tempNode;
	}
	
	//���� ��������
	public String getElement(int position) {
		MyListNode tempNode = head;
		
		if(position == 0) {
			return head.getData();
		}else {
			for(int i=0; i<position; i++) {
				tempNode = tempNode.next;
			}
			return tempNode.getData();
		}

	}
	
	
	//���� �������� position�� node �����ϴ� �Լ�
		public MyListNode getNode(int position) {
			MyListNode tempNode = head;
			
			if(position == 0) {
				return head;
			}else {
				for(int i=0; i<position; i++) {
					tempNode = tempNode.next;
				}
				return tempNode;
			}

		}
	
	
	
	public void printAll() {
		MyListNode temp = head;
		while(temp != null) {
			
			System.out.print(temp.getData());
			temp = temp.next;
			if(temp != null) {
				System.out.print("->");
			}
		}
	}
}
