package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class LaunchApplication {
	WebDriver driver;
	String path;
	
	@BeforeSuite
	public void beforesuite()
	{
		/*System.setProperty("webdriver.chrome.driver", "E:\\Shweta\\Selenium\\chrome\\chromedriver.exe");

	     driver = new ChromeDriver();
	     driver.get("http://182.76.176.205/hrm/login.php");*/

		path = System.getProperty("user.dir")+"//Browser1//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		driver.get("http://182.76.176.205/hrm/login.php");
		 
	}
	@AfterSuite
   public void aftersuite()
   {
		driver.close();
   }
}

