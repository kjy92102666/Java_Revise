package ch03;

//���ٽ����� �ϸ� �Լ� �ȿ��� ����� Ȯ���� �� �ִ�.
public class MynumberTest {
	public static void main(String[] args) {
		
		MyNumber myNumber = (x,y)->{
			return (x>y)?x:y;
		};
		///MyNumber myNumber = (x,y)->(x>y)?x:y;
		System.out.println(myNumber.getMax(3, 5));
	}
}
