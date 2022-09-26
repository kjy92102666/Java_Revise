package ch05;

import java.util.*;
import java.util.stream.IntStream;

//람다와 연동되어 사용된다?
//스트림 : 동일한 타입에 연산을 하기 위한 객체
public class IntArrayTest {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		
		IntStream intStream = Arrays.stream(arr);//intarray를 넣었기에
		int tmpSum = intStream.sum(); //intstream이 나온다.
		//int tmpSum = Arrays.stream(arr);	//IntStream으로 변환하는 작업이 없기에 오류.
		System.out.println(tmpSum);
		
		
		IntStream intStream1 = Arrays.stream(arr);
		//Long tempCnt = intStream.count();//tream has already been operated upon or closed
		Long tempCnt = intStream1.count();	//스트림은 한 번 생성&실행 되면 재사용 x.
		System.out.println(tempCnt);
		int sumVal = Arrays.stream(arr).sum();
		
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		//중간연산자 .map()함수로 1개씩 빼낸 후(Object로 뺴내와짐.) 
		//n(int로 정의된 1,2,3,4,5)은 그대로 n을 리턴하고 자료형을 int로 바꿔라~. sum은 최종연산자.
		int sumTT = list.stream().mapToInt(n->n).sum();	//map은 list에서 요소를 한개씩 빼내온 값을 ()안에 연산 후 int로 리턴.
		System.out.println(sumTT);
		
	}
	
	//arrayList는 list를 imp..하니까 사용가능. 부모타입으로 파라미터를 가지고 있기 때문에
	//, 타입 하나로 다 만들어 사용.
	public static void setList(List<Integer> list) {
		
	}
	
	
	
	/*
	int test = tmpSum;
	test= (int) intStream1.count();
	System.out.println(test);	//stream has already been operated upon or closed
	*/
	
	
//	int sumVal = Arrays.stream(arr).sum();
//	System.out.println(sumVal);
//	
//	long count = Arrays.stream(arr).count();
//	System.out.println(count);
	
}
