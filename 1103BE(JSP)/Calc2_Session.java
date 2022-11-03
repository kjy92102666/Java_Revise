package com.simple.ex;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
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
		
		if(op.equals("=")) {
			//����ҿ��� �����ڿ� ���� ������.
			int x = (Integer)session.getAttribute("value");	//value�� ���Ë� Integer(��ü)�� �����⋚���� ������, ĳ���� ������Ѵ�.
			int y = value;
			String operator = (String) session.getAttribute("op");
			
			if(operator.equals("+")) {
				result = x + y;	
			}else {
				result = x - y;
			}
			response.getWriter().printf("��� �� : %d\n", result);
			
		}else {
			//������ application����ҿ� �����ڿ� ���� �����Ѵ�. "="�ƴϸ� ������ ����.
			session.setAttribute("value", value);	//��
			session.setAttribute("op", op);		//������
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("POST Called!!");
		doGet(request, response);
	}

}