package com.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class Learning_Practise {

	//main method
	public static void main(String[] args) {

		//set the path to edge driver
		System.setProperty("webdriver.edge.driver", "D:\\Testing Learning\\Selenium Jar File\\edgedriver_win64 (1)\\msedgedriver.exe");

		//initialize browser
		WebDriver driver = new EdgeDriver();


		//get the link
		driver.get("https://www.leafground.com/input.xhtml;jsessionid=node0unn9rok4i0y1w5u6vkohlq3723879.node0");

		System.out.println("broser title is "+driver.getTitle());

		//Search text and Enter text

		driver.get("https://www.google.com/");

		driver.findElement(By.id("APjFqb")).sendKeys("Automation online" + Keys.ENTER);


		//hyperlink 
		driver.get("https://www.leafground.com/link.xhtml");

		//driver.findElement(By.linkText("Go to Dashboard")).click();

		driver.findElement(By.partialLinkText("without clicking me.")).click();


		//text
		driver.get("https://www.leafground.com/input.xhtml");

		WebElement entername = driver.findElement(By.id("j_idt88:name"));
		entername.sendKeys("Revathi Ravi");


		WebElement appended = driver.findElement(By.id("j_idt88:j_idt91"));
		appended.sendKeys("Checking");

		WebElement clearandupdate = driver.findElement(By.id("j_idt88:j_idt91"));
		clearandupdate.clear();
		clearandupdate.sendKeys("Selenium");
		
		WebElement getvalue = driver.findElement(By.id("j_idt88:j_idt97"));
		String value = getvalue.getAttribute("value");
		System.out.println(" the value is" + value);
		
		WebElement disablevalue = driver.findElement(By.id("j_idt88:j_idt93"));
		boolean enabled = disablevalue.isEnabled();
		System.out.println(enabled);
		
		

	}

}
