package ch08;

public class GenericMethodTest {
		//타입이 T,V로 제네릭메소드가 된다.
	public static <T,V,Z>  double makeRectangle(Point<T,V,Z> p1, Point<T,V,Z> p2, Point<T,V,Z> p3) {
		//(Number)는 int,double... 의 조상격되는 자료형. 
		double left = 	((Number)p1.getX()).doubleValue();	//Number인 부모객체로 업캐스팅
		double right = 	((Number)p1.getY()).doubleValue();	
		int zz = ((Number)p1.getZ()).intValue();
		double top = 	((Number)p2.getX()).doubleValue();	
		double bottom = ((Number)p2.getY()).doubleValue();	
		int zz1 = ((Number)p2.getZ()).intValue();
		
		double width = 	(right - left) * zz;
		double height = (bottom - top) * zz1;
		
		return width * height;
		
	}
	public static void main(String[] args) {
		
		//T = Integer, V = Double.  제네릭타입<>에는 primitive타입이 올 순 없다.
		Point<Integer, Double, Integer> p1 = new Point<>(0, 10.0, 1);	//left, right 이 시점부터 T,V가 타입이 결정.
		Point<Integer, Double, Integer> p2 = new Point<>(0, 10.0, 1);	//top, bottom
		Point<Integer, Double, Integer> p3 = new Point<>(0, 10.0, 1);	//top, bottom
		
		double rect = GenericMethodTest.<Integer, Double, Integer>makeRectangle(p1, p2, p3); //
		//double rect = makeRectangle(p1, p2); 
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(rect);
		
	}
}
