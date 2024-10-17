package Test.Test_01;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener {
	public ExtentSparkReporter sparkReporter;
	public ExtentReports extent;
	public ExtentTest tests;

public void  OnStart(ITestContext context) {
	sparkReporter=new ExtentSparkReporter(System.getProperty("user.dir")+ "E:\\vm\\Test_01\\Reports\\myReports.html");
	sparkReporter.config().setDocumentTitle("Automation Testing");
	sparkReporter.config().setReportName("Functional testing");
	sparkReporter.config().setTheme(Theme.DARK);
	
	extent=new ExtentReports();
	
	extent.attachReporter(sparkReporter);
	
	extent.setSystemInfo("Computername", "Dell");
	extent.setSystemInfo("Environment", "QA");
	extent.setSystemInfo("Tester", "Vinayak");
	extent.setSystemInfo("os", "windows10");
	extent.setSystemInfo("browsername", "chrome");
	
}
public void onTestSuccess(ITestResult result) {
	tests=extent.createTest(result.getName());
	tests.log(Status.PASS, "Test case Passed is:"+result.getName());
}
public void onTestFailure(ITestResult result) {
	tests=extent.createTest(result.getName());
	tests.log(Status.FAIL, "Test case failed is:"+result.getName());
	tests.log(Status.FAIL, "Test case failed cause is:"+result.getThrowable());
}
public void onTestSkipped(ITestResult result) {
	tests=extent.createTest(result.getName());
	tests.log(Status.SKIP, "Test case skipped is:"+result.getName());
}
public void onFinish(ITestContext context) {
	extent.flush();
}
}
