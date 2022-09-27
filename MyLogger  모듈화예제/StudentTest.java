package MyLogger;

import ch11.MyLogger;

public class StudentTest {
	public static void main(String[] args) {
		MyLogger log  = MyLogger.getLogger();
		String name = null;//테스트하기 위한 변수
		
		try {
			Student st = new Student(name);
		}catch(StudentNameException e) {
			log.severe(e.getMessage());
		}
		
		String name1 = "kim ki k k i";
		try {
			Student st1 = new Student(name1);
		} catch (StudentNameException e) {
			// TODO Auto-generated catch block
			log.severe(e.getMessage());
		}
		
		String name2 = "kim";
		try {
			Student normalName = new Student(name2);
			normalName.getName();
		} catch (StudentNameException e) {
			// TODO Auto-generated catch block
			log.severe(e.getMessage());
		}
		
	}
}
