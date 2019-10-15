package test;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EducationLoan {

	//depends on pr jo mentioned hai pehle wo execute hoga
	@Test(dependsOnMethods={"EducationLoansign" , "EducationLoandis"})
	public void EducationLoandisplay()
	{
		System.out.println("ed loan display1");
	}
	@Test(dataProvider = "getData") // pass the method name here as variable name
	public void EducationLoandis(String username, String password)
	{
		System.out.println("ed loan display2");
		System.out.println(username);
		System.out.println(password);

		//THIS WILL RUN 3 TIMES(EQUAL TO THE NO> OF TEST SETS

	}
	@Test
	public void EducationLoansign(ITestResult result)
	{
		System.out.println("ed loan display3");
		/*	Assert.assertTrue(false); // failing test
		 */	}

	/************************************************************************/

	//data provider
	/*If there are multiple sets to be tested like:
	 * 1. username password, good credit
	 * 2. no credit
	 * 3. fradulent
	 * 
	 * Basically test cases having many combinations*/


	@DataProvider
	public Object[][] getData()
	{
		Object[][] data= new Object[3][2];


		//first set
		data[0][0] ="first set combination username";
		data[0][1]="password";

		//second set
		data[1][0] ="second set combination username";
		data[1][1]="password";

		//third set
		data[2][0] ="third set combination username";
		data[2][1]="password";
		
		return  data;
	}
	
	//PURPOSE OF PARAMETERIZATION
/** we need to verify that our system is taking all set 
 * of combinations which it expected to support.

Here comes Parameterization in the picture. 
To pass multiple data to the application at runtime, 
we need to parameterize our test scripts.**/
}
