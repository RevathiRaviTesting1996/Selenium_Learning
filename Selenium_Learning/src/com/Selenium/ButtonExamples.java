package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ButtonExamples {

	//main method
	public static void main(String[] args) {
		
		//set the path to edge driver
		System.setProperty("webdriver.edge.driver","D:\\Testing Learning\\Selenium Jar File\\edgedriver_win64 (1)\\msedgedriver.exe");
		
		//initialize the browser
		WebDriver driver = new EdgeDriver();
		
		//get the link
		driver.get("https://www.leafground.com/button.xhtml");
		
		//Get the button position
		WebElement getButtonPossition = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[1]/button/span"));
		Point xypoint = getButtonPossition.getLocation();
		int x = xypoint.getX();
		int y = xypoint.getY();
		System.out.println("X Value is " + x +"\nY Value is " + y);
		
		// find the button color
		WebElement getButtonColor = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[4]/button/span[2]"));
		String color = getButtonColor.getCssValue("background");
		System.out.println("Button color is " + color);
		
		//find the button size
		WebElement getButtonSize = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[2]/div[1]/button/span[2]"));
		int height = getButtonSize.getSize().getHeight();
		int width = getButtonSize.getSize().getWidth();
		System.out.println("Button height is "+height +"\nButton Widht is "+width);
		
		
		//Click the Button
		WebElement clickButton = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[1]/button/span"));
		clickButton.click();
		
	}
}
