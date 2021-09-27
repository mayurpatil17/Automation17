package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IDFacebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("abcdef");
		Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys("132165");
		Thread.sleep(3000);
		driver.findElement(By.id("u_0_d_wo")).click();
		Thread.sleep(3000);
		driver.close();

	}

}
