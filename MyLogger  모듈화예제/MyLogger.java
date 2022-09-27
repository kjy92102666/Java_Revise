package MyLogger;

import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


//싱글톤 패턴. 한개밖에 생성 안되도록 하는 패턴.
/*
Logger logger = Logger.getLogger("MyLogger");
private static MyLogger instance = new MyLogger();	
private MyLogger() {}
	public static MyLogger getLogger() {
		return instance;
	}
*/


//자바에서 제공해주는 Logger는 singleton을 이용해서 한개만 생성되서 찍을 수있도록.
public class MyLogger {
	
	Logger logger = Logger.getLogger("MyLogger");	//로그파일은 하나여야 되니깐.
	
	private static MyLogger instance = new MyLogger();	
	//static으로 선언했기에 , static메모리에 바로 올라감. 은닉화.
	
	public static final String ERROR_LOG = "error.txt";
	public static final String FINE_LOG = "fine.txt";
	//public static final String FINE_LOG = "fine.txt";
	public static final String INFO_LOG = "info.txt";
	
	
	private FileHandler errorFile;	//에러로그와
	private FileHandler fineFile;	//파인로그를 별도로 저장하도록.
	private FileHandler infoFile;	
	//MyLogger()는 싱글톤이기에 private. 
	private MyLogger() {	//생성자는 static안쓴다. format오류.
		try {
			errorFile = new FileHandler(ERROR_LOG, true);
			fineFile = new FileHandler(FINE_LOG, true);
			//warnigFile = new FileHandler(WARN_LOG, true);
			infoFile = new FileHandler(INFO_LOG, true);//2.
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		errorFile.setFormatter(new SimpleFormatter());	
		//SimpleFormatter 하면 xml형식을 지워주고 심플형태로.
		fineFile.setFormatter(new SimpleFormatter());
		infoFile.setFormatter(new SimpleFormatter());
		
		logger.setLevel(Level.ALL);			//모든 errorLevel을 인지할 수 있
		
		errorFile.setLevel(Level.SEVERE);	//Level.SEVERE는 error.txt
		fineFile.setLevel(Level.FINE);		//Level.FINE는 fine.txt
		//logger.setLevel(Level.SEVERE);
		infoFile.setLevel(Level.INFO);	//4.INFO를 찾고
		
		logger.addHandler(errorFile);	//log에 다가 Handler등록. 
		logger.addHandler(fineFile);
		logger.addHandler(infoFile);	//0.infoFile을 logger에 등록한다.
		
	}
	//MyLogger생성자 존재하니, 오버로딩.
	public static MyLogger getLogger() {//생성자는 static안쓰기때문에 호출을 위한 선언.
		return instance;
	}
	


	
	public void fine(String msg) {
		logger.fine(msg);
	}
	
	public void severe(String msg) {
		logger.severe(msg);
	}
	
	public void info(String msg) {
		logger.info(msg);	//1.fileHandler를 찾고
	}
}
