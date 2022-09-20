package ch03;

public class MyLinkedList {
	
	private MyListNode head;
	private int count;
	
	public MyLinkedList() {
		head = null;
		count = 0;
	}
	
	public void AddElement(String data) {	//맨뒤에 넣는거...
		
		MyListNode newNode; //선언만
		if(head == null) { //처음사용할때,
			newNode = new MyListNode(data);
			head = newNode;
		}else {
			newNode = new MyListNode(data);
			MyListNode temp = head;		//A==head==temp
			//temp.next가 null이x,
			while(temp.next != null){//null이 오는경우는 맨 앞이거나 맨 마지막이거나.
				temp = temp.next;	//A->head
			}
			temp.next = newNode;//A->D.
		}
		count++;
		
	}
	
	//LinkedList는 뭐든지 처음부터 찾아야한다.
	public void insertElement(int position, String data) {
		MyListNode tempNode = head;
		MyListNode newNode = new MyListNode(data);
		
		if( position == 0) {	//head를 가리킴.
			newNode.next = head;	//head가 newNode로 바뀜
			head = newNode;		//head가 바꼈으니 해드로선언.
		}else {
			MyListNode preNode = null;
			for(int i=0; i<position; i++) {
				preNode = tempNode;		//tempNode==head
				tempNode = tempNode.next; //position까지 head를 계속 찾아감.
				//tempNode는 실제position
				//현재노드와 프리노드를 계속 바꿔간다. 포지션까지
			}
			
			newNode.next = preNode.next;
			preNode.next = newNode;
		}
	}
	
	
	public MyListNode removeElement(int position) {
		MyListNode tempNode = head;
		
		if( position == 0) {	//최상단노드를 날린다.
			//tempNode.next = head;	
			head = tempNode;	
		}else {
			MyListNode preNode = null;
			for(int i=0; i<position; i++) {//해당 실제 노드는 tempNode, 
				preNode = tempNode;	
				tempNode = tempNode.next; //tempNode == D
			}
			preNode.next = tempNode.next;
		}
		count--;
		return tempNode;
	}
	
	//값을 가져오는
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
	
	
	//값을 가져오는 position의 node 리턴하는 함수
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
