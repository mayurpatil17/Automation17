package TestNGFlags;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Calculator {
	WebDriver driver;

	@Test(priority = -1)
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.calculator.net");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@Test(priority = 0)
	@Parameters({"operand1","addition","operand2"})
	public void addition(int a,String add, int b) throws InterruptedException
	{
		driver.findElement(By.xpath("//span[.='"+a+"']")).click();
		driver.findElement(By.xpath("//span[.='"+add+"']")).click();
		driver.findElement(By.xpath("//span[.='"+b+"']")).click();
		String result = driver.findElement(By.id("sciOutPut")).getText();
		Reporter.log(result,true);
		Thread.sleep(3000);
		driver.navigate().refresh();

	}
	@Test(priority = 1)
	@Parameters({"operand1","substraction","operand2"})
	public void substraction(int a,String sub, int b) throws InterruptedException
	{
		driver.findElement(By.xpath("//span[.='"+a+"']")).click();
		driver.findElement(By.xpath("//span[.='"+sub+"']")).click();
		driver.findElement(By.xpath("//span[.='"+b+"']")).click();
		String result = driver.findElement(By.id("sciOutPut")).getText();
		Reporter.log(result,true);
		Thread.sleep(3000);
		driver.navigate().refresh();

	}
	@Test(priority = 2)
	@Parameters({"operand1","multiplication","operand2"})
	public void multiplication(int a,String multi, int b) throws InterruptedException
	{
		driver.findElement(By.xpath("//span[.='"+a+"']")).click();
		driver.findElement(By.xpath("//span[.='"+multi+"']")).click();
		driver.findElement(By.xpath("//span[.='"+b+"']")).click();
		String result = driver.findElement(By.id("sciOutPut")).getText();
		Reporter.log(result,true);
		Thread.sleep(3000);
		driver.navigate().refresh();

	}
	@Test(priority = 3)
	@Parameters({"operand1","division","operand2"})
	public void division(int a,String div, int b) throws InterruptedException
	{
		driver.findElement(By.xpath("//span[.='"+a+"']")).click();
		driver.findElement(By.xpath("//span[.='"+div+"']")).click();
		driver.findElement(By.xpath("//span[.='"+b+"']")).click();
		String result = driver.findElement(By.id("sciOutPut")).getText();
		Reporter.log(result,true);
		Thread.sleep(3000);
		driver.navigate().refresh();

	}
	
	
}

