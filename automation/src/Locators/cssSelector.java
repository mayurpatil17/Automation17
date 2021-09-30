package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelector {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[name='q']")).sendKeys("Automation",Keys.ENTER);
		Thread.sleep(3000);
		driver.close();
		
	}

}
