package module.pom.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage {
	
	
	@FindBy(xpath="//input[@id='userid']") private WebElement UN;
	
	@FindBy(xpath="//input[@id='password']") private WebElement PWD;
	
	@FindBy(xpath="//button[@type='submit']") private WebElement Submit;
	
	public KiteLoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void setUN(String usrnm) {
		UN.sendKeys(usrnm);
	}
	public void setPwd(String pswd) {
		PWD.sendKeys(pswd);
	}
	public void clickLogin() {
		Submit.click();
	}

}
