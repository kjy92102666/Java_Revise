package ch09;

public class ComputerTest {
	public static void main(String[] args) {
		
		Computer cpu = new DeskTop();
		cpu.display();
		cpu.typing();
		cpu.turnOff();
		
		Computer Note = new MyNoteBook();
		Note.display();
		Note.typing();
		Note.turnOn();
	}
	
}
