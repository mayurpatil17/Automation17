package Synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitelyWaitProg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://laptop-o7brkd6n/login.do");
		
     
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.titleContains("Login"));
		System.out.println("THE LOGIN PAGE TITLE IS VERIFIED--TEST CASE IS PASS");
		
	
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
		
		
		wait.until(ExpectedConditions.titleContains("Enter"));
		System.out.println("THE HOME PAGE TITLE IS VERIFIED--TEST CASE IS PASS");
		
		driver.close();
		

	}

}