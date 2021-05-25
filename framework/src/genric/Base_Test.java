package genric;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Test implements Framework_constants
{
public WebDriver driver;
	@BeforeMethod
	public void openAppIn()
	{
	  System.setProperty(GECKO_KEY, GECKO_VALUE);
	  driver=new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	  driver.get("https://www.facebook.com/");
	}
	@AfterMethod
	public void closeAppIn(ITestResult res) throws IOException
	{
	if(ITestResult.FAILURE==res.getStatus())
	{
		Genric_Screenshot.getPhoto(driver);
		
	}
	driver.quit();
	}
}

