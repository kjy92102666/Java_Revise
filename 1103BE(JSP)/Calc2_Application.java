package com.simple.ex;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/calc2")
public class Calc2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");					
		response.setContentType("text/html; charset=UTF-8");	//문서가 뭔
		response.setCharacterEncoding("UTF-8");

		//response니까 화면에 출력한다.
		String value_ = request.getParameter("value");//클라이언트에서 날라오는 모든건 request에서 처리.
		
		String op = request.getParameter("operator");
		
		int value = 0;
		int result = 0;
		double div =0.0;
		
		if(!value_.equals("")) {//값이 있으면, 값이 없는걸 받을 순 없으니까
			value = Integer.parseInt(value_);
		}
		
		/*
		서블렛은 특별히 서블렛을 죽이는 명령을 하지 않는 한, 계속 살아있음.
		고로, 세션이냐 어플리케이션이냐의 차이는 있지만 서블렛에 담게된다.
		*/
		
		// Application 저장소를 획득(객체 획득. 객체 주소를 알아야한다~)
		ServletContext application = request.getServletContext();	// 저장소 위치를 알려달라~
		
		if(op.equals("=")) {
			//저장소에서 연산자와 값을 꺼낸다.
			int x = (Integer)application.getAttribute("value");	//value가 들어올떄 Integer(객체)로 들어오기떄문에 받을때, 캐스팅 해줘야한다.
			int y = value;
			String operator = (String) application.getAttribute("op");
			
			if(operator.equals("+")) {
				result = x + y;	
			}else {
				result = x - y;
			}
			response.getWriter().printf("결과 값 : %d\n", result);
			
		}else {
			//서버에 application저장소에 연산자와 값을 저장한다. "="아니면 무조건 저장.
			application.setAttribute("value", value);	//값
			application.setAttribute("op", op);		//연산자
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("POST Called!!");
		doGet(request, response);
	}

}