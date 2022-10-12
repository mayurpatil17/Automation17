package Assertion;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HardAssert {

	@Test
	public void H()
	{
		Reporter.log("Launch the browser",true);
		Reporter.log("Launch the web application",true);
		Reporter.log("Verify the login page title",true);
		Assert.assertEquals(true, true);                      //Hard Assert
		Reporter.log("Login to the application", true);
		Assert.assertEquals(false, true);                     //Hard Assert
		Reporter.log("Verify the home page title", true);
	}
}
