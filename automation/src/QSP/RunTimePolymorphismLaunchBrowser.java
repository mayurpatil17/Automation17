package QSP;

import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RunTimePolymorphismLaunchBrowser {

	
	public static void main(String[] args) {
		WebDriver driver;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the browser name that you want to open either chrome or firefox:");
		String browserValue = sc.nextLine();

		if(browserValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");//to avoid IllegalStateException
			driver = new ChromeDriver();//to open chromeBrowser
			driver.manage().window().maximize();//maximize the browser
			driver.get("https://www.google.com");//launch the web application
			driver.close();//Close the browser
			
		}
		
		else if(browserValue.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");//to avoid IllegalStateException
			driver = new FirefoxDriver();//open firefox
			driver.manage().window().maximize();//maximize the browser
			driver.get("https://www.google.com");//launch the web application
			driver.close();
		}
		else
		{
			System.out.println("enter the valid input");
		}
	}



}


