package ch05;

import java.util.*;
import java.util.stream.Stream;

public class ArrayListStreamTest {
	public static void main(String[] args) {
		//업캐스팅해서 사용하는 습관을 들이자. 나중에 util생성시 리스트로 집어넣는다.
		//List<String> sList = new ArrayList<>();	
		  List<String> sList = new ArrayList<>();
	      sList.add("ki");
	      sList.add("park");
	      sList.add("jim");
		
		Stream<String> stream = sList.stream();	//sList의 stream객체를 stream으로 받는다~
		stream.forEach(s->System.out.println(s+","));	//s 갯수만큼 반복
		System.out.println();
		
		sList.stream().sorted().forEach(s->System.out.println(s+","));
		//sList에 stream에.오름차순된 요소값을.forEach해서 s->Syso(s+",")을 반복해라
		
		//중간연산에서 map-sorted 이순서로 가야 자료형변환&대입->정렬. 이 결과값 나옴.
		sList.stream().map(s->s.length()).sorted().forEach(n->System.out.println(n));
		//sList에 stream에.오름차순된 요소값을.길이로 하나씩 빼서(mapping).forEach로 (길이를 찍는 작업)을 반복해라.
		
		sList.stream().filter(s->s.length()>=3).forEach(s->System.out.println(s));
		
		System.out.println();
		
		sList.stream().filter(s->s.length()>=3)
		.sorted().map(s->s.length()).forEach(n->System.out.println(n));
	}
}



