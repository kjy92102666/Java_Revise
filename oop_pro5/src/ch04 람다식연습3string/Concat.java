package ch04;

public class Concat implements StringConcat{
	private String var = "";
	

	public String getVar() {
		return var;
	}
	public void setVar(String var) {
		this.var = var;
	}
	
	@Override
	public void makeString(String s1, String s2) {
		var = s1+s2;
	}
	
	
	public void showAllMember() {
		System.out.println(var);
	}
	
}
