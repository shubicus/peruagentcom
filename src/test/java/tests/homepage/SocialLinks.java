package tests.homepage;


import com.automation.remarks.testng.VideoListener;
import com.automation.remarks.video.annotations.Video;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import config.ConfigurationExtentReport;
import webpages.homepage.HomePage;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.refresh;
import static com.codeborne.selenide.Selenide.switchTo;
import static config.ConfigurationExtentReport.extent;

@Listeners(VideoListener.class)
public class SocialLinks {

   private HomePage homePage = new HomePage();


    @AfterMethod
    public void recordTestsToExtentReport(ITestResult result) throws IOException {
        ConfigurationExtentReport.getResult(result);
    }


    @Video
    @Test(description = "This TC#013 verifies that All SocialLinks are clickable and are opened in new Browser Tabs")
    public void testSocialLinks() {
        ConfigurationExtentReport.test = extent.createTest("testSocialLinks", "This TC#013 verifies that All SocialLinks are clickable and are opened in new Browser Tabs");

        refresh();

        homePage.getTwitter_link().click();
        String twitter = switchTo().window(1).getCurrentUrl();
        Assert.assertEquals(twitter, "https://twitter.com/VisitPeru/");
        switchTo().window(0);

        homePage.getFacebook_link().click();
        String facebook = switchTo().window(2).getCurrentUrl();
        Assert.assertEquals(facebook, "https://www.facebook.com/visitperu/");
        switchTo().window(0);

        homePage.getFlikr_link().click();
        String flickr = switchTo().window(3).getCurrentUrl();
        Assert.assertEquals(flickr, "https://www.flickr.com/photos/promperu/");
        switchTo().window(0);

        homePage.getYoutube_link().click();
        String youtube = switchTo().window(4).getCurrentUrl();
        Assert.assertEquals(youtube, "https://www.youtube.com/user/VisitPeru");
        switchTo().window(0);

        homePage.getInstagram_link().click();
        String instagram = switchTo().window(5).getCurrentUrl();
        Assert.assertEquals(instagram, "https://www.instagram.com/peru/");
//        switchTo().window(0);

        switchTo().window(5).close();
        switchTo().window(4).close();
        switchTo().window(3).close();
        switchTo().window(2).close();
        switchTo().window(1).close();

        switchTo().window(homePage.getTitle());

    }

}
