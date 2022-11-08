★항상 html→server.. 로 작동.
☆- 브라우저 종류가 다르면 다른 사용자(세션)으로 인식함
   `- 브라우저 종류가 같으면 같은 사용자(세션)으로 인식함
[Servlet / JSP #09 상태 유지를 위한 방법 (velog.io)](https://velog.io/@underlier12/Servlet-JSP-09-%EC%83%81%ED%83%9C-%EC%9C%A0%EC%A7%80%EB%A5%BC-%EC%9C%84%ED%95%9C-%EB%B0%A9%EB%B2%95)

서버에 저장하는 2가지 
- application, 
- session. 
  세션은 쿠키를 기반, 쿠키(사용자 정보 파일을 브라우저에 저장)와 달리 세션(서버 측에서 관리)
  SessionID가 있어야 Session 공간에 저장 가능 따라서 초기 SID가 없을 경우 SID를 부여함
   ㅡSID(Session ID) : WAS에서 접속 유지, 구분 할 수 있도록 하는 일련번호  
   ㅡ세션 유효기간이 존재.(SID의 값 유지기간.) 시간이 지나면 로그아웃.
    ![[Pasted image 20221108133740.png]]

- cookie
 ㅡ 쿠키는 클라이언트(브라우저) 로컬에 저장되는 키와 값이 들어있는 작은 데이터 파일
 ㅡ ~처럼 상태값을 지닌다는 점은 같으나 서버 측이 아닌 클라 측에서 값을 저장하고 다니는 개념
프로젝트  - Web Project Setting - Contetxt root:  /  -> 얘 넣어주기.
 - Cookie 선언. 저장되어 있는 값을 불러온다
 - 쿠키 배열에서 값을 구하기
 - 쿠키 배열에서 연산자 구하기
 - 중요한 정보는 response, request로 저장.
 - 쿠키 유효기간 설정
 - 쿠키 유효범위 설정(path)
★동적 페이지 작동원리
	dataSources/database→
	 - 동적 데이터(ex:게시판)를 가져와서(디자이너가 옷을 만들었다.)
	←Javabeans(Model)→
	 - 모델화 == 구조의 변경.( 모델이 만들어진 옷을 입어본다)
	←JSP pages(View)→ Web Browser→
	 - html이 들어있다, 프로그램을 하지 않는다.
	←Servlet/Filter(Controller)→Jsp pages

- cookie
[Servlet / JSP #10 동적 페이지 (velog.io)](https://velog.io/@underlier12/Servlet-JSP-10-%EB%8F%99%EC%A0%81-%ED%8E%98%EC%9D%B4%EC%A7%80-1ck5swes33)
 - 이전버튼을 대신하는 기능.  
     response.sendRedirect("calc2.html");//calc2.html 이페이지를directing한다~
 - 

==calcpage ↔ calc3 상호작용하면서 동작한다~==

쿠키 값 확인!
 - <edge>
  개발자모드(f12) - 네트워크 - 좌측에 이름 밑에 요청페이지명 클릭 -  value 확인.(값 삭제시 삭제)
 - <크롬>
 개발자모드(f12) - Application - Cookies. value 확인.(값 삭제시 삭제)

수식처리 엔진을 사용
new ScriptEngineManager().getEngineByName("Nashorn"); //나손?이란 이름의 엔진을 쓴다~
 객체 받을때는 ScriptEngine 인터페이스로 받는다.
















`123`