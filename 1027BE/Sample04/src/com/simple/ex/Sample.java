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
@WebServlet("/sam") //클래스를 대신하는 요청맵핑. 주소창에 남아있.
public class Sample extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//펜을 하나 준비해야된다. 고 생각하기
		//한글 인코딩 및 문서유형 정보 설정. 위치, 순서 기억해두기!
		response.setCharacterEncoding("UTF-8"); //utf-8을 사용한다고 알려주는 함수
		response.setContentType("text/html;charset=UTF-8");//text이면서 html이다~
		
		PrintWriter out = response.getWriter(); // 서버가 웹으로 보내는거니까 response
		for(int i=0; i<100; i++) {
			out.println(":<p>헬로, Servlet"+(i+1)+"</p>");	//웹에 한글을 보낸다는 것을 모르기에 ??뜸.
				
		}
	}


}
