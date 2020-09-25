package testLibrary;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	public static WebDriver driver;
	public static void openBrowser(String browser) throws IOException {
		
		if (browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User-pc\\eclipse-workspace\\FrameWrok\\BrowserDrivers\\chromedriver.exe");
		driver= new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\User-pc\\eclipse-workspace\\FrameWrok\\BrowserDrivers\\geckodriver.exe");
			driver= new FirefoxDriver();
		}
		else if (browser.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.chrome.driver", "");
			driver= new ChromeDriver();
		}
		
		driver.get(Utility.getDataFromPropertyFile("url"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

}
