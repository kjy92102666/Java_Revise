package com.simple.ex;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Sample
 */
@WebServlet("/sample3") 
// 클래스이름이 다르더라도 웹에서 어느 주소를 불러와야하는지 모르기에 구분지어준다.
public class Sample3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//펜을 하나 준비해야된다. 고 생각하기
		//한글 인코딩 및 문서유형 정보 설정. 위치, 순서 기억해두기!
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8"); //utf-8을 사용한다고 알려주는 함수
		response.setContentType("text/html;charset=UTF-8");//text이면서 html이다~
		
		//웹->클라이언트. request
		//request.getParameter(getServletName());
		String no_ = request.getParameter("no");
		String name = request.getParameter("name");
		int num = Integer.parseInt(no_);
		
		
		PrintWriter out = response.getWriter(); // 서버가 웹으로 보내는거니까 response
		for(int i=0; i<num; i++) {
			out.println("<p>헬로 프렌드, Servlet"+(i+1)+"</p>");	//웹에 한글을 보낸다는 것을 모르기에 ??뜸.
			out.println("<p>"+name+"</p>");
		}
	}


}
