package Swing1031;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class JTableExample { 
	    JFrame f;    
	    JTableExample(){    
	    f=new JFrame();    
	    String data[][]={ {"101","Amit","670000"},
                          {"102","Jai","780000"},
                          {"101","Sachin","700000"} };
	    String column[]={"ID","NAME","SALARY"};         
	    
	    JTable jt=new JTable(data,column);    
	    jt.setCellSelectionEnabled(false);	//선택된 셀을 편집할거냐 ye-f, no-t
	    ListSelectionModel select = jt.getSelectionModel();	//선택 모드를 읽어와서 객체로 만든다~
	    
	    select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);//Mode를 고르고 Mode안에서 상수값을 설정. 단일 값만 선택하도록
	    select.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				// Actionperform이 아니라 값이 체인지 됐을때(valueChanged), 반영할지 여부.
				 String Data = null;  
	                int[] row = jt.getSelectedRows();  
	                int[] columns = jt.getSelectedColumns();  
	                
	                for (int i = 0; i < row.length; i++) {  
	                  for (int j = 0; j < columns.length; j++) {  
	                    Data = (String) jt.getValueAt(row[i], columns[j]);  
	                  }
	                }
	                System.out.println("Table element selected is: " + Data);    
			}
		});
	    
	    
	    //jt.setBounds(30,40,200,300);   
	    JScrollPane sp=new JScrollPane(jt);    //스크롤팬?을 생성.
	    //팬을 생성할떄 생성자로 테이블을 집어 넣는다.
	    
	    f.add(sp);//jtable은 jscroll팬에 들어있다. 따로 추가 x. 대신 테이블만 따로쓸때는 추가 o          
	    f.setSize(300,400);   
	    
	    f.setVisible(true);   
	    
	}     
	    
	public static void main(String[] args) {    
	    new JTableExample();    
	}    
}
