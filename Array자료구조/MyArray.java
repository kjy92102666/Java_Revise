package ch02;

public class MyArray {
	
	private int[] intArr;
	private int count;
	private int arraySize;
	
	
	public MyArray(int arraySize) {
		this.arraySize = arraySize;
		count = 0;
		intArr = new int[this.arraySize];
	}
	
	public void addElement(int num) {
		if(count>=arraySize) {
			System.out.println("not enough memory");
			return;
		}
		intArr[count++] = num;

		System.out.println("count : "+  count);
	}
	
	public void insertElement(int position, int num) {	//posiotn:�ٲ� �ε����� ��ġ.
		for(int i = count-1; i >= position; i--) {	//i�� �Ǹ����� �ε���.
			intArr[i+1] = intArr[i];  //position��ġ���� ��ĭ�� �з���.

			System.out.println("count : "+  count);
		}
		intArr[position] = num;
		count++;
		
	}//�տ��� ���� temp�� ¤��ְ� ���� �ݺ��ؾߵǱ⿡ �� �ڵ�ó�� �� �ڿ� �ε������� �ٲٴ°� ȿ���� ����.

	
	public int removeElement(int position) {
		int ret = intArr[position];
		
			for(int i=position; i<count; i++) { 
				intArr[i] = intArr[i+1];
			}
			
			count--;	//�� ���� ���Ž� 0���...?
		return ret;
	}
	
	
	
	//ArrayList �����ϴ� ����.
	public int getElement(int position) {
		return intArr[position];
		
	}
	public int getSize() {
		return count;
	}
	public boolean isEmpty() {
		if(count == 0) return true;	//count�� 0�̸� ���� ����~
		else return false;
	}
	
	
	
	
	public void printAll() {
		for(int i=0; i<count; i++) {
			System.out.println(intArr[i]);
		}
	}
	
	
	public static void main(String[] args) {
		
	}
}
