package testNGLearning;

import org.testng.annotations.Test;

public class SkipTestCase {

	@Test(priority=0)
	public void startTheCar() {
		System.out.println("start the Car");
	}
	
	@Test(priority=5,enabled = false)
	public void turnOnMusic() {
		System.out.println("Turn on the Music ");
	}
	
	@Test(priority=1)
	public void putFirstGear() { 
		System.out.println("First Gear");
	}
	
	@Test(priority=2)
	public void putSecondGear() {
		System.out.println("second Gear");
	}
	
	@Test(priority=3)
	public void putThirdGear() {
		System.out.println("Third Gear");
	}
	
	@Test(priority=4)
	public void putFourthGear() {
		
		System.out.println("fourth Gear");
	}
	
	
}