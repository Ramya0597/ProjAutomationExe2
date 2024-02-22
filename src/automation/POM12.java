package automation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM12 {
	
	WebDriver driver;

	public POM12(WebDriver idriver) {
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//img[@src='/get_product_picture/1']//following::a[1]")
	WebElement addToCartFirstProduct;
	@FindBy(xpath = "//button[text()='Continue Shopping']")
	WebElement continueShopping;
	@FindBy(xpath = "//p[text()='Men Tshirt']//following::a[1]")
	WebElement addToCartSecondProduct;
	@FindBy(xpath = "//u[text()='View Cart']")
	WebElement viewCartBtn;
	@FindBy(xpath = "//a[@href='/product_details/1']")
	WebElement firstProductDesc;
	@FindBy(xpath = "//a[@href='/product_details/2']")
	WebElement secondProductDesc;
	@FindBy(xpath = "//*[@id='product-1']/td[3]")
	WebElement blueTopPrice;
	@FindBy(xpath = "//*[@id='product-2']/td[3]/p")
	WebElement menTshirtPrice;
	@FindBy(xpath = "//*[@id='product-1']/td[4]/button")
	WebElement blueTopQuantity;
	@FindBy(xpath = "//*[@id='product-2']/td[4]/button")
	WebElement menTshirtQuantity;
	@FindBy(xpath = "//*[@id='product-1']/td[5]/p")
	WebElement blueTopTotal;
	@FindBy(xpath = "//*[@id='product-2']/td[5]/p")
	WebElement menTshirtTotal;
		
	public void addToCartBtn() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(568, 884)");
		addToCartFirstProduct.click();
	}

	public void continueShoppingBtn() {
		continueShopping.click();
	}

	public void addToCartSecondProduct() {
		addToCartSecondProduct.click();
	}
	
	public void viewCartButton() {
		viewCartBtn.click();
	}

	public void verifyViewCart() {
		boolean firstPro = firstProductDesc.isDisplayed();
		System.out.println("Both product displayed: " + firstPro);
		boolean secPro = secondProductDesc.isDisplayed();
		System.out.println("Second product displayed: " + secPro);
	}

	public void bothProductsDesc() {
		System.out.println("BlueTop Price: " + blueTopPrice.getText());
		System.out.println("BlueTop Quantity: " + blueTopQuantity.getText());
		System.out.println("BlueTop Total: " + blueTopTotal.getText());
		System.out.println("Men's Tshirt Price: " + menTshirtPrice.getText());
		System.out.println("Men's Tshirt Quantity: " + menTshirtQuantity.getText());
		System.out.println("Men's Tshirt Total: " + menTshirtTotal.getText());
	}

}
