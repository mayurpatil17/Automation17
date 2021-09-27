package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		Thread.sleep(3000);
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		Thread.sleep(3000);
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		driver.close();

	}

}
