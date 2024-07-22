package testNGLearning;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListernersExample implements ITestListener {
	

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test case is going to execute");
		
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case is passed");
		
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test case is failed");
		
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case is skipped");
		
	}
	
	
	public void onTestFailedWithinSuccessPercentage(ITestResult result) {
System.out.println("test case success percentage");
		
	}
	
	
	public void onStart(ITestResult context) {
		System.out.println("Before everything");
		
	}
	
	
	public void onTestFinish(ITestResult context) {
		System.out.println("After finishing");
		
	}
	
}
 