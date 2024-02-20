package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCasesPage {

	@Test
	public void testCasesPg() {
		WebDriver driver = new ChromeDriver();
		POM tc7 = new POM(driver);
		POM7 tc=new POM7(driver);
		tc7.launchApp();
		tc.testcases();
		tc.testcaseTitleVisible();
	}

}