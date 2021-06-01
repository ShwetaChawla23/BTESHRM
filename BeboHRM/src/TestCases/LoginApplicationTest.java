package TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginApplicationTest extends LaunchApplication{
	//String login;

	@BeforeTest
	public void validation_check()
	{
		String expected_title, title;
		expected_title = "BTES HRM";
		title = driver.getTitle();
		if(expected_title.equals(title))
		{
			System.out.println("@BeforeTest " + "You are on right page");
		}
		else
		{
			System.out.println("@BeforeTest " + "You are not on right page");
		}
		if (driver.findElement(By.xpath("/html/body/table[1]/tbody/tr/td[1]/img")).isDisplayed())
		{
			System.out.println("Image is dispalyed");
		}
		else {
			System.out.println("Image is not dispalyed");
		}
	}

	@Test
	public void validCred_login() throws InterruptedException
	{
		driver.findElement(By.name("txtUserName")).sendKeys("Shweta@123");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");     //name locator
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(2000);

	}

	@Test
	public void LoginCred1() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name ='txtPassword']")).sendKeys("Shweta@123");  //xpath locator
		driver.findElement(By.xpath("//input[@name='Submit' or @class='button']")).click();
		Thread.sleep(2000);    
	}

	@Test
	public void LoginCred2() throws InterruptedException
	{
		driver.findElement(By.cssSelector("[name = \"txtUserName\"]")).sendKeys("123456");
		driver.findElement(By.cssSelector("input[name = \"txtPassword\"]")).sendKeys("abchdef"); //csslocator
		driver.findElement(By.cssSelector("input[name=\"Submit\"]")).click(); 
		Thread.sleep(2000);
	}

	/*@Test
	public void LoginCred3() throws InterruptedException 
	{
		
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("");
		driver.findElement(By.xpath("//input[@name='Submit' or @class='button']")).click();
		//Assert.assertTrue(login);
		Thread.sleep(2000);
	}*/
	@Test
	public void LoginCred4() throws InterruptedException 
	{
		driver.findElement(By.name("txtUserName")).sendKeys("");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='Submit' or @class='button']")).click();
		Thread.sleep(2000);
	}
	/*@Test
	public void LoginCred5() throws InterruptedException 
	{
		driver.findElement(By.name("txtUserName")).sendKeys("");
		driver.findElement(By.name("txtPassword")).sendKeys("");
		driver.findElement(By.xpath("//input[@name='Submit' or @class='button']")).click();
		Thread.sleep(2000);

	}*/
	@Test
	public void LoginCred6() throws InterruptedException
	{
		driver.findElement(By.name("txtUserName")).sendKeys("123456");
		driver.findElement(By.name("txtPassword")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@name='Submit' or @class='button']")).click();
		Thread.sleep(2000);
	}
	@Test
	@DataProvider(name="LoginCred")
	public Object[][] logincredcheck() 
	{
		Object[][] data = new Object[2][2];

		data[0][0] = "admin";
		data[0][1] = "admin";
		data[1][0] = "adm1";
		data[1][1] = "admin";

		return data;
	}

	@Test(dataProvider = "LoginCred")
	public void test1(String username, String password) throws InterruptedException
	{
		driver.findElement(By.name("txtUserName")).sendKeys(username);
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		driver.findElement(By.xpath("//input[@name='Submit' or @class='button']")).click();
		driver.navigate().refresh();
		driver.navigate().back();
		Thread.sleep(5000);
	}
}



