package RobotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");                                                                                            
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev");
		Thread.sleep(2000);
		WebElement target = driver.findElement(By.xpath("//h4[.='Selenium WebDriver']"));
	
		Actions act = new Actions(driver);
		act.contextClick(target).perform();;
		Robot robot = new Robot();
		

		for(int i=1;i<=9;i++)
		{
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
		}
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		


	}

}
