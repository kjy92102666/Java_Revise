package ch08;
import java.util.ArrayList;


public class AnimalTest {
	public static void main(String[] args) {
		Animal humanAnimal = new Human();	 //업캐스팅 Human(자식) -> Animal(부모)
		Animal tiger = new Tiger();			 //"" Tiger(자식) -> Animal(부모)
		//Tiger ti = new Tiger();
		
		
		ArrayList<Animal> animalList = new ArrayList<>();	//ArrayList
		animalList.add(humanAnimal);		//animalList에 humanAnimal을 저장. 
		animalList.add(tiger);
		//animalList.add(ti);					얘도 가능. 여러 객체타입을 담을 수 있는게 ArrayList쓰는이유.
		
		for(Animal animal : animalList) {
			animal.move();
		}
		
		testDownCasting(animalList);
	}
	
	public static void testDownCasting(ArrayList <Animal> list) {	//정적메모리인 메인함수에서 호출하기 위해 static선언.
		//함수에는 static을 잘 사용하지않는다. 접근성이 쉬워 지기 떄문에... 공통적인 함수,변수만 사용. 
		for(Animal animal : list) { //동일한 타입의 list안에 요소들을 animal안에 하나씩 집어넣는다~
			
			if(animal instanceof Human) { 
			//업캐스팅된 animal(인스턴스는 Human).이 Human이 맞는지 확인하는 연산자.
				Human human = (Human)animal;//다운캐스팅.
				human.readBook();//animal에서 자식메소드인 readBook()을 사용하기 위해 다운캐스팅한 예.		
			}
			else if(animal instanceof Tiger) {
				
				Tiger tiger = (Tiger)animal;//Aminal->Tiger로 다운캐스팅.
				tiger.hunting();			//마찬가지로 자식메소드 사용가능.
				
			}
		}
		
	}
}
