package ch08;

//���׸�Ÿ���� ����, Ÿ���� �������� �ʾұ⿡ �Ʒ����� Ŭ���������� ������ �Ұ����ϴ�.
public class Point <T, V, Z>{//T,V,Z Ÿ���� 3�� �ްڴ�~. 
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
