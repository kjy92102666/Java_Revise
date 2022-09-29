package decoEx;

public class ComputerTest {
	public static void main(String[] args) {
		
//		Computer cpu = new Ram();
//		cpu.Execution();
		
		Line line = new Line(new Ram());
		line.Execution();
		
		
		Wrap wrap = new Wrap(new Line(new Ram()));
		wrap.Execution();
	}
}
