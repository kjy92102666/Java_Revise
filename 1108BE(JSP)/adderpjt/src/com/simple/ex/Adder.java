package com.simple.ex;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/adder")
public class Adder extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ")
		.append(request.getContextPath());
		//response�ϱ� ȭ�鿡 ����Ѵ�.
		String num1_ = request.getParameter("num1");//Ŭ���̾�Ʈ���� ������� ���� request���� ó��.
		String num2_ = request.getParameter("num2");//Ŭ���̾�Ʈ���� ������� ���� request���� ó��.
		int num1 = 0;
		int num2 = 0;
		int sum = 0;
		
		if(!num1_.equals("")) {//���� ������, ���� ���°� ���� �� �����ϱ�
			num1 = Integer.parseInt(num1_);
		}
		
		if(!num2_.equals("")) {
			num2 = Integer.parseInt(num2_);
		}
		
		sum = num1 + num2;
		response.getWriter().print("sum : "+sum);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("POST Called!!");
		doGet(request, response);
	}

}
