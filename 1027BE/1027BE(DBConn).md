
String query1 = "SELECT * FROM BOOK where bookid="+"'"+bookname+"'";
 +"'"+bookname+"'";  // '  기호를 문자열로 감싸서 적용.
String query1 = "SELECT * FROM BOOK where bookid = ?";
	//주석 달기
String query1 = "SELECT * FROM BOOK where bookname like"+"'%"+bookname+"%'";
//주석 달기
String query1 = "SELECT * FROM BOOK where bookname ="+"'"+bookname+"'";
//주석 달기



