package Advanced_Selenium;

import org.openqa.selenium.edge.EdgeDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WindowsExample {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver", "D:\\Testing Learning\\Selenium Jar File\\edgedriver_win64 (1)\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();

		driver.get("https://www.leafground.com/window.xhtml;jsessionid=node041gz2pqiu1tc16iq97z994vk54637114.node0");

		String oldWindow = driver.getWindowHandle();

		WebElement openNewWindows = driver.findElement(By.xpath("//*[@id='j_idt88:new']/span"));
		openNewWindows.click();

		Set<String> handels = driver.getWindowHandles();

		for (String newWindows : handels) {
			driver.switchTo().window(newWindows);
		}

		WebElement MenuButton = driver.findElement(By.xpath("//*[@id=\'menu-button\']"));
		MenuButton.click();
		
		driver.close();
		
		driver.switchTo().window(oldWindow);
		
		
		WebElement multipleWindows = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]/span"));
		multipleWindows.click();
		
		int numberOfWindows = driver.getWindowHandles().size();
		System.out.println("Number of Windows opened "+numberOfWindows);
		
		Set<String> newWindowOpens = driver.getWindowHandles();
		
		for (String allWindows : newWindowOpens) {
			
			if(!allWindows.equals(oldWindow)) {
				driver.switchTo().window(allWindows);
				driver.close();
			}
			
		}

		driver.quit();
		
	}


}
