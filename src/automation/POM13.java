package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class POM13 {
	
	WebDriver driver;

	public POM13(WebDriver idriver) {
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "quantity")
	WebElement productQuantity;
	@FindBy(xpath = "//img[@src=\"/static/images/product-details/new.jpg\"]//following::span[1]//child::button[1]")
	WebElement productDetailsAddCart;
	@FindBy(xpath = "//a[@href=\"/view_cart\"]//child::u[1]")
	WebElement productDetailsViewCart;
	@FindBy(xpath = "//button[text()=\"4\"]")
	WebElement quantityNumber;
	
	public void productQuantity() {
		productQuantity.click();
		productQuantity.clear();
		productQuantity.sendKeys("4");
	}
	
	public void productDetailsAddCartBtn() {
		productDetailsAddCart.click();
	}
	
	public void productDetailsViewCartBtn() {
		productDetailsViewCart.click();
	}
	
	public void productQuantityVerify() {
		String expQuantity = quantityNumber.getText();
		System.out.println("Blue Top Product Quantity: " + expQuantity);
		String actQuantity = "4";
		Assert.assertEquals(expQuantity, actQuantity);
	}

}
