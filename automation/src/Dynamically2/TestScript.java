package Dynamically2;

import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomeListner.class)
public class TestScript extends BaseTest {
	
	
	@BeforeMethod
	public void OrangeHRMlogin()
	{
		initialization();
	}
	
	@Test
	public void orangeHRM2()
	{
		Assert.fail();
	}
	
	@AfterMethod
	public void tearDown() 
	{
		driver.quit();
	}

}
