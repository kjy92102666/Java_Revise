package ex19;
//Coffee�� Decorator(�߰��� Ŭ����)

public class Milk extends Decorator{

	//�θ� �� �����ڸ� ������ �ֱ� ������, �ڽĵ� ������ �����ڸ� ���� ȣ���ؾ���.
	public Milk(Coffee coffee) {
		super(coffee);
	}
	
	//Coffee�� �����޼ҵ� x. �׳� ��ȥ�� ���°�
	public void mixing() {
		super.mixing();//�θ� ȣ���ϰڴ�!
		System.out.println("added Milk ");
	}
}
