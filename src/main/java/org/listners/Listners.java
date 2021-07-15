package org.listners;

import org.base.Base;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.utility.ExtentReportNg;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listners extends Base implements ITestListener {
	ExtentTest test;
	ExtentReports report=ExtentReportNg.getReportPath();
	ThreadLocal<ExtentTest> local=new ThreadLocal<ExtentTest>();
	@Override
	public void onTestStart(ITestResult res) {
		test=report.createTest(res.getMethod().getMethodName());
		local.set(test);
	}

	@Override
	public void onTestSuccess(ITestResult res) {
		//test.log(Status.PASS,"Test is passed");
		local.get().pass(res.getMethod().getMethodName()+ " is passed");
	}


	@Override
	public void onTestFailure(ITestResult res) {
		String methodName = res.getMethod().getMethodName();
		local.get().fail(res.getThrowable());
		WebDriver driver = null;
		try {
			driver = (WebDriver) res.getTestClass().getRealClass().getDeclaredField("driver").get(res.getInstance());
			local.get().addScreenCaptureFromPath(takeScreenshot(methodName, driver), methodName);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onFinish(ITestContext arg0) {
		report.flush();

	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

}
