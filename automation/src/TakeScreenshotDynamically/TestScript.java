package TakeScreenshotDynamically;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListner.class)
public class TestScript extends BaseTest{

	@Test
	public void testFlipkart1()
	{
		Assert.fail();
	}
	@Test
	public void testFlipkart2()
	{
		Assert.fail();
	}
	@Test
	public void testFlipkart3()
	{
		Assert.fail();
	}
	@Test
	public void testFlipkart4()
	{
		Assert.fail();
	}
	@Test
	public void testFlipkart5()
	{
		Assert.fail();
	}
	@BeforeMethod
	public void setup()
	{
		Initialization();
	}


	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}

