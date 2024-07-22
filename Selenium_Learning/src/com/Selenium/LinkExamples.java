package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class LinkExamples {

	//main method
	public static void main(String[] args) {
		
		//set the path to edge driver
		System.setProperty("webdriver.edge.driver", "D:\\Testing Learning\\Selenium Jar File\\edgedriver_win64 (1)\\msedgedriver.exe");
		
		//initialize the browser
		WebDriver driver = new EdgeDriver();
		
		//open testsinglink page
		driver.get("https://www.leafground.com/link.xhtml;jsessionid=node01wloslnv1ze2vk5i5w7bc8d5b3501610.node0");
		
		//get the title name
		System.out.println("The title is : " + driver.getTitle());
		
		//used linkText
		//driver.findElement(By.linkText("Go to Dashboard")).click();
		
		//Using Partial linkText
		
		driver.findElement(By.partialLinkText("without clicking me.")).click();
		
		
		
	}
	
}
