package ch13;

import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		//MyCompare.java������ ȣ���ϰԵȴ�. ���̺���.
		TreeSet<String> treeSet = new TreeSet<>(new MyCompare());
		//new TreeSet<>(new MyCompare()); �ϸ� ������������ ���ĵȴ�. 
		//TreeSet�� MyCompare�Լ��� ȣ���Ѵ�.
		
		treeSet.add("kim");
		treeSet.add("park");
		treeSet.add("dae");
		
		for(String str : treeSet) {
			System.out.println(str);
		}
		
		//String(CompareTo)���� �⺻������ ���������� �����ϰ��ִ�.
		
		//Iterator�� �ۼ��غ���~
		
	}
}
