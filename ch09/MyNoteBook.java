package ch09;

public class MyNoteBook extends NoteBook{

	//부모에서 이미 typing()를 상속받았기 때문에 display()만 상속 받으면 일반 함수로 사용가능.
	@Override
	void display() {
		System.out.println("Deskop Display...");
	}
	
	
}
