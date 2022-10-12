package TestNGFlags;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class readDataFromXMLFile {
	WebDriver driver;
  @Test
  @Parameters("browserValue")
  public void lauchBrowser(String browserValue) {
	  if(browserValue.equalsIgnoreCase("chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("https://www.google.com");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.switchTo().activeElement().sendKeys("I am executed in chrome");
		  driver.close();
	  }
	 
	  else if(browserValue.equalsIgnoreCase("firefox"))
		  {
			  System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			  driver=new FirefoxDriver();
			  driver.get("https://www.google.com");
			  driver.manage().window().maximize();
			  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			  driver.switchTo().activeElement().sendKeys("I am executed in firefox");
			  driver.close();
		  }
	  else 
	  {
		  Reporter.log("Invalid Input, Choose from Chrome or Firefox", true);
	  }
  }
}
