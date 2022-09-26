package ch06;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class ReduceTest {
	public static void main(String[] args) {
		/*
		List<Integer> arrIntList = new ArrayList<>();
		//arraylist만들때 upcasting해서 만드는 습관을 들여놓자!
		arrIntList.add(1);
		arrIntList.add(2);
		arrIntList.add(3);
		arrIntList.add(4);
		arrIntList.add(5);
		
		//Optional이 나오면 사전에 오류를 막기위해 정의함.
		Stream<Integer> intStream = arrIntList.stream();
		Integer sum = intStream.reduce(10, (x,y)->x+y);
		System.out.println(sum);
		
		*/
		//더한결과를 x에 집어넣고 다시 덧셈을 해서 집어넣고...
		/*
		if(sum.isPresent()) {//sum에 실제값이 있다면 isPresent에는 true가 리턴된다?
			int result = sum.get();//sum.get()실행시 실제 값이 sum에 들어온다.
			//null값이 들어오는것을 막
			System.out.println(result);
		}*/
		
		//sum.ifPresent(s->System.out.println(s));//ifPresent 실제값이 있다면...
		
		/*
		int ret = 0;
		sum.ifPresent(s->{//ifPresent 자체가 Optional이면 값을 get없이 꺼낼 수 있다.
			System.out.println(s);
			
		});
		
		if(sum.isPresent()) {
			int result = sum.get();
			System.out.println(result);
		}
		
		int ret1 = sum.get();
		System.out.println(ret1);
		*/
		
		
		
		
		//--------스트링으로 test----------
		
		String []strArr = {"abc" , "abcd","ab", "abcd"};
		String maxLengthStr = Arrays.stream(strArr)
				.reduce("",(s1,s2)->{
					if(s1.length() > s2.length()) return s1;
					else return s2;
				});
				//if(maxLengthStr.isPresent()) {
					System.out.println(maxLengthStr);
				//}
		
					
		//.filter()나 .map()은 String을 리턴받는다.
		String []strArr1 = {"abc" , "abcd","ab", "abcd"};
		String maxLengthStr1 = Arrays.stream(strArr1).filter(s->s.length()<=3)
				.reduce("",(s1,s2)->{
					if(s1.length() > s2.length()) return s1;
					else return s2;
				});
				//if(maxLengthStr.isPresent()) {
					System.out.println(maxLengthStr1);
		
		//초기값을 잘 주지않고 get()으로 값을 받을때,
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
