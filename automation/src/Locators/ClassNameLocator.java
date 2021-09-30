package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.switchTo().activeElement().sendKeys("Ross Geller",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.className("lNPNe")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("lNPNe")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("lNPNe")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("lNPNe")).click();
		Thread.sleep(2000);
		driver.close();
		

	}

}
