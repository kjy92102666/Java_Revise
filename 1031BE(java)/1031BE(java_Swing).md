*여러 라이브러리 import단축키 ctrl+Shift+O.
*JComboBox, TextField+selector = JComboBox


라디오버튼 할때 반드시 그룹으로 묶어라!

매개변수에 값이 아니라 기능을 전달 (람다식,에러펑션?)

``java JTableExample()
String data[][]={ {"101","Amit","670000"},
                          {"102","Jai","780000"},
                          {"101","Sachin","700000"} };
	    String column[]={"ID","NAME","SALARY"};         
	    
	    JTable jt=new JTable(data,column);    
	    jt.setBounds(30,40,200,300);   
	    
	    JScrollPane sp=new JScrollPane(jt);    //스크롤팬?을 생성.
	    //팬을 생성할떄 생성자로 테이블을 집어 넣는다.
	    
	    f.add(sp)
	    ``
.getItemAt 주소?위치를 가리킴. 3으로하면 [3]꺼만 출력
jtable은 jscroll팬에 들어있다. 따로 추가 x. 대신 테이블만 따로쓸때는 추가 o 

/*테이블 편집을 위한 과정.*/
.setCellSelectionEnabled(false);	//선택된 셀을 편집
.getSelectionModel();	//선택 모드를 읽어와서 객체로 만든다







` 3 `