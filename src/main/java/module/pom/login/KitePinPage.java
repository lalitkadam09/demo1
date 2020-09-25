package module.pom.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePinPage {
	
	@FindBy(xpath="//input[@id='pin']") private WebElement pin;
	@FindBy(xpath="//button[@type='submit']") private WebElement cnt;
	
	public KitePinPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setPin(String pn) {
		pin.sendKeys(pn);
	}
	public void clickContinue() {
		cnt.click();
	}

}
