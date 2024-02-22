package automation;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class POM14 {
	
	WebDriver driver;

	public POM14(WebDriver idriver) {
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@href=\"/view_cart\"]//child::i[1]")
	WebElement cartBtn;
	@FindBy(xpath = "//a[text()=\"Proceed To Checkout\"]")
	WebElement proceedCheckoutbtn;
	@FindBy(id = "address_delivery")
	WebElement deliveryAddress;
	@FindBy(id = "address_invoice")
	WebElement billingAddress;
	@FindBy(tagName = "td")
	List<WebElement> tabledata;
	@FindBy(name = "message")
	WebElement commentTextBox;
	@FindBy(xpath = "//a[text()=\"Place Order\"]")
	WebElement placeOrder;
	@FindBy(name = "name_on_card")
	WebElement nameOnCard;
	@FindBy(name = "card_number")
	WebElement cardNumb;
	@FindBy(name = "cvc")
	WebElement cvc;
	@FindBy(name = "expiry_month")
	WebElement expiryMonth;
	@FindBy(name = "expiry_year")
	WebElement expiryYear;
	@FindBy(xpath = "//button[text()=\"Pay and Confirm Order\"]")
	WebElement payAndConfirmBtn;
	@FindBy(xpath = "//div[@id=\"success_message\"]")
	WebElement successMsgOrderPlaced;
	@FindBy(xpath = "//li[text()=\"Shopping Cart\"]")
	WebElement shoppingCartPage;
	
	public void cartButton() {
		cartBtn.click();
	}
	
	public void cartPageVerify() {
		boolean cartPg = shoppingCartPage.isDisplayed();
		System.out.println("cart page is displayed: " + cartPg);
	}
	
	public void proceedToCheckoutBtn() {
		proceedCheckoutbtn.click();
	}
	
	public void addressDetailsCheckout() {
		  deliveryAddress.getText();
		  billingAddress.getText();
		 for (int i = 0; i < tabledata.size(); i++) {
			System.out.print(tabledata.get(i).getText()+"  ");
		}
		System.out.println(" ");
	}
	
	public void commentAndPlaceOrder() {
		commentTextBox.sendKeys("place order");
		placeOrder.click();
	}
	
	public void paymentDetails() {
		nameOnCard.sendKeys("Ram");
		cardNumb.sendKeys("123321112334");
		cvc.sendKeys("321");
		expiryMonth.sendKeys("11");
		expiryYear.sendKeys("2025");
	}

	public void payAndConfirmOrderBtn() {
		payAndConfirmBtn.click();
	}

	public void orderPlacedSuccessMsg() {
		String actMsg = successMsgOrderPlaced.getText();
		System.out.println(actMsg);
		String expMsg = "Your order has been placed successfully!";
		Assert.assertEquals(expMsg, actMsg);
	}

}
