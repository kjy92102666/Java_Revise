package ch11;

public abstract interface Calc { //abstract ��������.
	
	float PI = 3.14f;//public static final����
	int ERROR = -1;
	
	
	abstract int add(int num1, int num2);
	int sub(int num1, int num2);
	int mul(int num1, int num2);
	int div(int num1, int num2);
	
	
}
