package ch02;

public class AddTest {
	public static void main(String[] args) {

		Add addFP = (x,y)->x+y;	//±¸ÇöºÎ. == (x,y)->{return x+y;};
		int ret = addFP.add(1, 2);
		System.out.println(ret);
		
		
	}
}
