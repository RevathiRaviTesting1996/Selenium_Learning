package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class EditTextBoxes {

	//main method
	public static void main(String[] args) {
		
		//Set the path to edge driver
		System.setProperty("webdriver.edge.driver", "D:\\Testing Learning\\Selenium Jar File\\edgedriver_win64 (1)\\msedgedriver.exe");
		
		//initialize the browser
		WebDriver driver = new EdgeDriver();
		
		//open the link
		driver.get("https://www.leafground.com/input.xhtml");
		
		
		/*
		 * //Enter the textbox
		 * driver.findElement(By.id("j_idt88:name")).sendKeys("Revathi Ravi");
		 * 
		 * //Append value 
		 * driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div/div[1]/div/form/div[2]/div/input")).sendKeys(" Check");
		 * 
		 * //get the text 
		 * String value=driver.findElement(By.name("j_idt88:j_idt97")).getAttribute("value");
		 * System.out.println(value);
		 * 
		 * //clear the text 
		 * driver.findElement(By.name("j_idt88:j_idt95")).clear();
		 */
		 
		
		//Enter the textbox
		WebElement textBox = driver.findElement(By.id("j_idt88:name"));
		textBox.sendKeys("Revathi Ravi");
		
		//Enter the appended value
		WebElement appendBox = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div/div[1]/div/form/div[2]/div/input"));
		appendBox.sendKeys(" Checking");
		
		//Get the value form the text
		WebElement getTextBox = driver.findElement(By.name("j_idt88:j_idt97"));
		String value = getTextBox.getAttribute("value");
		System.out.println(value);
		
		//Clear the text
		WebElement clearTextBox = driver.findElement(By.name("j_idt88:j_idt95"));
		clearTextBox.clear();
		
		//Enabled key verify
		WebElement disableBox = driver.findElement(By.name("j_idt88:j_idt93"));
		boolean enabled = disableBox.isEnabled();
		System.out.println(enabled);
		
		//diabled key verify
		WebElement diabledBox = driver.findElement(By.name("j_idt88:j_idt93"));
		boolean disabled = diabledBox.isDisplayed();
		System.out.println(disabled);
		
	}
	
}
