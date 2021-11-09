package webDriverMethods;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandles {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//button[.='✕']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Samsung Mobiles");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		driver.findElement(By.xpath("//div[.='SAMSUNG Galaxy F12 (Sky Blue, 64 GB)']")).click();
		
		String parentHandle = driver.getWindowHandle();
		Set<String> allHandles = driver.getWindowHandles();
		
		for(String handle:allHandles)
		{
			if(parentHandle.equals(handle))
			{
				
			}
			else 
			{
				driver.switchTo().window(handle);
				driver.findElement(By.xpath("(//div[@class='_2C41yO'])[1]")).click();
				driver.findElement(By.xpath("(//input[@class='_36yFo0'])")).sendKeys("424318");
			}
		}
		
		
				
	}

}
