package testNGLearning;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsExample {

	String name="Revathi Ravi";
	
	@Test
	public void checkEqual() {
		
		Assert.assertEquals(name, "Revathi");
		
		
		
		/*
		 * if(name.equals("RevathiRavi")) { System.out.println("Name is equal");
		 * 
		 * }else { System.out.println("Name is not equal");
		 * 
		 * }
		 */
	}
}

