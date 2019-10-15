package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HomeLoan {
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("before class");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("after class");
	}


	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("before method");
	}
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("after method");
	}
	@Test(groups={"smoke"})
	public void mobie()
	{
		System.out.println("hiHomeLoan");
	}
	
@Test(enabled=false)
	public void mobile2()
	{
		System.out.println("byeHomeLoan");
	}

@Parameters({"URLTest" , "APIkey"})
@Test
public void mobile3(String url,String api)
{
	System.out.println("byeHomeLoan");
	System.out.println(url);
	System.out.println(api);
}


}
