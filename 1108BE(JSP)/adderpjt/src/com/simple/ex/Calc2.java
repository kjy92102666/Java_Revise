package com.simple.ex;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/calc2")
public class Calc2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");					
		response.setContentType("text/html; charset=UTF-8");	//������ ��
		response.setCharacterEncoding("UTF-8");

		//response�ϱ� ȭ�鿡 ����Ѵ�.
		String value_ = request.getParameter("value");//Ŭ���̾�Ʈ���� ������� ���� request���� ó��.
		
		String op = request.getParameter("operator");
		
		int value = 0;
		int result = 0;
		double div =0.0;
		
		if(!value_.equals("")) {//���� ������, ���� ���°� ���� �� �����ϱ�
			value = Integer.parseInt(value_);
		}
		
		/*
		������ Ư���� ������ ���̴� ����� ���� �ʴ� ��, ��� �������.
		���, �����̳� ���ø����̼��̳��� ���̴� ������ ������ ��Եȴ�.
		*/
		
		// Application ����Ҹ� ȹ��(��ü ȹ��. ��ü �ּҸ� �˾ƾ��Ѵ�~)
		//ServletContext application = request.getServletContext();	// ����� ��ġ�� �˷��޶�~
		HttpSession session = request.getSession();	// ����� ��ġ�� �˷��޶�~(Session)
		
		
		//Cookie ����. ����Ǿ� �ִ� ���� �ҷ��´�? resp... :��Ű ����. requ...��Ű ������ ������.
		Cookie[] cookies = request.getCookies();
		
		
		if(op.equals("=")) {
			//����ҿ��� �����ڿ� ���� ������.
//			int x = (Integer)session.getAttribute("value");	//value�� ���Ë� Integer(��ü)�� �����⋚���� ������, ĳ���� ������Ѵ�.
//			int y = value;
//			String operator = (String) session.getAttribute("op");
			
			//��Ű �迭���� ���� ���ϱ�
			int x = 0;
			for (Cookie cookie : cookies) {
				if(cookie.getName().equals("value")) {
					x = Integer.parseInt(cookie.getValue());	//map�� key�� 1:1������ ã����, ��� ��� �ִ��� �𸣴� ���� ã��...?
					break;
				}
			}
			
	
			
			//��Ű �迭���� ������ ���ϱ�
			int y = value;
			String operator="";
			
			for (Cookie cookie : cookies) {
				if(cookie.getName().equals("op")) {
					operator = cookie.getValue();	//map�� key�� 1:1������ ã����, ��� ��� �ִ��� �𸣴� ���� ã��...?
					break;
				}
			}
			
			if(operator.equals("+")) {
				result = x + y;	
			}else if(operator.equals("-")){
				result = x - y;
			}else if(operator.equals("x")){
				result = x * y;
			}else if(operator.equals("/")){
				double result_=0.0;
				if(y!= 0) {
					result_ = (double)x/y;
				}
				response.getWriter().printf("��� �� : %.2f\n", result_);
				return;
			}
			
			response.getWriter().printf("��� �� : %d\n", result);
			
		}else {
			//������ application����ҿ� �����ڿ� ���� �����Ѵ�. "="�ƴϸ� ������ ����. ��� �����Ǿ��մ°� ���°Ű�
//			session.setAttribute("value", value);	//��
//			session.setAttribute("op", op);		//������
			
			//��� �����ڸ� �����ؼ� ���.
			Cookie valueCookie = new Cookie("value", String.valueOf(value));  // String.valueOf(value)); ������ ���ڿ��� �ٲٴ� ���.
			Cookie opCookie = new Cookie("op", op);  // 
			
			//Cookie valueCookie = new Cookie("value", value+"");  
			//�߿��� ������ res,req�� ����.
			response.addCookie(opCookie);
			response.addCookie(valueCookie);
			
			
			//��Ű ��ȿ�Ⱓ ����
			opCookie.setMaxAge(24*60*60);		//��*��*��. �Ϸ� ����
			valueCookie.setMaxAge(24*60*60);	//��*��*��. �Ϸ� ����
			
			//��Ű ��ȿ���� ����(path) 		
			opCookie.setPath("/calc2");			//�� ���� �ȿ����� �� �� �ְ�... �ణ�� ����
			valueCookie.setPath("/calc2");		//"
			
			response.addCookie(opCookie);
			response.addCookie(valueCookie);
			
			//���� �߿��� redirect. ������ư�� ����ϴ� ���.
			response.sendRedirect("calc2.html"); //calc2.html ���������� ȣ���Ѵ� == directing�Ѵ�~
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("POST Called!!");
		doGet(request, response);
	}

}