package ch05;

import java.util.*;
import java.util.stream.Stream;

public class ArrayListStreamTest {
	public static void main(String[] args) {
		//��ĳ�����ؼ� ����ϴ� ������ ������. ���߿� util������ ����Ʈ�� ����ִ´�.
		//List<String> sList = new ArrayList<>();	
		  List<String> sList = new ArrayList<>();
	      sList.add("ki");
	      sList.add("park");
	      sList.add("jim");
		
		Stream<String> stream = sList.stream();	//sList�� stream��ü�� stream���� �޴´�~
		stream.forEach(s->System.out.println(s+","));	//s ������ŭ �ݺ�
		System.out.println();
		
		sList.stream().sorted().forEach(s->System.out.println(s+","));
		//sList�� stream��.���������� ��Ұ���.forEach�ؼ� s->Syso(s+",")�� �ݺ��ض�
		
		//�߰����꿡�� map-sorted �̼����� ���� �ڷ�����ȯ&����->����. �� ����� ����.
		sList.stream().map(s->s.length()).sorted().forEach(n->System.out.println(n));
		//sList�� stream��.���������� ��Ұ���.���̷� �ϳ��� ����(mapping).forEach�� (���̸� ��� �۾�)�� �ݺ��ض�.
		
		sList.stream().filter(s->s.length()>=3).forEach(s->System.out.println(s));
		
		System.out.println();
		
		sList.stream().filter(s->s.length()>=3)
		.sorted().map(s->s.length()).forEach(n->System.out.println(n));
	}
}



