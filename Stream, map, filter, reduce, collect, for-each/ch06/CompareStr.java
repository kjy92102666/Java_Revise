package ch06;

import java.util.function.BinaryOperator;

public class CompareStr implements BinaryOperator<String>{ //20�� �̻��� �̷��� Ŭ������ ����.

	@Override
	public String apply(String t, String u) {
		// TODO Auto-generated method stub
		if(t.length()>u.length()) {
			return t;
		}else return u;
	}	

}
