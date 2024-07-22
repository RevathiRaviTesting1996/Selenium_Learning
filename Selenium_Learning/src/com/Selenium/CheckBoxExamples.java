package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class CheckBoxExamples {

	//main method
	public static void main(String[] args) {
		
		//set the path to edge driver
		System.setProperty("webdriver.edge.driver", "D:\\Testing Learning\\Selenium Jar File\\edgedriver_win64 (1)\\msedgedriver.exe");
		
		//initialize the browser
		WebDriver driver = new EdgeDriver();
		
		//get the path
		driver.get("https://www.leafground.com/checkbox.xhtml;jsessionid=node0kxphw5qxnhkx1psezm90l6f083791893.node0");
		
		//select the checkbox
		WebElement selectCheckBox = driver.findElement(By.xpath("//*[@id=\'j_idt87:j_idt89\']/div[2]"));
		selectCheckBox.click();
		
		//is selected
		WebElement firstElement = driver.findElement(By.xpath("//*[@id=\"j_idt87:basic\"]/tbody/tr/td[2]/div/div[2]"));
		if(firstElement.isSelected()) {
			firstElement.click();
		}
		
		
	}
	
}
