package module.pom.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {
	
	@FindBy(xpath="//span[text()='KV']") 
	private WebElement profileName;
	@FindBy(xpath="(//span[@data-balloon='Open chart'])[1]")
	private WebElement nifty;
	
	public KiteHomePage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public String getKiteHomePageProfileName() {
	String actual= profileName.getText();
		return actual;
	}
	
	public void niftyIsDisplay() {
		boolean k = nifty.isDisplayed();
		if (k=true) {
			System.out.println("Nifty50 is Displayed");
		}
		else
			System.out.println("Nifty50 is not Displayed");
	}
}
