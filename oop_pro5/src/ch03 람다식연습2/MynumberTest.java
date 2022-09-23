package ch03;

//람다식으로 하면 함수 안에서 결과를 확인할 수 있다.
public class MynumberTest {
	public static void main(String[] args) {
		
		MyNumber myNumber = (x,y)->{
			return (x>y)?x:y;
		};
		///MyNumber myNumber = (x,y)->(x>y)?x:y;
		System.out.println(myNumber.getMax(3, 5));
	}
}
