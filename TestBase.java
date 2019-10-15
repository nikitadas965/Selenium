package test;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestBase {

	
	
	 @BeforeTest()
	  public void beforeTest() throws IOException {
		 Properties prop = new  Properties();
			
			FileInputStream fileInputStream = 
					new FileInputStream("C:\\Users\\nikitdas.CORP\\Desktop\\Automation\\workspace_automation\\Project2\\src\\datadriven.properties");

			prop.load(fileInputStream);
			System.setProperty(prop.getProperty("webdriver"), prop.getProperty("systemPropertyPath"));
	  
	  }

	 public WebDriver driver = null;
	 
	@Test
	public void login() throws IOException
	{

		Properties prop = new  Properties();
		
		FileInputStream fileInputStream = 
				new FileInputStream("C:\\Users\\nikitdas.CORP\\Desktop\\Automation\\workspace_automation\\Project2\\src\\datadriven.properties");

		prop.load(fileInputStream);

		/*System.out.println(prop.getProperty("username"));
	//driver.findElement(By.xpath("").sendKeys(username) ----->> selenium code
		 */	
		/**LOADING PROPERTIES DYNAMICALLY
		 * GIVING THE PATH IN FILE INPUT STREAM OBJECT. THE LOADING IT AND GETTING THE
		 * PROPERTY BY CALLING THE KEY
		 * 
		 * OUTPUT IS SELENIUM*/

		////////choosing browser dynamically /////
		if(prop.getProperty("browser").equals("chrome"))
		{
			driver = new ChromeDriver();
		}

		else if(prop.getProperty("browser").equals("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else
		{
			driver = new InternetExplorerDriver();
		}
		driver.get(prop.getProperty("url"));
	}


}
