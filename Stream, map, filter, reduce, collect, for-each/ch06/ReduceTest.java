package ch06;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class ReduceTest {
	public static void main(String[] args) {
		/*
		List<Integer> arrIntList = new ArrayList<>();
		//arraylist���鶧 upcasting�ؼ� ����� ������ �鿩����!
		arrIntList.add(1);
		arrIntList.add(2);
		arrIntList.add(3);
		arrIntList.add(4);
		arrIntList.add(5);
		
		//Optional�� ������ ������ ������ �������� ������.
		Stream<Integer> intStream = arrIntList.stream();
		Integer sum = intStream.reduce(10, (x,y)->x+y);
		System.out.println(sum);
		
		*/
		//���Ѱ���� x�� ����ְ� �ٽ� ������ �ؼ� ����ְ�...
		/*
		if(sum.isPresent()) {//sum�� �������� �ִٸ� isPresent���� true�� ���ϵȴ�?
			int result = sum.get();//sum.get()����� ���� ���� sum�� ���´�.
			//null���� �����°��� ��
			System.out.println(result);
		}*/
		
		//sum.ifPresent(s->System.out.println(s));//ifPresent �������� �ִٸ�...
		
		/*
		int ret = 0;
		sum.ifPresent(s->{//ifPresent ��ü�� Optional�̸� ���� get���� ���� �� �ִ�.
			System.out.println(s);
			
		});
		
		if(sum.isPresent()) {
			int result = sum.get();
			System.out.println(result);
		}
		
		int ret1 = sum.get();
		System.out.println(ret1);
		*/
		
		
		
		
		//--------��Ʈ������ test----------
		
		String []strArr = {"abc" , "abcd","ab", "abcd"};
		String maxLengthStr = Arrays.stream(strArr)
				.reduce("",(s1,s2)->{
					if(s1.length() > s2.length()) return s1;
					else return s2;
				});
				//if(maxLengthStr.isPresent()) {
					System.out.println(maxLengthStr);
				//}
		
					
		//.filter()�� .map()�� String�� ���Ϲ޴´�.
		String []strArr1 = {"abc" , "abcd","ab", "abcd"};
		String maxLengthStr1 = Arrays.stream(strArr1).filter(s->s.length()<=3)
				.reduce("",(s1,s2)->{
					if(s1.length() > s2.length()) return s1;
					else return s2;
				});
				//if(maxLengthStr.isPresent()) {
					System.out.println(maxLengthStr1);
		
		//�ʱⰪ�� �� �����ʰ� get()���� ���� ������,
		String []strArr2 = {"abc" , "abcd","ab", "abcd"};
		Optional<String> maxLengthStr2 = Arrays.stream(strArr2).filter(s->s.length()<=3)
				.reduce((s1,s2)->{
					if(s1.length() > s2.length()) return s1;
					else return s2;
				});
		if(maxLengthStr2.isPresent()) {
			System.out.println(maxLengthStr2.get());
		}
		
		String str = Arrays.stream(strArr2).reduce("", new CompareStr());
		System.out.println(str);
		
		List<String> strList = Arrays.stream(strArr)
				.filter(s->s.length()<=3)
				.collect(Collectors.toList());
		 
		strList.forEach(s->System.out.println(s));
	}
	
}
