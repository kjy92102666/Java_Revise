package com.simple.ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

//DB create. 가장 기본적인 방법... 이거 하고나면 나머지 r,u,d 다 가능하대.
public class MadangDB {
	int bookid;
	//DB관련 객체들
	Connection con;				//DB 접속 객체
	Statement stmt;				//SQL문장을 생성하는 객체 - 문자열 기반
	PreparedStatement pstmt;	//SQL 문장을 생성하는 객체
	ResultSet rs;				//SQL 수행결과를 처리할 객체
	
	String bookname = "";
	public MadangDB(int bookid) {
		this.bookid = bookid;

		//접속 정보 설정
		String url="jdbc:oracle:thin:@172.30.1.49:1521:xe";//강사님 컴퓨터에 오라클이 있기에 강사님ip사용.
		String userid="kjy921026";	//simple  |  system  단일, 다중접속 제한 확인.
		String password="db1234";	//pjc0129 |  oracle
		//String query = "SELECT * FROM BOOK";	//sql문장 객체를 생성해서 넘겨주고 실행 할 쿼리, 
		//String query1 = "SELECT * FROM BOOK where bookid=3";

		//int bookid = 3;
		String query1 = "SELECT * FROM BOOK where bookid = ? and bookid <=?";	//문제!
		//String query1 = "SELECT * FROM BOOK where bookid = ?";
		//String query1 = "SELECT * FROM BOOK where bookname like"+"'%"+bookname+"%'";
		//String query1 = "SELECT * FROM BOOK where bookname ="+"'"+bookname+"'";
		System.out.println("SQL : " + query1);	//내가만든 쿼리문을 확인&실행
		
		//JDBC 드라이버 로드
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");//DB명 마다 다르다.
			System.out.println(" 드라이버 로드 성공!");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println(" 드라이버 로드 실패");
		}	
		
		//DB 접속
		try {
			con = DriverManager.getConnection(url,userid,password);	//DriverManager 왜 예외처리해야될까
			System.out.println(" DB 접속 성공");
		} catch (SQLException e) {
			System.out.println(" DB 접속 실패");
			e.printStackTrace();
		}
		
		//SQL 문장 생성
		try {
			//문장 생성
			stmt = con.createStatement(); //con객체 안에 있는 정보를 가지고 생성한 후, 
			pstmt = con.prepareStatement(query1);
			pstmt.setInt(1, bookid);
			
			//문장 실행
			rs = pstmt.executeQuery();
			//ResultSet rs = stmt.executeQuery(query1);
			//stmt.executeQuery(query); sql이 들어갈 쿼리명령문.
			
			System.out.println("BOOK NO \tBOOK NAME \t\tPUBLISHER \tPRICE");
			//System.out.println("SQL : " + query1);
			//SQL 실행 결과 받아서 처리
			while(rs.next()) { //쿼리문 실행 중인 상태에서 결과테이블이 몇개인지 모르기에 rs.next해서 하나씩 꺼내온다.
				int no = rs.getInt("bookid");//대소문자는 상관x. 단, 필드명은 틀리면x. bookid
				System.out.print("\t" + no);
				String name = rs.getString(2);				//bookname
				System.out.print("\t" + name);
				System.out.print("\t\t" + rs.getString(3));	//publisher
				System.out.print("\t" + rs.getInt(4));		//price
				System.out.println();
				
			}
			//가장 먼저 생성한 거에 역순으로 종료시켜줘야함.?
			//사용된 객체들을 종료시켜줘서 다른 사용자들이 겹쳐지지 않게함.
			con.close();
			stmt.close();
			rs.close();
			
			//메모리낭비를 위한 종료?
			
		} catch (SQLException e) {
			e.printStackTrace();
		}  
		
	}
	

	public static void main(String[] args) {
		
		//사용자 입력
		//북아이디를 입력으로 받음
		//String bookname="";
		int bookid = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("찾고자 하는 도서 아이디 : ");
		bookid = in.nextInt();	//원래는 Line으로 받아서 parseInt 해주는게...
		//System.out.println("bookid : " + bookid);
		
		new MadangDB(bookid);
	}

}
