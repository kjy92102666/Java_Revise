package ch01.ex;

public class StudentTest {
	public static void main(String[] args) {
		Student st = new Student("kim");
		
		st.setSubject("수학", 90);
		st.setSubject("수확", 80);
		st.setSubject("양학", 70);
		
		
		st.Info();
	}
}
