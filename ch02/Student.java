package oop_pro3.ch02;

//equals, hashCode����
public class Student implements Cloneable{
	
	private int studentID;
	private String studentName;
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}
	
	
	


	//hashCode,equals,equals Object�� ���ԵǾ��ִ�,
	//"�� ������� ������ �ϰڴ�."-> �ݵ�� �������̵��ؾ��Ѵ�. ��ü�� ������ �������.
	//��ü�� hash�Լ��� ������ ��ü�� �ּҸ� �����ϴ� �Լ�. 
	@Override
	public int hashCode() {
		return studentID;
	}
	
	//studentID�� ��ü �񱳸� �ϴ� �޼���. 
	//��簴ü�� Object�� ��ӹޱ� ������ ��� ���� �� �ִ�.
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std= (Student)obj; //Object->Student�� �ٿ�ĳ����.
			if(this.studentID == std.studentID) {//�ٿ�ĳ���� ���ϸ� �����ȵ�.
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
	
	public void setStudentID(int studentID) throws Exception{//Exception�� �������� ���� �� �ֱ⿡ throws
		this.studentID = studentID;
//		if(this.studentID == -1) {
//			throw new Exception();//���ο� ��ü �ϳ��� �����߱⿡ s����
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
		//this.studentID = 8; �̷����� �����۾��� ��.
		return super.clone();
	}
	
	
}
