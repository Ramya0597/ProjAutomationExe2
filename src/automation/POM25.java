package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM25 {
	
	WebDriver driver;

	public POM25(WebDriver idriver) {
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//a[@id=\"scrollUp\"]")
	WebElement scrollUpArrow;
	@FindBy(xpath = "//*[text()=\"Full-Fledged practice website for Automation Engineers\"]")
	WebElement textVisible;
	
	public void scrollUpArrowBtn() {
		scrollUpArrow.click();
	}
	
	public void textVisibleScrollUp() {
		boolean textDisplay= textVisible.isDisplayed();
		System.out.println("'Full-Fledged practice website for "
				+ "Automation Engineers' text is visible on screen: "+textDisplay);
	}
}
