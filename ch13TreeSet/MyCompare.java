package ch13;
import java.util.Comparator;

public class MyCompare implements Comparator<String>{
	//comparable�� ������ ��ü�� �ڿ� �� �� �ִ�.

	@Override
	public int compare(String o1, String o2) { //���� Comparable�� ������ ��ü
		return o1.compareTo(o2)*-1;	//��������.
	}
	
	
	
	
	
	
}
