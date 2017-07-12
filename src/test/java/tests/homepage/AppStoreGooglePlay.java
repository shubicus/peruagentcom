package tests.homepage;


import com.automation.remarks.testng.VideoListener;
import com.automation.remarks.video.annotations.Video;
import com.codeborne.selenide.Condition;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import config.ConfigurationExtentReport;
import webpages.homepage.HomePage;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.*;
import static config.ConfigurationExtentReport.extent;

@Listeners(VideoListener.class)
public class AppStoreGooglePlay {

    private HomePage homePage = new HomePage();


    @AfterMethod
    public void recordTestsToExtentReport(ITestResult result) throws IOException {
        ConfigurationExtentReport.getResult(result);
    }

    @Video
    @Test(description = "This TC#018 verifies that AppStore and GooglePlay open in new BrowserTab.")
    public void testAppStoreGooglePlay() {
        ConfigurationExtentReport.test = extent.createTest("testAppStoreGooglePlay", "This TC#018 verifies that AppStore and GooglePlay open in new BrowserTab");

        refresh();

        homePage.getAppStore_link_btn().click();
        String appStoreURL = switchTo().window(1).getCurrentUrl();
        Assert.assertEquals(appStoreURL, "https://itunes.apple.com/app/peru-agent-mobile-sales-companion/id1090452195");
        $("#title > div.left > h1").shouldHave(Condition.text("PERU Agent Sales Companion and Certified Training"));
        switchTo().window(homePage.getTitle());

        homePage.getGooglePlay_link_btn().click();
        String googlePlayURL = switchTo().window(2).getCurrentUrl();
        Assert.assertEquals(googlePlayURL, "https://play.google.com/store/apps/details?id=com.travpro.peru");
        $(".id-app-title").shouldHave(Condition.text("Peru Agent Sales Companion"));
        switchTo().window(homePage.getTitle());

        switchTo().window(2).close();
        switchTo().window(1).close();

        switchTo().window(homePage.getTitle());

    }

}
