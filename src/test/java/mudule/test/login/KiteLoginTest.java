package mudule.test.login;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import module.pom.home.KiteHomePage;
import module.pom.login.KiteLogOutPage;
import module.pom.login.KiteLoginPage;
import module.pom.login.KitePinPage;
import testLibrary.BrowserFactory;
import testLibrary.Utility;

public class KiteLoginTest extends BrowserFactory {
	KiteLogOutPage logout;	KiteHomePage home;	KitePinPage pin;	KiteLoginPage login;
	
	@Parameters(value="browser")
	@BeforeClass
	public void browserOpen(String browser) throws IOException {
		openBrowser(browser);
		Reporter.log("browser opened", true);

	}
	@BeforeMethod 
	public void loginKite() throws EncryptedDocumentException, IOException {
		login=new KiteLoginPage(driver);
		login.setUN(Utility.getDataFromPropertyFile("un"));
		login.setPwd(Utility.getDataFromPropertyFile("pwd"));
		login.clickLogin();
		Reporter.log("log in app", true);

		pin =new KitePinPage(driver);
		pin.setPin(Utility.getDataFromPropertyFile("pn"));
		pin.clickContinue();
	}
	@Test
	public void verifyProfileName() throws EncryptedDocumentException, IOException {
		 home=new KiteHomePage(driver);
		String actual = home.getKiteHomePageProfileName();
		String expected=Utility.getData(0, 3);	
//		SoftAssert sa= new SoftAssert();
//		sa.assertEquals(actual, expected);
		Reporter.log("TC executed", true);

		Assert.assertEquals(actual, expected);
	}	
	@AfterMethod
	public void logOutKite(ITestResult result) throws IOException {
		
		if(result.getStatus()==ITestResult.FAILURE) {
			Utility.getScreenshot(driver);
		}
		logout=new KiteLogOutPage(driver);
		logout.clickProfileId();
		logout.clickLogOut();
		logout.clickChangeUser();		
	}
	@AfterClass
	public void closeBrowser() {
		driver.close();
	}

}