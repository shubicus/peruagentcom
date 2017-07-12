package config;

import com.automation.remarks.video.recorder.VideoRecorder;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.codeborne.selenide.Screenshots;
import org.testng.ITestResult;

import java.io.IOException;


public class ConfigurationExtentReport {

    public static ExtentReports extent;
    public static ExtentHtmlReporter html;
    public static ExtentTest test;


    public static void startExtentReporting() {
        html = new ExtentHtmlReporter(System.getProperty("user.dir") + "/build/reports/ExtentReport.html");
        extent = new ExtentReports();
        extent.attachReporter(html);

        extent.setSystemInfo("Hostname", "Vadim");
        extent.setSystemInfo("OS", "Windows 7");
        extent.setSystemInfo("Department", "QA");
        extent.setSystemInfo("User Name", "Vadim");

        html.config().setDocumentTitle("QA Automation testing of Peruagent.com");
        html.config().setReportName("QA Automation testing of Peruagent.com");
        html.config().setTestViewChartLocation(ChartLocation.TOP);
        html.config().setTheme(Theme.DARK);
    }


    public static void getResult(ITestResult result) throws IOException {
        if (result.getStatus() == ITestResult.FAILURE) {
            test.log(com.aventstack.extentreports.Status.FAIL, MarkupHelper.createLabel(result.getName() + " FAILED", ExtentColor.RED));
            test.fail(result.getThrowable());
            test.fail("<video width='320' height='240' controls> <source src='" + VideoRecorder.getLastRecording().toString().substring(14) + "' type='video/mp4'> </videos>");
            test.fail("Video name: " + VideoRecorder.getLastRecording().getName());
            test.fail("Screenshot name: " + Screenshots.getLastScreenshot().getName());
            test.addScreenCaptureFromPath("screenshots/" + Screenshots.getLastScreenshot().getName());
        } else if (result.getStatus() == ITestResult.SUCCESS) {
            test.log(com.aventstack.extentreports.Status.PASS, MarkupHelper.createLabel(result.getName() + " PASSED", ExtentColor.GREEN));
            test.pass("Video name: " + VideoRecorder.getLastRecording().getName());
        } else if (result.getStatus() == ITestResult.SKIP) {
            test.log(com.aventstack.extentreports.Status.SKIP, MarkupHelper.createLabel(result.getName() + " SKIPPED", ExtentColor.ORANGE));
            test.skip(result.getThrowable());
        }
    }


    public static void endExtentReporting() {
        extent.flush();
    }

}
