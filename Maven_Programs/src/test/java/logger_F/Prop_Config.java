package logger_F;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Prop_Config {

	//fact des patrn
	static Logger log = Logger.getLogger(Prop_Config.class);
	
	public static void main(String[] args) {
		
		PropertyConfigurator.configure("log4j.properties");

		
		log.debug("Debug");
		
		log.info("Info");
		
		log.warn("Warn");
		
		log.error("Error");
		
		log.fatal("Fatal");
	}
}
