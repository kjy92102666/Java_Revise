package ch08;

public class GenericMethodTest {
		//Ÿ���� T,V�� ���׸��޼ҵ尡 �ȴ�.
	public static <T,V,Z>  double makeRectangle(Point<T,V,Z> p1, Point<T,V,Z> p2, Point<T,V,Z> p3) {
		//(Number)�� int,double... �� ����ݵǴ� �ڷ���. 
		double left = 	((Number)p1.getX()).doubleValue();	//Number�� �θ�ü�� ��ĳ����
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
		
		//T = Integer, V = Double.  ���׸�Ÿ��<>���� primitiveŸ���� �� �� ����.
		Point<Integer, Double, Integer> p1 = new Point<>(0, 10.0, 1);	//left, right �� �������� T,V�� Ÿ���� ����.
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
