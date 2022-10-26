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

@WebServlet("/simple") //Ŭ������ ���θ�.
public class Simple extends HttpServlet{

	//������ java �����̱⿡ ������ �������� ȣ������� ���� ������ ���������� ���ΰ�ħ�� �ϸ� ������ ������ �ʴ´�.
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//�������� Ŭ���̾�Ʈ�� �䱸�ϴϱ�,
		//OutputStream os = resp.getOutputStream(); 
		//PrintStream out = new PrintStream(os, true);
		
		//���� ������ ���ٷ� ó��.
		PrintWriter pw = resp.getWriter();
		
		for(int i=1; i<=10; i++) {
			pw.println(i+"<p>Hello Servlet</p>");
		}
		
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	}

}