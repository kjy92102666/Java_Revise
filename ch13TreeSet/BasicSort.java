package ch13;

import java.util.Arrays;
import java.util.Collections;

public class BasicSort {
	public static void main(String[] args) {
		
		Integer[] arr = {1, 5, 2, 3, 4};
		Arrays.sort(arr);
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println(Arrays.toString(arr));
		//int�� �������� �Ϸ���, ���ڴ� �⺻������ ��üȭ(Integer) ��Ų �� ���� �ؾߵȴ�. �ٽù����.
		
		String[] sArr = {"A", "C", "B", "Z"};
		Arrays.sort(sArr, Collections.reverseOrder());
		//Collections.reverseOrder() ������������...
		System.out.println(Arrays.toString(sArr));
	}
}
