package learn.log4j;

import org.apache.log4j.Logger;

public class Log4j {

	private static Logger logger = Logger.getLogger(Log4j.class);  
	
	private void LogLevel(){

        // 记录debug级别的信息  
        logger.debug("This is debug message.");  
        // 记录info级别的信息  
        logger.info("This is info message.");  
        // 记录error级别的信息  
        logger.error("This is error message.");  
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Log4j log4j = new Log4j();
		log4j.LogLevel();
	}

}
