package ch01.ex;

public class StudentTest {
	public static void main(String[] args) {
		Student st = new Student("kim");
		
		st.setSubject("����", 90);
		st.setSubject("��Ȯ", 80);
		st.setSubject("����", 70);
		
		
		st.Info();
	}
}
