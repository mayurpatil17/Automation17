package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.xpath("//a[@class='login']")).click();
		driver.findElement(By.id("email_create")).sendKeys("mayurpatil1@gmail.com");
		driver.findElement(By.id("SubmitCreate")).click();

		Thread.sleep(5000);
		driver.findElement(By.id("submitAccount")).click();

		String errorMsg = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/p")).getText();

		if (errorMsg.contains("There are 8 errors")) {
			System.out.println("Error for mandatory fields, Test case passed");

		} else {
			System.out.println("Testcase Failed");

		}
		Thread.sleep(3000);


		driver.close();

	}

}
