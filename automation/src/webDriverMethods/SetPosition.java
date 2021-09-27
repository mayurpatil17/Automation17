package webDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Point targetPosition= new Point(10,10);
		driver.manage().window().setPosition(targetPosition);
		
		Dimension targetSize = new Dimension(100,800);
		driver.manage().window().setSize(targetSize);
		
		driver.get("https://www.google.com");
		
		Thread.sleep(3000);
		
		driver.close();

	}

}
