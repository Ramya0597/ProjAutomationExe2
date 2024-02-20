package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM22 {
	
	WebDriver driver;

	public POM22(WebDriver idriver) {
		driver = idriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h2[text()=\"recommended items\"]")
	WebElement recommendedItems;
	@FindBy(xpath = "//*[@id=\"recommended-item-carousel\"]/div/div[2]/div[1]/div/div/div/a")
	WebElement stylishDressRI;
	@FindBy(xpath = "//*[@id=\"cartModal\"]/div/div/div[2]/p[2]/a/u")
	WebElement viewCartRI;
	@FindBy(xpath = "//a[text()=\"Stylish Dress\"]")
	WebElement specificProductRI;
	
	
	public void recommendedItemsVerify() {
		boolean recommendedVisible=recommendedItems.isDisplayed();
		System.out.println("Recommended Items Visible: "+recommendedVisible);
	}
	
	public void addToCartRI() {
		stylishDressRI.click();
	}
	
	public void viewCartBtnRI() {
		viewCartRI.click();
	}
	
	public void productCartPage() {
		boolean productDisplay=specificProductRI.isDisplayed();
		System.out.println("product is displayed in cart page: "+productDisplay);
	}
	
	
}
