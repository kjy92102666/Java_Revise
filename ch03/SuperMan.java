package ch03;

public class SuperMan extends Human{
	private int power;
	/*
	public SuperMan() {
		//�⺻�����ڴ� super()�θ�ü�� ����Ŵ. �θ� �⺻�����ڸ� ���� ȣ���ϰԲ�... ���� ȣ���� ���ߴ���,
		//super();
		super(2);
		power = 1;
		System.out.println("Child Default Constructor ()");
	}
	*/
	public SuperMan(int eyes) {
		super(eyes);
	}

	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	
	
	
}
