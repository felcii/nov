package d_logger;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Basic_Configuration {

	//factory design pattern
	
		static Logger log = Logger.getLogger(Basic_Configuration.class);
			
		public static void main(String[] args) {
			
			//configuration
			
			BasicConfigurator.configure();
			
			log.debug("Debug");
			
			log.info("Info");
			
			log.warn("Warn");
			
			log.error("Error");
			
			log.fatal("Fatal");
		}
}
