package ch07;

public class GenericPrinterTest {
	public static void main(String[] args) {
		GenericPrinter<Powder> powder = new GenericPrinter<>();
		powder.setThings(new Powder());
		powder.printing();
		
		GenericPrinter<CellPhone> ph = new GenericPrinter<>();
		// GenericPrinter<T extends Meterial>  
		// �̷��� Meterial�� ��ӹ��� Ŭ������ ��� �����ϰ� ������ �� �� �ִ�.
		//����ϱ� ���ؼ� ��ӹ޾Ƽ� ����.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
	}
}
