package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(2000);
		driver.close();

	}

}
