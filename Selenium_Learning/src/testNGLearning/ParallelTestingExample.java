package testNGLearning;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class ParallelTestingExample {

	@Test
	public void openGoogle() {
		System.setProperty("webdriver.edge.driver", "D:\\Testing Learning\\Selenium Jar File\\edgedriver_win64 (1)\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();
		driver.get("http://www.goole.co.in");
		driver.quit();
	}

	@Test
	public void openBing() {
		System.setProperty("webdriver.edge.driver", "D:\\Testing Learning\\Selenium Jar File\\edgedriver_win64 (1)\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();
		driver.get("http://www.bing.com");
		driver.quit();
	}

}
