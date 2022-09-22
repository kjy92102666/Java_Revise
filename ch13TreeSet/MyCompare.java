package ch13;
import java.util.Comparator;

public class MyCompare implements Comparator<String>{
	//comparable을 구현한 객체만 뒤에 올 수 있다.

	@Override
	public int compare(String o1, String o2) { //각각 Comparable을 구현한 객체
		return o1.compareTo(o2)*-1;	//내림차순.
	}
	
	
	
	
	
	
}
