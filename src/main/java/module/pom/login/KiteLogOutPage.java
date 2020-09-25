package module.pom.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogOutPage {
	
	@FindBy (xpath="//span [@class='user-id']")
	private WebElement profileID;
	@FindBy (xpath="//a[@href='/logout/']")
	private WebElement logOut;
	@FindBy (xpath="//a[text()='Change user']")
	private WebElement changeUser;
	
	public KiteLogOutPage (WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void clickProfileId() {
		profileID.click();
	}
	
	public void clickLogOut() {
		logOut.click();
	}
	
	public void clickChangeUser() {
		changeUser.click();
	}
	
}	

