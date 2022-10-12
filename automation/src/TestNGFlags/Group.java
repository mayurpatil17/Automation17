package TestNGFlags;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Group {
	@Test(groups = "FUNCTIONAL")
	public void ft1() {
		Reporter.log("Testcase of ft1", true);
	}

	@Test(groups = "INTEGRATION")
	public void it1() {
		Reporter.log("Testcase of it1", true);
	}
	@Test(groups = "SMOKE")
	public void st1() {
		Reporter.log("Testcase of st1", true);
	}

	@Test(groups = "FUNCTIONAL")
	public void ft2() {
		Reporter.log("Testcase of ft2", true);
	}

	@Test(groups = "INTEGRATION")
	public void it2() {
		Reporter.log("Testcase of it2", true);
	}
	@Test(groups = "SMOKE")
	public void st2() {
		Reporter.log("Testcase of st2", true);
	}
	@Test(groups = "FUNCTIONAL")
	public void ft3() {
		Reporter.log("Testcase of ft3", true);
	}

	@Test(groups = "INTEGRATION")
	public void it3() {
		Reporter.log("Testcase of it3", true);
	}
	@Test(groups = "SMOKE")
	public void st3() {
		Reporter.log("Testcase of st3", true);
	}
	@Test(groups = "FUNCTIONAL")
	public void ft4() {
		Reporter.log("Testcase of ft4", true);
	}

	@Test(groups = "INTEGRATION")
	public void it4() {
		Reporter.log("Testcase of it4", true);
	}
	@Test(groups = "SMOKE")
	public void st4() {
		Reporter.log("Testcase of st4", true);
	}
	@Test(groups = "FUNCTIONAL")
	public void ft5() {
		Reporter.log("Testcase of ft5", true);
	}

	@Test(groups = "INTEGRATION")
	public void it5() {
		Reporter.log("Testcase of it5", true);
	}
	@Test(groups = "SMOKE")
	public void st5() {
		Reporter.log("Testcase of st5", true);
	}
	@Test(groups = "FUNCTIONAL")
	public void ft6() {
		Reporter.log("Testcase of ft6", true);
	}

	@Test(groups = "INTEGRATION")
	public void it6() {
		Reporter.log("Testcase of it6", true);
	}
	@Test(groups = "SMOKE")
	public void st6() {
		Reporter.log("Testcase of st6", true);
	}


}
