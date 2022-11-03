개념이 먼저고 코드 구현은 나중.
`<input type="text" name="num" >`	<!-- 2개 이상부터는 알아서 배열로 바뀐다. -->

``<form action="add2" method="post">``  //"add2"로 끝났다는건 서블렛주소로 가겠다.
추후에 action="add2.jsp"로 변경가능.


request.getParameter(getServletName())
request로 받고, getParameter()는 1개 받아온다.

☆상태유지를 위한 방법(application,hidden,querystring,Session,Cookie)
내pc에 저장(시간이 정해져 있)  ->  쿠키.(막을 수 있다. 단, 서비스 이용x)
서버에 저장  ->  세션(서버 고유 저장소.).에 저장하는 사람들 끼리 볼 수 있


서블렛은 특별히 서블렛을 죽이는 명령을 하지 않는 한, 계속 살아있음.
고로, 세션이냐 어플리케이션이냐의 차이는 있지만 서블렛에 담게된다.

calc는 10, +, 20, =, 30;  각자 다 따로 저장되서(set)  결과값을 내고. 
반대로 각자 다 따로 꺼내오는(get)

.add가 나오면 컨테이너에 저장된다는걸 기억하기!

setAttribute(op,value)

application은 다른 브라우저에서 접근해도 값을 그대로 불러와서 사용 가능하지만,
session은 같은 브라우저로만 접근해야 사용가능.(다른브라우저로 접근시, 500뜸.)


``1``


