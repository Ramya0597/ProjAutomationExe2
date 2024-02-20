package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM7 {
	
	WebDriver driver;

	public POM7(WebDriver idriver) {
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()=\" Test Cases\"]")
	WebElement testcasesbtn;
	@FindBy(xpath = "//h2[@class=\"title text-center\"]")
	WebElement testcasevisible;
	
	public void testcases() {
		testcasesbtn.click();
	}

	public void testcaseTitleVisible() {
		boolean currentPage = testcasevisible.isDisplayed();
		System.out.println("user is navigated to test cases page successfully: " + currentPage);
	}

}
