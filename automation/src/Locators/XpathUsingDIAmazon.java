package Locators;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class XpathUsingDIAmazon {

	public static void main(String[] args) throws InterruptedException {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the laptop");
		String laptopName = sc.nextLine();
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.amazon.in");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(laptopName);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[contains(@id,'nav')]")).click();
		Thread.sleep(4000);
		String priceOfGivenLappy = driver.findElement(By.xpath("//span[.='"+laptopName+"']/ancestor::div[@class='a-section a-spacing-none']/descendant::span[@class='a-price-whole']")).getText();
		System.out.println(priceOfGivenLappy);
	}
}
