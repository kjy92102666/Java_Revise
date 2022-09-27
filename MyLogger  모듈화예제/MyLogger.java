package MyLogger;

import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


//�̱��� ����. �Ѱ��ۿ� ���� �ȵǵ��� �ϴ� ����.
/*
Logger logger = Logger.getLogger("MyLogger");
private static MyLogger instance = new MyLogger();	
private MyLogger() {}
	public static MyLogger getLogger() {
		return instance;
	}
*/


//�ڹٿ��� �������ִ� Logger�� singleton�� �̿��ؼ� �Ѱ��� �����Ǽ� ���� ���ֵ���.
public class MyLogger {
	
	Logger logger = Logger.getLogger("MyLogger");	//�α������� �ϳ����� �Ǵϱ�.
	
	private static MyLogger instance = new MyLogger();	
	//static���� �����߱⿡ , static�޸𸮿� �ٷ� �ö�. ����ȭ.
	
	public static final String ERROR_LOG = "error.txt";
	public static final String FINE_LOG = "fine.txt";
	//public static final String FINE_LOG = "fine.txt";
	public static final String INFO_LOG = "info.txt";
	
	
	private FileHandler errorFile;	//�����α׿�
	private FileHandler fineFile;	//���ηα׸� ������ �����ϵ���.
	private FileHandler infoFile;	
	//MyLogger()�� �̱����̱⿡ private. 
	private MyLogger() {	//�����ڴ� static�Ⱦ���. format����.
		try {
			errorFile = new FileHandler(ERROR_LOG, true);
			fineFile = new FileHandler(FINE_LOG, true);
			//warnigFile = new FileHandler(WARN_LOG, true);
			infoFile = new FileHandler(INFO_LOG, true);//2.
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		errorFile.setFormatter(new SimpleFormatter());	
		//SimpleFormatter �ϸ� xml������ �����ְ� �������·�.
		fineFile.setFormatter(new SimpleFormatter());
		infoFile.setFormatter(new SimpleFormatter());
		
		logger.setLevel(Level.ALL);			//��� errorLevel�� ������ �� ��
		
		errorFile.setLevel(Level.SEVERE);	//Level.SEVERE�� error.txt
		fineFile.setLevel(Level.FINE);		//Level.FINE�� fine.txt
		//logger.setLevel(Level.SEVERE);
		infoFile.setLevel(Level.INFO);	//4.INFO�� ã��
		
		logger.addHandler(errorFile);	//log�� �ٰ� Handler���. 
		logger.addHandler(fineFile);
		logger.addHandler(infoFile);	//0.infoFile�� logger�� ����Ѵ�.
		
	}
	//MyLogger������ �����ϴ�, �����ε�.
	public static MyLogger getLogger() {//�����ڴ� static�Ⱦ��⶧���� ȣ���� ���� ����.
		return instance;
	}
	


	
	public void fine(String msg) {
		logger.fine(msg);
	}
	
	public void severe(String msg) {
		logger.severe(msg);
	}
	
	public void info(String msg) {
		logger.info(msg);	//1.fileHandler�� ã��
	}
}
