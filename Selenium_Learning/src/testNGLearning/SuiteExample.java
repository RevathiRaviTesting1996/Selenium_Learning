package testNGLearning;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteExample {
	WebDriver driver;
	long startTime;
	long endTime;
	long totalTime;

	//Aim : Open chrome and go to
	//1.google.co.in  2.bing.com and 3. yahoo.com and then close the browser

	@BeforeSuite
	public void launchBrowser() {
		startTime = System.currentTimeMillis();
		System.setProperty("webdriver.edge.driver",
				"D:\\Testing Learning\\Selenium Jar File\\edgedriver_win64 (1)\\msedgedriver.exe");

		driver = new EdgeDriver();
	}	
	
	@Test (priority = 1)
	public void openGoogle() {

		driver.get("http://www.goole.co.in");

	}

	@Test(priority = 2)
	public void openBing() {

		driver.get("http://www.bing.com");

	}

	@Test(priority = 3)
	public void openYahoo() {

		driver.get("http://www.yahoo.com");

	}


	@AfterSuite
	public void endBrowser() {

		driver.quit();
		endTime = System.currentTimeMillis();
		totalTime = endTime-startTime;
		System.out.println("total time taken "+totalTime);
	}




	/*
	 * @Test public void openGoogle() { long startTime = System.currentTimeMillis();
	 * System.setProperty("webdriver.edge.driver",
	 * "D:\\Testing Learning\\Selenium Jar File\\edgedriver_win64 (1)\\msedgedriver.exe"
	 * );
	 * 
	 * WebDriver driver = new EdgeDriver(); driver.get("http://www.goole.co.in");
	 * driver.quit(); long endTime = System.currentTimeMillis();
	 * 
	 * long totalTime = endTime-startTime; System.out.println("Total Time taken" +
	 * totalTime); }
	 * 
	 * @Test public void openBing() { long startTime = System.currentTimeMillis();
	 * System.setProperty("webdriver.edge.driver",
	 * "D:\\Testing Learning\\Selenium Jar File\\edgedriver_win64 (1)\\msedgedriver.exe"
	 * );
	 * 
	 * WebDriver driver = new EdgeDriver(); driver.get("http://www.bing.com");
	 * driver.quit(); long endTime = System.currentTimeMillis();
	 * 
	 * long totalTime = endTime-startTime; System.out.println("Total Time taken" +
	 * totalTime); }
	 * 
	 * @Test public void openYahoo() { long startTime = System.currentTimeMillis();
	 * System.setProperty("webdriver.edge.driver",
	 * "D:\\Testing Learning\\Selenium Jar File\\edgedriver_win64 (1)\\msedgedriver.exe"
	 * );
	 * 
	 * WebDriver driver = new EdgeDriver(); driver.get("http://www.yahoo.com");
	 * driver.quit(); long endTime = System.currentTimeMillis();
	 * 
	 * long totalTime = endTime-startTime; System.out.println("Total Time taken" +
	 * totalTime); }
	 */
}
