package automation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class WindowHandling {
	
	WebDriver driver;
	
		public WindowHandling(WebDriver wd) {
			driver= wd;
			PageFactory.initElements(driver, this);
		}

		public void switchWindow() {
			Set<String> whandles = driver.getWindowHandles();
			Iterator<String> itr = whandles.iterator();
			String ParentWindow = itr.next();
			//System.out.println(whandles.size());
			for(String window : whandles)
				if (window.equals(ParentWindow)) {
					driver.switchTo().window(window);
					//break;
				}
			}
		}
