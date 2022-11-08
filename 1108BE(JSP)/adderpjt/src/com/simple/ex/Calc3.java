package com.simple.ex;

import java.io.IOException;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/calc3")
public class Calc3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//��Ű ����, �غ�
		Cookie[] cookies = request.getCookies();
		
		String value = request.getParameter("value");			//value�� ����.
		String operator = request.getParameter("operator");		//operator�� ������
		String dot = request.getParameter("dot");				//�Ǽ� ǥ�� .
		//�� 3���߿� �ϳ��� ����´�. �ϳ��� ���� �ְ� ������ null (��ư �ϳ��� ���� ������ �����ϱ�)
		
		String exp="";			//�����ϴ°� ���� ���ϴ°� �ƴ϶� ��ü�� ������ �����Ǵ°�.
		// 
		//���� : �پ���(���Ѵ�x) ���� ���� ��. 
		//���� ���ϴ�(��ü�� ���ϴ�) ==> mutable ��ѡ� immutable(�ٲ� �� ���� ��)
		
		
		//cookies��ü�� getCookies�� ���� ����� �� ������ Ȯ��!. 
		//��Ű ����ҿ��� ������ ������.
		if(cookies != null) {
			for (Cookie cookie : cookies) {
				if(cookie.getName().equals("exp")) {
					exp = cookie.getValue();	//����ҿ��� ������ �� exp�� ����.
				}
			}
		}
		
		// ������ ���
		if(operator != null && operator.equals("=")) { //opertor�� ���� �ְ�, �����ڰ� =�� ������,
			// ����ó�� ������ ����Ѵ�.
			ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
			
			
			//engine.eval(new FileReader("example.js"));
			
			try {
			 exp = String.valueOf(engine.eval(exp));
			} catch (ScriptException e) {
				//��ũ��Ʈ ����ó��.
				e.printStackTrace();
			}
			
		}else {
			// ������ ��Ű�� ����. 
			exp += (value == null)	? 	"" : value;
			exp += (operator== null)? 	"" : operator;
			exp += (dot == null)	? 	"" : dot;
		}
		
		Cookie expCookie = new Cookie("exp", exp);
		
		// ���� ��Ű ���� Ŭ���̾�Ʈ pc�� ����
		response.addCookie(expCookie);
		response.sendRedirect("calcpage");
		
		
		
	}

}
