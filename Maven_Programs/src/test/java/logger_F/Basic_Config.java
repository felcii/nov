package logger_F;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Basic_Config {
	
	//factory design pattern
	
	static Logger log = Logger.getLogger(Basic_Config.class);
		
	public static void main(String[] args) {
		
		//configuratn
		
		BasicConfigurator.configure();
		
		log.debug("Debug");
		
		log.info("Info");
		
		log.warn("Warn");
		
		log.error("Error");
		
		log.fatal("Fatal");
	}
}
