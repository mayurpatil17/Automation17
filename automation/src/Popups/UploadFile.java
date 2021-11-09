package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UploadFile {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
	driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	driver.findElement(By.xpath("//b[text()='PIM']")).click();
	driver.findElement(By.xpath("//a[@id='menu_pim_addEmployee']")).click();
	driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Mayur");
	driver.findElement(By.xpath("//input[@id='middleName']")).sendKeys("Kishor");
	driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Patil");
	driver.findElement(By.xpath("//input[@id='employeeId']")).clear();
	driver.findElement(By.xpath("//input[@id='employeeId']")).sendKeys("123");	
	WebElement target = driver.findElement(By.xpath("//input[@name='photofile']"));
	Actions act = new Actions(driver);
	act.doubleClick(target).perform();
	}

}
