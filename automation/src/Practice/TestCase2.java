package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class TestCase2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.xpath("//a[@class='login']")).click();
		driver.findElement(By.id("email_create")).sendKeys("gmail@.com123");
		driver.findElement(By.id("SubmitCreate")).click();


		String error = driver.findElement(By.xpath("//*[@id=\"create_account_error\"]/ol/li")).getText();


		if (error.contains("Invalid email address.")) {
			System.out.println("TestCase Passed");

		} else {
			System.out.println("TestCase Failed");

		}

		driver.close();


	}

}
