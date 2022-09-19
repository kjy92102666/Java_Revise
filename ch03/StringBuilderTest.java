package oop_pro3.ch03;

public class StringBuilderTest {
	public static void main(String[] args) {
		
		String java = new String("java");
		String android = "android";
		
		StringBuilder stringBuilder = new StringBuilder("java");
		stringBuilder.append(java);	//append �߰��ȴ�. ���ڿ���
		System.out.println(stringBuilder.hashCode());
		stringBuilder.append(android);
		System.out.println(stringBuilder.hashCode());
		System.out.println(stringBuilder);
		//�ּҰ��� �Ȱ���. == ���� �޸𸮰����� ��� �����ִٴ� ���� ����.
		
		
		//StringBuilder. Ŭ���� �������� ���� �ϳ��ϳ� ���Ҷ� ����. Ÿ Ŭ�������� ���û�밡��.
		//���� ��������. == �߸��� ���� �Էµ� �� �ִ�.
		StringBuilder stringBuilder1 = new StringBuilder();
		stringBuilder1.append(java);
		System.out.println(stringBuilder1.hashCode());
		stringBuilder1.append(android);
		System.out.println(stringBuilder1.hashCode());
		
		String result = stringBuilder1.toString();//�ٸ� ������ �����ϴ� �� �ű涧�� toString()���.
		System.out.println(result);
		System.out.println(stringBuilder1.toString());//toString �����ǵ� ����
		
		//StringBuffer. StringBuffer����(���������) �ϳ� �������� ���� �ٸ������忡�� ���� �����Ҷ� ���.
		//StringBuilder���� �� ���� ����. �ٸ� �������� ��ø�� �������� ������ġ�� ����.
		//ex. aŬ�������� ��������� �����ؼ� ����, �ٸ������ bŬ�������� �����ϸ� �������̳� ���� �ɾ��ش�~ ��ó���.
		StringBuffer strBuffer = new StringBuffer();
		strBuffer.append(java);
		strBuffer.append(android);
		System.out.println(strBuffer);
		
		
		System.out.println(java.hashCode());
		System.out.println(android.hashCode());
		
		java = java+android;
		
		
		System.out.println(java.hashCode());
	}
}
