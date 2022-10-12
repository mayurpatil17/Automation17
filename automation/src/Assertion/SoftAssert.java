package Assertion;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SoftAssert {

	@Test
	public void a()
	{
		Reporter.log("Launch the browser", true);
		Reporter.log("Launch the web application", true);
		Reporter.log("Verify the Login Page title", true);
		org.testng.asserts.SoftAssert softassert = new org.testng.asserts.SoftAssert();  //soft assert object creation
		softassert.assertEquals(false, true);                                            //soft assert
		Reporter.log("Login to the application", true);
		Reporter.log("Verify the home page title", true);

		softassert.assertAll();                                            // It will show failed test cases,it is very mandatory.

	}

}
