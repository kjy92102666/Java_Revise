package ch13;

import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		//MyCompare.java파일을 호출하게된다. 같이보기.
		TreeSet<String> treeSet = new TreeSet<>(new MyCompare());
		//new TreeSet<>(new MyCompare()); 하면 오름차순으로 정렬된다. 
		//TreeSet이 MyCompare함수를 호출한다.
		
		treeSet.add("kim");
		treeSet.add("park");
		treeSet.add("dae");
		
		for(String str : treeSet) {
			System.out.println(str);
		}
		
		//String(CompareTo)에는 기본적으로 오름차순을 정의하고있다.
		
		//Iterator로 작성해보기~
		
	}
}
