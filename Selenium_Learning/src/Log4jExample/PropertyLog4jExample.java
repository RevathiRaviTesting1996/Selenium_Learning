package Log4jExample;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class PropertyLog4jExample {
	
	static Logger logger = Logger.getLogger(PropertyLog4jExample.class);
	
	public static void main(String[] args) {
		
		PropertyConfigurator.configure("log4j.properties");
		logger.debug("This is a debug message");
		logger.info("This is an info");
		logger.warn("This is warning");
		logger.error("This is an error");
		logger.fatal("This is a fatal message");
		
	}
}
