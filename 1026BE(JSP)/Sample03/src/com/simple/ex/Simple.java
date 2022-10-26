package com.simple.ex;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/simple") //클래스에 맵핑명.
public class Simple extends HttpServlet{

	//파일이 java 파일이기에 정적인 페이지가 호출됨으로 내용 변경후 페이지에서 새로고침만 하면 내용이 변하지 않는다.
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//서버에서 클라이언트로 요구하니깐,
		//OutputStream os = resp.getOutputStream(); 
		//PrintStream out = new PrintStream(os, true);
		
		//위의 두줄을 한줄로 처리.
		PrintWriter pw = resp.getWriter();
		
		for(int i=1; i<=10; i++) {
			pw.println(i+"<p>Hello Servlet</p>");
		}
		
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	}

}