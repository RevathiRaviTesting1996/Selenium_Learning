package testNGLearning;

import org.testng.annotations.Test;

public class GroupingExample {

	/*
	Scenario : A big basket is having a different king of Mobile.
	Let us say there are Apple phones, Moto, Vivo and Lenovo.
	I want to run tests only for VIVO and Moto phones. write a program for that. 
	 */
	@Test(groups= {"Apple"})
	public void apple1() {
		System.out.println("Apple testing");
	}

	@Test(groups= {"Apple"})
	public void apple2() {
		System.out.println("Apple testing");

	}
	
	@Test(groups= {"Moto"})
	public void moto1() {
		System.out.println("Moto testing");
	}

	@Test(groups= {"Moto"})
	public void moto2() {

		System.out.println("Moto testing");
	}

	@Test(groups= {"Vivo"})
	public void vivo1() {
		System.out.println("VIVo testing");
	}

	@Test(groups= {"Vivo"})
	public void vivo2() {
		System.out.println("VIVO testing");
	}
	
	@Test(groups= {"Lenovo"})
	public void Lenovo1() {
		System.out.println("Lenovo testing");
	}
	
	@Test(groups= {"Lenovo"})
	public void Lenovo2() {
		System.out.println("Lenovo testing");
	}

}
