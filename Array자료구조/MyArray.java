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
	
	public void insertElement(int position, int num) {	//posiotn:바뀔 인덱스의 위치.
		for(int i = count-1; i >= position; i--) {	//i는 맨마지막 인덱스.
			intArr[i+1] = intArr[i];  //position위치까지 한칸씩 밀려남.

			System.out.println("count : "+  count);
		}
		intArr[position] = num;
		count++;
		
	}//앞에서 들어가면 temp에 짚어넣고 빼고를 반복해야되기에 위 코드처럼 맨 뒤에 인덱스에서 바꾸는게 효율이 좋다.

	
	public int removeElement(int position) {
		int ret = intArr[position];
		
			for(int i=position; i<count; i++) { 
				intArr[i] = intArr[i+1];
			}
			
			count--;	//이 구문 제거시 0출력...?
		return ret;
	}
	
	
	
	//ArrayList 구현하는 로직.
	public int getElement(int position) {
		return intArr[position];
		
	}
	public int getSize() {
		return count;
	}
	public boolean isEmpty() {
		if(count == 0) return true;	//count가 0이면 값이 없다~
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
