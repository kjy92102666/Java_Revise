package ch07;

public class GenericPrinterTest {
	public static void main(String[] args) {
		GenericPrinter<Powder> powder = new GenericPrinter<>();
		powder.setThings(new Powder());
		powder.printing();
		
		GenericPrinter<CellPhone> ph = new GenericPrinter<>();
		// GenericPrinter<T extends Meterial>  
		// 이렇게 Meterial을 상속받은 클래스만 사용 가능하게 제한을 둘 수 있다.
		//사용하기 위해선 상속받아서 구현.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
	}
}
