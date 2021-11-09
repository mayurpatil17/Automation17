package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ConfirmationPopupByCancel {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/HP/Desktop/Selenium/JavascriptConfirmationPopup.html");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[.='I am Hungry']")).click();
		Thread.sleep(4000);
		
		Alert al = driver.switchTo().alert();
		al.dismiss();// It will choose cancel option
	}

}


