package testLibrary;

import org.testng.ITestContext;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class extentreoprt {
	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent; 
	public ExtentTest logger;
//
	public void onStart(ITestContext testContext) 

	{

//	String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());//time stamp 
//	String appName="Test-Report-"+timeStamp".html";

	htmlReporter=new ExtentHtmlReporter(System.getProperty("user.dir")+ "/test-output/repName.html" );//specify location 
//	htmlReporter.loadxMLConfig(System.getProperty("user.dir")+ "/extent-config.xml");

//	extent=new Extent Reports();
//
//	extent.attachReporter(htmlReporter);
//
//	extent.setSystemInfo("Host name", "localhost"); 
//	extent.setsystemInfo("Environment", "QA"); 
//	extent.setsystemInfo("user","pavan");

	htmlReporter.config().setDocumentTitle("Inet Banking Test Project"); // Tile of report 
	htmlReporter.config().setReportName("Functional Test Report"); // name of the report 
//	htmlReporter.config().setTestViewChartLocation (ChartLocation. TOP); //location of the chart
	
//	
//	public void onTestSuccess (ITestResult tr) {
//
//	logger-extent.createTest(tr.getName()); // create new entry in the report 
//	logger.log(Status.PASS, MarkupHelper.createLabel(tr.getName(), ExtentColor.GREEN)); // send the passed informatior
//
//	}
//
//	
//
//	public void onTestFailure (ITestResult tr) {
//
//		logger-extent.createTest(tr.getName()); // create new entry in the report 
//		logger.log(Status.FAIL, MarkupHelper.createLabel(tr.getName(), ExtentColor.RED)); // send the passed information
//	
//		String screenshotPath-System.getProperty("user.dir")+"\\Screenshots\\"+tr.getName()+".png";
//		
//		File f = new File(screenshotPath);
//		if(f.exists())
//	
//			{
//				try {
//					logger.fail("Screenshot is below:" + logger.addScreenCaptureFromPath(screenshotPath));
//					}
//				catch (IOException e)
//					{ 
//					e.printstackTrace(); 
//					}
//		
//			}
//
//	}
//
//	
//	public void onTestSkipped(ITestResult tr)	{ 
//		
//		logger-extent.createTest(tr.getName()); // create new entry in the report 
//		logger.log(Status.SKIP, MarkupHelper.createLabel(tr.getName(), Extentcolor.ORANGE));
//	}
//
//	
//
//
//	public void onFinish(ITestcontext testcontext) {
//		
//	}

}

}
