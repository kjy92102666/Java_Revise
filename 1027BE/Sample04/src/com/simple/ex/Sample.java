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
@WebServlet("/sam") //Ŭ������ ����ϴ� ��û����. �ּ�â�� ������.
public class Sample extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//���� �ϳ� �غ��ؾߵȴ�. �� �����ϱ�
		//�ѱ� ���ڵ� �� �������� ���� ����. ��ġ, ���� ����صα�!
		response.setCharacterEncoding("UTF-8"); //utf-8�� ����Ѵٰ� �˷��ִ� �Լ�
		response.setContentType("text/html;charset=UTF-8");//text�̸鼭 html�̴�~
		
		PrintWriter out = response.getWriter(); // ������ ������ �����°Ŵϱ� response
		for(int i=0; i<100; i++) {
			out.println(":<p>���, Servlet"+(i+1)+"</p>");	//���� �ѱ��� �����ٴ� ���� �𸣱⿡ ??��.
				
		}
	}


}
