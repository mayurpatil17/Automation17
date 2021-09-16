package QSP;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {
static                                            //Opening browser with the help of static Block
{
	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
}
	public static void main(String[] args) {
		
		new FirefoxDriver();

	}

}
