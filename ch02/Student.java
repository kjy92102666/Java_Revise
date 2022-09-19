package oop_pro3.ch02;

//equals, hashCode예제
public class Student implements Cloneable{
	
	private int studentID;
	private String studentName;
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}
	
	
	


	//hashCode,equals,equals Object에 포함되어있다,
	//"내 마음대로 수정을 하겠다."-> 반드시 오버라이딩해야한다. 객체의 정보를 찍기위함.
	//객체를 hash함수에 넣으면 객체의 주소를 리턴하는 함수. 
	@Override
	public int hashCode() {
		return studentID;
	}
	
	//studentID로 객체 비교를 하는 메서드. 
	//모든객체는 Object를 상속받기 때문에 상속 받을 수 있다.
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std= (Student)obj; //Object->Student로 다운캐스팅.
			if(this.studentID == std.studentID) {//다운캐스팅 안하면 참조안됨.
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		return studentID + "," + studentName;
	}
	
	public int getStudentID() {
		return studentID;
	}
	
	public void setStudentID(int studentID) throws Exception{//Exception은 여러개를 받을 수 있기에 throws
		this.studentID = studentID;
//		if(this.studentID == -1) {
//			throw new Exception();//새로운 객체 하나를 생성했기에 s생략
//		}
	}
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		//this.studentID = 8; 이런식의 사전작업을 함.
		return super.clone();
	}
	
	
}
