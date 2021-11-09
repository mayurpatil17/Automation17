package Popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox {
	public static void main(String[] args) throws IOException, AWTException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev");
		driver.findElement(By.xpath("//span[.='Downloads']")).click();
		driver.findElement(By.xpath("//a[.='4.0.0']")).click();
	//	Runtime.getRuntime().exec("C:\\Users\\HP\\git\\repository\\automation\\AutoIT\\Download.exe");
		Robot robot = new Robot();
		for(int i=0;i<3;i++)
		{
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			
		}
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

}
