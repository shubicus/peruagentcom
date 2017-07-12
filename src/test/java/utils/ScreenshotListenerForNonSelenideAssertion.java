package utils;

import com.codeborne.selenide.Screenshots;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class ScreenshotListenerForNonSelenideAssertion extends TestListenerAdapter {


    @Override
    public void onTestFailure(ITestResult iTestResult) {
        Screenshots.screenshots.takeScreenShot();
    }
}
