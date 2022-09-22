package ch13;

import java.util.Arrays;
import java.util.Collections;

public class BasicSort {
	public static void main(String[] args) {
		
		Integer[] arr = {1, 5, 2, 3, 4};
		Arrays.sort(arr);
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println(Arrays.toString(arr));
		//int를 내림차순 하려면, 숫자는 기본적으로 객체화(Integer) 시킨 후 진행 해야된대. 다시물어보자.
		
		String[] sArr = {"A", "C", "B", "Z"};
		Arrays.sort(sArr, Collections.reverseOrder());
		//Collections.reverseOrder() 내림차순으로...
		System.out.println(Arrays.toString(sArr));
	}
}
