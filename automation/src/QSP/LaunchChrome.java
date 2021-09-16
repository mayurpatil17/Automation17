package QSP;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(5000);
		driver.close();
	}

}
