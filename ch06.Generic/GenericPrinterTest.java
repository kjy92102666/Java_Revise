package ch06;

public class GenericPrinterTest {
	public static void main(String[] args) {
		GenericPrinter<CellPhone> phonePrinter = new GenericPrinter<>();
		phonePrinter.setThings(new CellPhone());
		System.out.println(phonePrinter);
		
		GenericPrinter<NoteBook> nb = new GenericPrinter<>();
		nb.setThings(new NoteBook());
		System.out.println(nb);
		
		
	}
}


