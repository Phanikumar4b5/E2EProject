package org.utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportNg {

public static ExtentReports getReportPath() {
	String path=System.getProperty("user.dir")+"//reports//extent.html";
	ExtentSparkReporter reporter=new ExtentSparkReporter(path);
	reporter.config().setReportName("Web Automation results");
	reporter.config().setDocumentTitle("Test Report Results");
	ExtentReports report=new ExtentReports();
	report.attachReporter(reporter);
	report.setSystemInfo("Tester", "PhanikUmar");
	return report;
}
}
