package RobotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bluestone {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");                                                                                            
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com");
		Thread.sleep(2000);
		Robot robot = new Robot();
		for(int i=0;i<=62;i++)
		{
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			
		}
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		//driver.findElement(By.xpath("//div[@class='lc-6azlmu e16i86ec1']"));
		

	}

}
