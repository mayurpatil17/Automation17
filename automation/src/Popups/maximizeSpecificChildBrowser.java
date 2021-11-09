package Popups;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maximizeSpecificChildBrowser{

	private static final Object Cognizant = null;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com");
		Thread.sleep(3000);
		String parentHandle = driver.getWindowHandle();
		Set<String> allHandles = driver.getWindowHandles();
		
		for(String wh:allHandles)
		{
			driver.switchTo().window(wh);
			String title = driver.getTitle();
			System.out.println(title);
			
			
			if(title.equals("Cognizant"))
			{
				driver.manage().window().maximize();
				
				
			}
			else
			{
				driver.close();
			}
		}
	}

}
