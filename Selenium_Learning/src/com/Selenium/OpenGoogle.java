package com.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenGoogle {

	
	public static void main(String[] args) {
		
		// double slash is used for single line comment
		
		//Set the path to edge driver
		
		System.setProperty("webdriver.edge.driver", "D:\\Testing Learning\\Selenium Jar File\\edgedriver_win64 (1)\\msedgedriver.exe");
	
		//initialize edgedriver
		
		WebDriver driver = new EdgeDriver();
		
		//Open Google
		driver.get("https://www.google.com/");
		
		//Print page title
		System.out.println("Page title is : "+driver.getTitle());
		
		//close browser
		driver.close();
		
	}
}
