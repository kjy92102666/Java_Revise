INSERT
String INSERT_BOOK = "INSERT INTO BOOK VALUES(?,?,?,?)";
UPDATE
String UPDATE_BOOK = "UPDATE BOOK SET BOOKNAME=?,"+
			 " PUBLISHER=? WHERE BOOKID=?";

count = pstmt.executeUpdate();	//executeQuery=>SELECT만,,executeUpdate=>나머지