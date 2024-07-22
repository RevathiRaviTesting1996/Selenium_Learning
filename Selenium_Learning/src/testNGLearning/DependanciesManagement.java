package testNGLearning;

import org.testng.annotations.Test;

public class DependanciesManagement {

	//Problem1: You have to Admit a student to engineering
	//problem2: You have to Admit a student to higher secondary
	
	//here priority is not working because here dependancy
	
	@Test(enabled = false)
	public void highSchool() {
		System.out.println("High School");
	}
	
	@Test(dependsOnMethods = "highSchool")
	public void higherSecondary() {
		System.out.println("Higher Sec School");	
	}
	
	@Test(dependsOnMethods = "higherSecondary")
	public void engineering() {
		System.out.println("College");
	}
	
}
