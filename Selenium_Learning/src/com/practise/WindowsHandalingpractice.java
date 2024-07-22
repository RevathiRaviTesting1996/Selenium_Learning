package com.practise;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowsHandalingpractice {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "D:\\Testing Learning\\Selenium Jar File\\edgedriver_win64 (1)\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.leafground.com/window.xhtml;jsessionid=node041gz2pqiu1tc16iq97z994vk54637114.node0");
		
		String oldWindow = driver.getWindowHandle();
		
		WebElement openNewWindow = driver.findElement(By.xpath("//*[@id=\"j_idt88:new\"]/span"));
		openNewWindow.click();
		
		Set<String> Handles = driver.getWindowHandles();
		
		for (String newWindow : Handles) {
			driver.switchTo().window(newWindow);
			
		}
		
		Thread.sleep(5000);
		
		driver.close();
	}
	
	
}
