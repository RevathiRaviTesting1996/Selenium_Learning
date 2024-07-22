package com.Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AlertExamples {

	
	//main Method	
	public static void main(String[] args) throws InterruptedException {
		
		//set the path to edge driver
		
		System.setProperty("webdriver.edge.driver",  "D:\\Testing Learning\\Selenium Jar File\\edgedriver_win64 (1)\\msedgedriver.exe");
		
		//initialize the browser
		
		WebDriver driver = new EdgeDriver();
		
		//get the link
		driver.get("https://www.leafground.com/alert.xhtml");
		
		//find element in click button
		WebElement alertbox = driver.findElement(By.id("j_idt88:j_idt91"));
		alertbox.click();
		
		//switch to alert box
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		alert.accept();
		
		WebElement confrimbox = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[2]/button/span[2]"));
		confrimbox.click();
		
		Alert confrimButton = driver.switchTo().alert();
		Thread.sleep(3000);
		confrimButton.dismiss();
		
		WebElement Promtalert = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[2]/div[1]/button/span[2]"));
		Promtalert.click();
		
		Alert prompttext = driver.switchTo().alert();
		prompttext.sendKeys("Revathi Ravi");
		Thread.sleep(3000);
		prompttext.accept();
		
		
		
		
		
	}
	
}
