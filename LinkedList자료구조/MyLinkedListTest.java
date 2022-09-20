package ch03;

public class MyLinkedListTest {
	public static void main(String[] args) {
		
		MyLinkedList list = new MyLinkedList();
		list.AddElement("A");
		list.AddElement("B");
		list.AddElement("C");
		
//		list.printAll();
		
		list.insertElement(1, "D");
		list.printAll();
		System.out.println();
		System.out.println("===================");
		list.removeElement(1);
		list.printAll();
/*
		list.printAll();
		System.out.println();
		System.out.println("===================");
		
		
		String str = list.getElement(1);
		System.out.println("getElement : " + str);
		list.printAll();
		System.out.println();
		System.out.println("===================");
		
		list.getNode(2);
		list.printAll();
	*/	
	}
}
