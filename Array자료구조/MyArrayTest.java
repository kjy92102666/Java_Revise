package ch02;

public class MyArrayTest {
	public static void main(String[] args) {
		
		MyArray ma = new MyArray(10);
		ma.addElement(1);
		ma.addElement(2);
		ma.addElement(3);
		ma.printAll();
		
		System.out.println("======================================");
		
//		ma.insertElement(2, 4);
//		ma.printAll();
		
		System.out.println("======================================");
		
		int ret = ma.removeElement(1);
//		ret = ma.removeElement(1);
//		ret = ma.removeElement(2);
		ma.printAll();
		
		if(ma.isEmpty()) {
			System.out.println("array is empty");
		}
		
		
		
	}
}
