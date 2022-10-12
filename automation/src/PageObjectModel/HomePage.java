package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath = "//a[.='Logout']") private WebElement lgt;

	//Initialization
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}


	// Utilization
	public WebElement getLgt() {
		return lgt;
	}
	
	public void setLgt(WebElement logout) {
		logout=lgt;
	}
	//Operational Methods
	
	public void logoutActiTime() 
	{
		lgt.click();
	}
	
	
	







}

