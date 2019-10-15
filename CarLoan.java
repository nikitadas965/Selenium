package test;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CarLoan extends TestBase{
	
	@Test
	public void OpenBrowser()
	{
		System.out.println("executing broowser");
	}
	
	//IF IT IS REQUIRED IN ALL METHODS, THIS ANNOTATION IS REQUIRED 
	@Parameters({"URL"}) // that value will come here. 
	@Test
	public void login(String url)
	{
		System.out.println("car loan login");
		System.out.println(url); // catching here 

	}
	
	@Test(timeOut=400)  // if it is taking more time and test cases are getting affected so to work on that
	public void logout()
	{
		System.out.println("car loan logout");
	}
	
	@BeforeTest
	public void beforeTestMethod()
	{
		System.out.println("before test");
	}
	
	@AfterTest
public void afterTest()
{
		System.out.println("after test");
		
}
	
// will run before and after of all the test cases if this test class
}
