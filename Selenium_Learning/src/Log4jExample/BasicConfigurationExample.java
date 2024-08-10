package Log4jExample;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class BasicConfigurationExample {
	
// factory design pattern
	// there is no new object we create a logger obejct and store the logger class
	
	static Logger logger = Logger.getLogger(BasicConfigurationExample.class);
	
	public static void main(String[] args) {
		
		BasicConfigurator.configure();//"%-4r  [%t]  % -5p %c %x - %m%n"
		
		logger.debug("This is the debug message");
		logger.info("this is an info");
		logger.warn("This is the warning");
		logger.error("This is an error");
		logger.fatal("This is an fatal message");
		
	}
}
