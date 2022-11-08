package com.simple.ex;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/calc")
public class Calc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		response.getWriter().append("Served at: ")
//		.append(request.getContextPath());
		
		request.setCharacterEncoding("UTF-8");					
		response.setContentType("text/html; charset=UTF-8");	//������ ��
		response.setCharacterEncoding("UTF-8");

		//response�ϱ� ȭ�鿡 ����Ѵ�.
		String x_ = request.getParameter("x");//Ŭ���̾�Ʈ���� ������� ���� request���� ó��.
		String y_ = request.getParameter("y");//Ŭ���̾�Ʈ���� ������� ���� request���� ó��.
		String op = request.getParameter("operator");
		
		int x = 0;
		int y = 0;
		int result = 0;
		double div =0.0;
		
		if(!x_.equals("")) {//���� ������, ���� ���°� ���� �� �����ϱ�
			x = Integer.parseInt(x_);
		}
		
		if(!y_.equals("")) {
			y = Integer.parseInt(y_);
		}
		
		if(op.equals("����")) {	
			//�� "����"�� ������ �ν��� �ȵƱ� ������ ĳ���ͼ� �����ִ� ������ ������Ѵ�.
			result = x + y;
			response.getWriter().print("��� �� : "+result);
		}else if(op.equals("����")){
			result = x - y;
			response.getWriter().print("��� �� : "+result);
		}else if(op.equals("����")){
			result = x * y;
			response.getWriter().print("��� �� : "+result);
		}else if(op.equals("������")){
			div = (x*1.0d) / (y*1.0d);
			response.getWriter().print("��� �� : "+Math.round(div * 100) / 100.0);
		}
		
		//result = x - y;
		//response.getWriter().print("��� �� : "+result);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("POST Called!!");
		doGet(request, response);
	}

}