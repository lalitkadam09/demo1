package testLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.tools.ant.util.WorkerAnt;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	
	public static String getData(int a, int b) throws EncryptedDocumentException, IOException {
		
		FileInputStream file =new FileInputStream("C:\\Users\\User-pc\\eclipse-workspace\\FrameWrok\\TestData\\LoginCredentials.xlsx");
		Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet1");
		String data = sheet.getRow(a).getCell(b).getStringCellValue();
		
		return data;
	}

	public static void getScreenshot(WebDriver driver) throws IOException {
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\User-pc\\eclipse-workspace\\FrameWrok\\Screenshots\\img.png");
		FileHandler.copy(source, dest);
	}
	
	public static String getDataFromPropertyFile(String key) throws IOException {
		
		FileInputStream propertyFile= new FileInputStream("C:\\Users\\User-pc\\eclipse-workspace\\FrameWrok\\PropertyFile.properties");
		
		Properties obj=new Properties();
		obj.load(propertyFile);
		
 		String value= obj.getProperty(key);
		return value;
	}

}

//public static String getDataFromPropertyFile(String key) throws IOException {
//	Properties obj = new Properties();
//
//	FileInputStream objfile = new FileInputStream(System.getProperty("user.dir") + "\\PropertyFile.properties");
//
//	obj.load(objfile);
//	
//	String value = obj.getProperty(key);
//
//	return value;
//}