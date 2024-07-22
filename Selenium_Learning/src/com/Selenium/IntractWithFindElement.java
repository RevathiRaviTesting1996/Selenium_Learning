package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class IntractWithFindElement {

	
	//mainMethod
	public static void main(String[] args) {
		
		//set the path to edge driver		
		System.setProperty("webdriver.edge.driver", "D:\\Testing Learning\\Selenium Jar File\\edgedriver_win64 (1)\\msedgedriver.exe");
		
		//initialize browser
		WebDriver driver = new EdgeDriver();
		
		//Open google
		driver.get("https://www.google.com/");
		
		//get browser title name
		System.out.println("The title is :" + driver.getTitle());
		
		//Findelement for search text		
		driver.findElement(By.id("APjFqb")).sendKeys("Automation Testing" + Keys.ENTER);
		
		System.out.println("page will open ");
		
	}
	
}
