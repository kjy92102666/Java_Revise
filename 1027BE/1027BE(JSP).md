New Project ->Context root : /
@WebServlet("/sam") //클래스를 대신하는 요청맵핑. 반드시 필요.
Generate web.xml ... : web.xml을 읽고 수행하라.

src에 Servlet 생성. 상속받은 Sevlet사용.
Sample() {
init(){ //서블릿 생성뒤 곧바도 init이 바로 수행됨. 따로 호출되지 않아도... }
destroy() { // 따로 호출하지 않아도 }

Web Project Setting->Context root : 나중에 이 경로로 맞춘다/??
    public Sample() { 1.
        super();	//상속하는 HttpServlet으로 뭔가 보내고 싶을때 super().
        System.out.println("서블렛 생성시 호출됨. Sample()생성자.");
    }

	public void init(ServletConfig config) throws ServletException { 2.
		//서블릿 생성뒤 곧바도 init이 바로 수행됨. 따로 호출되지 않아도...
		System.out.println("서블렛 초기화시 한번만 수행됨.. init()");
	 }

	public void destroy() { 3.맨 나중.
		//서버 종료한다고 바로 꺼지는게 아니라 destroy()함수 실행 후 종료.
		System.out.println("서블렛 소멸시 수행됨...");
		
	 }

	protected void service(HttpServletRequest request, HttpServletResponse 
     response) throws ServletException, IOException {
		//펜을 하나 준비해야된다. 고 생각하기
		PrintWriter out = response.getWriter();// 서버가 웹으로 보내는거니까 response
		out.println("<h1>Servlet |service|</h1>");
	 }


	protected void doGet(HttpServletRequest request, HttpServletResponse 
     response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	 }

	protected void doPost(HttpServletRequest request, HttpServletResponse 
     response) throws ServletException, IOException {
		// 
		
		doGet(request, response);	//Post기능 다 하고 Get호출가능( 단, (요청객체,응답객체)다 있어야 가능 ).
	 }

     }
@WebServlet("")을 통해서 url을 호출하기 떄문에 이름을 다르게 해주어야한다.   
 ※이름이 다르면 둘 다 메모리에 올라간다.



 쿼리스트링 : 사용자가 서버에 웹 문서를 요청할 시에 추가적인 옵션을 넣는기능.
클라이언트->웹.response

웹->클라이언트. request
 - request.getParameter(). 거의 이걸로 데이터를 받는다
 - ?변수명=값 : 
    sam1?no=5 // sam1의 URL에 가서 no에 5를 대입해라~