package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM17 {
	
	WebDriver driver;

	public POM17(WebDriver idriver) {
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//tr[@id=\"product-1\"]//child::td[6]//child::a[1]")
	WebElement deleteProductCartPage;
	@FindBy(xpath = "//a[text()=\"Blue Top\"]")
	WebElement blueTop;	

	public void deleteProduct() {
		deleteProductCartPage.click();
	}
	
	public void productDeleteConfirm() {
		boolean firstProduct = blueTop.isDisplayed();
		System.out.println("First product is removed from the cart: " + firstProduct);
	}
}
