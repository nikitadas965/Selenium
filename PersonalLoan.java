package test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PersonalLoan {
	
	@AfterSuite
	public void AfterSuite()
	{
		System.out.println("after suite");
	}

	@Test
	public void apitest()
	{
		System.out.println("hiPersonalLoan");
	}

	@Test(groups={"smoke"})
	public void apitest2()
	{
		System.out.println("byePersonalLoan");
	}

	@BeforeSuite
	public void beforeSuite()
	{
System.out.println("before suite");
	}

	
}
