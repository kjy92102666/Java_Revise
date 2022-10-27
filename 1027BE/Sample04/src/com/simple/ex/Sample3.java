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
// Ŭ�����̸��� �ٸ����� ������ ��� �ּҸ� �ҷ��;��ϴ��� �𸣱⿡ ���������ش�.
public class Sample3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//���� �ϳ� �غ��ؾߵȴ�. �� �����ϱ�
		//�ѱ� ���ڵ� �� �������� ���� ����. ��ġ, ���� ����صα�!
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8"); //utf-8�� ����Ѵٰ� �˷��ִ� �Լ�
		response.setContentType("text/html;charset=UTF-8");//text�̸鼭 html�̴�~
		
		//��->Ŭ���̾�Ʈ. request
		//request.getParameter(getServletName());
		String no_ = request.getParameter("no");
		String name = request.getParameter("name");
		int num = Integer.parseInt(no_);
		
		
		PrintWriter out = response.getWriter(); // ������ ������ �����°Ŵϱ� response
		for(int i=0; i<num; i++) {
			out.println("<p>��� ������, Servlet"+(i+1)+"</p>");	//���� �ѱ��� �����ٴ� ���� �𸣱⿡ ??��.
			out.println("<p>"+name+"</p>");
		}
	}


}
