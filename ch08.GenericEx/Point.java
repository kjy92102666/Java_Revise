package ch08;

//제네릭타입의 단점, 타입이 정해지지 않았기에 아래같은 클래스에서는 연산이 불가능하다.
public class Point <T, V, Z>{//T,V,Z 타입을 3개 받겠다~. 
	T x;
	V y;
	Z z;
	
	public Point(T x, V y, Z z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public T getX() {
		return x;
	}
	
	public V getY() {
		return y;
	}
	
	public Z getZ() {
		return z;
	}
	
}
