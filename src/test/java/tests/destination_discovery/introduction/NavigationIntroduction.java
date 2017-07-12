package tests.destination_discovery.introduction;


import com.automation.remarks.testng.VideoListener;
import com.automation.remarks.video.annotations.Video;
import com.codeborne.selenide.Selenide;
import config.ConfigurationExtentReport;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import utils.ScreenshotListenerForNonSelenideAssertion;
import webpages.destination_discovery.introduction.Introduction;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static com.codeborne.selenide.Screenshots.screenshots;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static config.ConfigurationExtentReport.extent;

@Listeners({VideoListener.class, ScreenshotListenerForNonSelenideAssertion.class})
public class NavigationIntroduction {

    private Introduction introduction = new Introduction();
    private String pathToScreenshots = "/src/test/resources/introduction_screenshots/";

    @BeforeClass
    public void openNavigationIntroductionPage() {
        getWebDriver().navigate().to(introduction.getUrl());
    }


    @AfterMethod
    public void recordTestsToExtentReport(ITestResult result) throws IOException {
        ConfigurationExtentReport.getResult(result);
    }


    @Video
    @Test(description = "This TC#019 verifies that text-link navigate a user to the correct place of the Introduction page.")
    public void testNavigationIntroductionPage() throws IOException {
        ConfigurationExtentReport.test = extent.createTest("testNavigationIntroductionPage", "This TC#019 verifies that text-link navigate a user to the correct place of Introduction page.");

        introduction.getWelcomeToPeru_link().click();
        Selenide.sleep(2000);
        BufferedImage actualWelcomeToPeru = ImageIO.read(new File(screenshots.takeScreenShotAsFile().getPath()));
        BufferedImage expectedWelcomeToPeru = ImageIO.read(new File(System.getProperty("user.dir") + pathToScreenshots + "WelcomeToPeru.png"));
        ImageDiff diffWelcomeToPeru = new ImageDiffer().makeDiff(expectedWelcomeToPeru, actualWelcomeToPeru);
        Assert.assertFalse(diffWelcomeToPeru.hasDiff());

        introduction.getSellingPeru1_link().click();
        Selenide.sleep(2000);
        BufferedImage actualSellingPeru1 = ImageIO.read(new File(screenshots.takeScreenShotAsFile().getPath()));
        BufferedImage expectedSellingPeru1 = ImageIO.read(new File(System.getProperty("user.dir") + pathToScreenshots + "SellingPeru1.png"));
        ImageDiff diffSellingPeru1 = new ImageDiffer().makeDiff(expectedSellingPeru1, actualSellingPeru1);
        Assert.assertFalse(diffSellingPeru1.hasDiff());

        introduction.getSellingPeru2_link().click();
        Selenide.sleep(2000);
        BufferedImage actualSellingPeru2 = ImageIO.read(new File(screenshots.takeScreenShotAsFile().getPath()));
        BufferedImage expectedSellingPeru2 = ImageIO.read(new File(System.getProperty("user.dir") + pathToScreenshots + "SellingPeru2.png"));
        ImageDiff diffSellingPeru2 = new ImageDiffer().makeDiff(expectedSellingPeru2, actualSellingPeru2);
        Assert.assertFalse(diffSellingPeru2.hasDiff());

        introduction.getPeruOfToday_link().click();
        Selenide.sleep(2000);
        BufferedImage actualPeruOfToday = ImageIO.read(new File(screenshots.takeScreenShotAsFile().getPath()));
        BufferedImage expectedPeruOfToday = ImageIO.read(new File(System.getProperty("user.dir") + pathToScreenshots + "PeruOfToday.png"));
        ImageDiff diffPeruOfToday = new ImageDiffer().makeDiff(expectedPeruOfToday, actualPeruOfToday);
        Assert.assertFalse(diffPeruOfToday.hasDiff());
    }
}
