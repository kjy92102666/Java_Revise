**ThreadFinishFlagEx**

Math.random();  0.0~1.0미만의 값을 난수로 뽑는다. (확률이 거의 일정하다.)
contentPane.repaint();  //다시 그려준다는 개념 이해하기!!

new MouseListener() //얘로 하면 구현메소드 다 구현해야되는데, 
new MouseAdapter()를 사용함으로써 필요한거 하나만 쓰게 해준다.
label.setForeground(Color.RED);	//바로 글자에 색을 입힐 수 있


멀티스레드 주의점
 - 다수 스레드가 공유 데이터에 동시에 접근하는 경우
    공유 데이터의 값에 예상치 못한 결과 발생 가능.

스레드 동기화
 -공유 데이터에 대한 멀티스레드의 동시 접근 문제 해결책
   공유 데이터를 접근하는 모든 스레즈 한 줄 세우기
    한 스레드가 공유데이터에 대한 작업을 끝낼때까지 스레드가 대기하도록 함.


SynchronizedEx. 
 여러개의 스레드가 한개의 자원을 사용하고자 할 때, 현 데이터를 사용하고 있는 해당 스레드를 제외하고 나머지 스레드들은 데이터에 접근 할 수 없도록 막는 개념
 - 클래스 하나당 하나의 객체.(board객체, student객체....)
synchronized 키워드.  생략시 부정확한 값이 나올 수 있음.
 -한 스레드가 독점 실행해야 하는 부분(동기화코드)을 표시하는 키워드
   메소드 전체 ||  코드블록
 -블록에 대한 컴파일러의 처리
   먼저 실행한 스레드가 모니터 소유
   모니터를 소유한 스레드가 모니터를 내놓을때까지 다른 스레드 대기

Thread 객체는 start(); 와 동시에 반드시 동작한다.

Producer-consumer 동기화 문제점.

``1``