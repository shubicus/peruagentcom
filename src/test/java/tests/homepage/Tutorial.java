package tests.homepage;


import com.automation.remarks.testng.VideoListener;
import com.automation.remarks.video.annotations.Video;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import config.ConfigurationExtentReport;

import java.io.IOException;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.refresh;
import static config.ConfigurationExtentReport.extent;
import static config.ConfigurationSelenide.openURL;

@Listeners(VideoListener.class)
public class Tutorial {

    private webpages.homepage.Tutorial tutorial = new webpages.homepage.Tutorial();

    @BeforeClass
    public void openBrowser() {
        openURL();
    }


    @AfterMethod
    public void recordTestsToExtentReport(ITestResult result) throws IOException {
        ConfigurationExtentReport.getResult(result);
    }

    @Video
    @Test(description = "This TC#017 verifies that the Tutorial is present/visible.")
    public void testTutorial() {
        ConfigurationExtentReport.test = extent.createTest("closeTutorial", "close tutorial");

        refresh();

        tutorial.getTutoral().waitUntil(visible, 4000);
        tutorial.getTitle1().shouldHave(text("WELCOME TO A SIMPLIFIED SELLING JOURNEY"));
        tutorial.getNext_btn().click();

        tutorial.getTutoral().waitUntil(visible, 4000);
        tutorial.getTitle2().shouldHave(text("CONTINUAL DISCOVERY"));
        tutorial.getNext_btn().click();

        tutorial.getTutoral().waitUntil(visible, 4000);
        tutorial.getTitle3().shouldHave(text("ACCOMODATIONS DIRECTORY"));  //todo wait for bug fix
        tutorial.getNext_btn().click();

        tutorial.getTutoral().waitUntil(visible, 4000);
        tutorial.getTitle4().shouldHave(text("SALES TOOLBOX"));
        tutorial.getNext_btn().click();

        tutorial.getTutoral().waitUntil(visible, 4000);
        tutorial.getTitle5().shouldHave(text("SOCIAL MEDIA RECAP"));
        tutorial.getNext_btn().click();

        tutorial.getTutoral().waitUntil(visible, 4000);
        tutorial.getTitle6().shouldHave(text("SHARING A DEVICE?"));
        tutorial.getEndTour_btn().click();

        tutorial.getTutoral().waitUntil(disappear, 2000);

        tutorial.getTutoral().shouldNotBe(visible);
    }

}
