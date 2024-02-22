package automation;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class POM {

	WebDriver driver;

	public POM(WebDriver idriver) {
		driver = idriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[text()=\" Signup / Login\"]")
	WebElement signuporlogin;
	@FindBy(xpath = "//*[text()=\" Logged in as \"]")
	WebElement loggedinUsername;
	@FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a/b")
	WebElement name;
	@FindBy(linkText = "Delete Account")
	WebElement deleteAccount;
	@FindBy(xpath = "//a[text()=\" Logout\"]")
	WebElement logout;
	@FindBy(xpath = "//*[text()=\"New User Signup!\"]")
	WebElement signup;
	@FindBy(name = "name")
	WebElement signupName;
	@FindBy(xpath = "//div[@class=\"signup-form\"]//child::form[1]//child::input[3]")
	WebElement signupEmail;
	@FindBy(xpath = "//button[text()=\"Signup\"]")
	WebElement signupbutton;
	@FindBy(xpath = "//b[text()=\"Enter Account Information\"]")
	WebElement accountInfo;
	@FindBy(id = "days")
	WebElement days;
	@FindBy(id = "months")
	WebElement months;
	@FindBy(id = "years")
	WebElement years;
	@FindBy(id = "newsletter")
	WebElement checkNewsletter;
	@FindBy(id = "optin")
	WebElement receiveSpecialOffers;
	@FindBy(id = "first_name")
	WebElement firstName;
	@FindBy(id = "last_name")
	WebElement lastName;
	@FindBy(id = "company")
	WebElement company;
	@FindBy(id = "address1")
	WebElement address;
	@FindBy(id = "address2")
	WebElement address2;
	@FindBy(id = "uniform-id_gender2")
	WebElement title;
	@FindBy(id = "password")
	WebElement password;
	@FindBy(id = "country")
	WebElement country;
	@FindBy(id = "state")
	WebElement state;
	@FindBy(id = "city")
	WebElement city;
	@FindBy(id = "zipcode")
	WebElement zipcode;
	@FindBy(id = "mobile_number")
	WebElement mobNumb;
	@FindBy(xpath = "//button[text()='Create Account']")
	WebElement createAccountSignup;
	@FindBy(xpath = "//div[@class=\"col-sm-9 col-sm-offset-1\"]//child::h2[1]//child::b[1]")
	WebElement accountCreatedMsg;
	@FindBy(xpath = "//a[text()='Continue']")
	WebElement accountCreatedContinue;
	@FindBy(xpath = "//u[text()='Register / Login']")
	WebElement registerLogin;
	@FindBy(xpath = "//b[text()='Account Deleted!']")
	WebElement accountDeletedMsg;
	@FindBy(xpath = "//a[text()='Continue']")
	WebElement continueBtnDeleteUser;
	
	public void launchApp() {
		/*
		 * ChromeOptions options = new ChromeOptions(); options.addExtensions(new
		 * File("\"C:\\Users\\user\\Downloads\\AdBlock-—-best-ad-blocker.crx\""));
		 * DesiredCapabilities capabilities = new DesiredCapabilities();
		 * capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		 * options.merge(capabilities); driver = new ChromeDriver(options);
		 */
		driver.manage().window().maximize();
		driver.navigate().to("https://automationexercise.com/");
		String title = driver.getTitle();
		System.out.println(title);
		/*
		 * WindowHandling wh=new WindowHandling(driver); wh.switchWindow();
		 */
	}

	public void signuporloginbtn() {
		signuporlogin.click();
		WindowHandling wh=new WindowHandling(driver);
		wh.switchWindow();
	}
	
	public void signupvisible() {
		boolean text = signup.isDisplayed();
		System.out.println("New User Signup! is visible: " + text);
	}

	public void signupName() {
		signupName.sendKeys("Ram");
	}

	public void signupEmailid() {
		signupEmail.sendKeys("ramopt40@gmail.com");
	}

	public void signupbtn() {
		signupbutton.click();
	}

	public void accountInfoVerify() {
		boolean accountVerify = accountInfo.isDisplayed();
		System.out.println("Enter Account Information is visible: " + accountVerify);
	}

	public void createAccountDetails() {
		title.click();
		password.sendKeys("QA@123");
		Select s = new Select(days);
		s.selectByValue("20");
		Select s1 = new Select(months);
		s1.selectByIndex(4);
		Select s2 = new Select(years);
		s2.selectByVisibleText("1997");
	}

	public void accountCreateCheckbox() {
		checkNewsletter.click();
		receiveSpecialOffers.click();
	}

	public void addressInform() {
		firstName.sendKeys("Ramya");
		lastName.sendKeys("sree");
		company.sendKeys("Orange Solutions");
		address.sendKeys("Survey No. 91,  Madhava Reddy Colony");
		address2.sendKeys("Gachibowli, Hyderabad");
		Select obj = new Select(country);
		obj.selectByValue("India");
		state.sendKeys("Telangana");
		city.sendKeys("Hyderabad");
		zipcode.sendKeys("500032");
		mobNumb.sendKeys("9876543210");
		createAccountSignup.click();
		/*
		 * WindowHandling wh=new WindowHandling(driver); wh.switchWindow();
		 * wh.switchWindow();
		 */
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		 * wait.until(ExpectedConditions.visibilityOf(accountCreatedMsg));
		 * driver.navigate().refresh();
		 */
		boolean acntCreated = accountCreatedMsg.isDisplayed();
		System.out.println("Account created : " + acntCreated);
		/* wh.switchWindow(); */
		 driver.navigate().refresh();
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.visibilityOf(accountCreatedContinue));
		accountCreatedContinue.click();
		/* wh.switchWindow(); */
		/* driver.navigate().refresh(); */
	}

	public void loggedinUsername() {
		/*
		 * WindowHandling wh=new WindowHandling(driver); wh.switchWindow();
		 */
		driver.navigate().refresh();
		String username = name.getText();		
		boolean loggedin = loggedinUsername.isDisplayed();
		System.out.println("Loggedin " + username + " displayed: " + loggedin);
	}

	public void waitTime() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public void alert() {
		Alert a = driver.switchTo().alert();
		a.accept();
	}

	public void scrollbutton() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
	}

	public void scrollDownFooter() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(287, 8675)");
	}

	
	public void registerLoginBtn() {
		registerLogin.click();
	}

	public void logoutButton() {
		logout.click();
	}

	public void deleteAccount() {
		deleteAccount.click();
	}

	public void accountDeletedVerifyandContinue() {
		/*
		 * WindowHandling wh=new WindowHandling(driver); wh.switchWindow();
		 */
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		 * wait.until(ExpectedConditions.visibilityOf(accountDeletedMsg));
		 * driver.navigate().refresh();
		 */
		String actMsg = accountDeletedMsg.getText();
		System.out.println(actMsg);
		String expMsg = "ACCOUNT DELETED!";
		Assert.assertEquals(actMsg, expMsg);
	}
	
	public void continueBtnHP() {
		continueBtnDeleteUser.click();
	}

}
