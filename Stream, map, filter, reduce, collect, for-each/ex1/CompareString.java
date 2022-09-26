package ex1;
import java.util.function.BinaryOperator;

public class CompareString implements BinaryOperator<String>{
	
	@Override
	public String apply(String t, String u) {
		if(t.length()>u.length()){
			return t;
		}else return u;
	}
}
