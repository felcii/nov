package d_logger;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Property_Configuration {
	
	//factory design pattern

	static Logger log = Logger.getLogger(Property_Configuration.class);
		
		public static void main(String[] args) {
			
			PropertyConfigurator.configure("log4j.properties");
			
			log.debug("Debug");
			
			log.info("Info");
			
			log.warn("Warn");
			
			log.error("Error");
			
			log.fatal("Fatal");
		}


}
