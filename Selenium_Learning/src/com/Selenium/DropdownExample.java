package com.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownExample {

	//main method
	public static void main(String[] args) {
		
		//set the path to edge driver
		System.setProperty("webdriver.edge.driver", "D:\\Testing Learning\\Selenium Jar File\\edgedriver_win64 (1)\\msedgedriver.exe");
		
		//initialize the browser
		WebDriver driver = new EdgeDriver();
		
		//get the url
		driver.get("https://www.leafground.com/select.xhtml");
		
		
		//select the dropdown value
		WebElement dropdown1 = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[1]/div/div/select"));
		Select 	select = new Select(dropdown1);
		select.selectByIndex(3);
		//select.selectByValue("selenium");
		//select.selectByVisibleText("Playwright");
		
		
		//get how many option you have
		WebElement dropdown2 = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[2]/div/div/div/label"));
		Select select1 = new Select(dropdown2);
		List<WebElement> listOfOption = select1.getOptions();
		int Size = listOfOption.size();
		System.out.println(Size);
		  
		
	}
	
	
}
