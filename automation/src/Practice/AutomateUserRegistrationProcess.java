package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import HandlingSingleSelectDropdown.selectByValue;

public class AutomateUserRegistrationProcess {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.xpath("//a[@class='login']")).click();
		driver.findElement(By.id("email_create")).sendKeys("pm6695@gmail.com");
		driver.findElement(By.id("SubmitCreate")).click();
		driver.findElement(By.xpath("//label[@for='id_gender1']")).click();

		driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("Mayur");
		driver.findElement(By.id("customer_lastname")).sendKeys("Patil");
		driver.findElement(By.id("passwd")).sendKeys("Mayur@123");

		WebElement element = driver.findElement(By.id("days"));
		Select sel = new Select(element);
		sel.selectByValue("1");

		WebElement element2 = driver.findElement(By.id("months"));
		Select month = new Select(element2);
		month.selectByValue("6");

		WebElement element3 = driver.findElement(By.id("years"));
		Select year = new Select(element3);
		year.selectByValue("1995");

		driver.findElement(By.id("firstname")).sendKeys("Mayur");
		driver.findElement(By.id("lastname")).sendKeys("Patil");
		driver.findElement(By.id("company")).sendKeys("Calin Info Systems Pvt.Ltd.");
		driver.findElement(By.id("address1")).sendKeys("A/P Mohadi Pra.Danagri Tal.Dhule, Dist.Dhule.Pin-424318");
		driver.findElement(By.id("city")).sendKeys("Dhule");

		WebElement element4 = driver.findElement(By.id("id_state"));
		Select state = new Select(element4);
		state.selectByValue("5");

		driver.findElement(By.id("postcode")).sendKeys("43431");

		WebElement element5 = driver.findElement(By.id("days"));
		Select country = new Select(element5);
		country.selectByValue("21");
		driver.findElement(By.id("phone_mobile")).sendKeys("8888210098");
		driver.findElement(By.id("submitAccount")).click();




		Thread.sleep(5000);
		driver.close();





	}

}
