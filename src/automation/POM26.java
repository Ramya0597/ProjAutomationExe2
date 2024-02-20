package automation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM26 {

	WebDriver driver;

	public POM26(WebDriver idriver) {
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//img[@src=\"/static/images/home/logo.png\"]")
	WebElement ae;
	
	public void scrollUp() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", ae);
	}
}
