package ex2;

import java.util.function.BinaryOperator;

public class Comparevar implements BinaryOperator<String>{

	@Override
	public String apply(String t, String u) {
		if(t.length()>u.length()) {
			return t;
		}
		return u;
	}
	
}
