package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HomePageTest extends LaunchApplication {
	
	@Test
	public void Login() 
	{
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='Submit' or @class='button']")).click();
	}
		@Test
	public void SubPIM() throws InterruptedException
	{
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.linkText("PIM"))).build().perform();
		driver.findElement(By.xpath("//a[@target='rightMenu'][@class='l2_link empadd']")).click();
		Thread.sleep(2000);
	}
		@Test
		public void AddEmp()
		{
			driver.findElement(By.xpath("//input[@name='txtEmpFirstName' or @id='txtEmpFirstName']")).sendKeys("Shweta");
			//driver.findElement(By.xpath("//*[@id=\"txtEmpFirstName\"]")).sendKeys("Shweta");
			//driver.findElement(By.xpath("/html/body/form/div/div[1]/div[2]/input[3]")).sendKeys("Shweta");
		}

}
