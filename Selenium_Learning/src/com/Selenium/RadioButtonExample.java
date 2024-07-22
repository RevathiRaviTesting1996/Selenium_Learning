package com.Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class RadioButtonExample {
	
	//main method
	public static void main(String[] args) {
		
		//set the path to edge driver
		System.setProperty("webdriver.edge.driver", "D:\\Testing Learning\\Selenium Jar File\\edgedriver_win64 (1)\\msedgedriver.exe");
		
		//initialize the browser
		WebDriver driver = new EdgeDriver();
		
		//get the link
		driver.get("https://www.leafground.com/radio.xhtml");
		
		//select the radio button
		
		WebElement selectRadioButton = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[1]/div/div/table/tbody/tr/td[1]/label"));
		selectRadioButton.click();	
		
		
		
	}
	
}
