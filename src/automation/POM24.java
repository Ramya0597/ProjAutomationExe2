package automation;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM24 {
	
	WebDriver driver;

	public POM24(WebDriver idriver) {
		driver = idriver;
		PageFactory.initElements(driver, this);
	}	
	
	@FindBy(xpath="//a[text()=\"Download Invoice\"]")
	WebElement downloadInvoice;
	@FindBy(xpath = "//a[text()=\"Continue\"]")
	WebElement continueBtnPay;
	
	public void downloadInvoiceCart() {
		downloadInvoice.click();
		String filePath = "C:\\Users\\user\\Downloads\\invoice.txt";
		
		File f = new File(filePath);
		if (f.exists()) {
			System.out.println("Invoice File found at : "+filePath);
		}else {
			System.out.println("Invoice file not found at : " +filePath);
		}
		
	}
	
	public void continuePayPage() {
		continueBtnPay.click();
	}
	
}
