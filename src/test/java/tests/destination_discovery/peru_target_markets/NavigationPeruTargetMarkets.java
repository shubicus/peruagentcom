package tests.destination_discovery.peru_target_markets;


import com.automation.remarks.testng.VideoListener;
import com.automation.remarks.video.annotations.Video;
import com.codeborne.selenide.Selenide;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import config.ConfigurationExtentReport;
import utils.ScreenshotListenerForNonSelenideAssertion;
import webpages.destination_discovery.peru_target_markets.PeruTargetMarkets;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static com.codeborne.selenide.Screenshots.screenshots;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static config.ConfigurationExtentReport.extent;


@Listeners({VideoListener.class, ScreenshotListenerForNonSelenideAssertion.class})
public class NavigationPeruTargetMarkets {


    private PeruTargetMarkets peruTargetMarkets = new PeruTargetMarkets();
    private String pathToScreenshots = "/src/test/resources/peru_target_markets_screenshots/";

    @BeforeClass
    public void openNavigationPeruTargetMarketsPage() {
        getWebDriver().navigate().to(peruTargetMarkets.getUrl());
    }


    @AfterMethod
    public void recordTestsToExtentReport(ITestResult result) throws IOException {
        ConfigurationExtentReport.getResult(result);
    }


    @Video
    @Test(description = "This TC#024 verifies that text-link navigate a user to the correct place of the PeruTargetMarkets page.")
    public void testNavigationPeruTargetMarketsPage() throws IOException {
        ConfigurationExtentReport.test = extent.createTest("testNavigationPeruTargetMarketsPage", "This TC#024 verifies that text-link navigate a user to the correct place of PeruTargetMarkets page.");

        peruTargetMarkets.getCulinaryTravel().click();
        Selenide.sleep(2000);
        BufferedImage actualCulinaryTravel = ImageIO.read(new File(screenshots.takeScreenShotAsFile().getPath()));
        BufferedImage expectedCulinaryTravel = ImageIO.read(new File(System.getProperty("user.dir") + pathToScreenshots + "CulinaryTravel.png"));
        ImageDiff diffCulinaryTravel = new ImageDiffer().makeDiff(expectedCulinaryTravel, actualCulinaryTravel);
        Assert.assertFalse(diffCulinaryTravel.hasDiff());

        peruTargetMarkets.getInHarmony().click();
        Selenide.sleep(2000);
        BufferedImage actualInHarmony = ImageIO.read(new File(screenshots.takeScreenShotAsFile().getPath()));
        BufferedImage expectedInHarmony = ImageIO.read(new File(System.getProperty("user.dir") + pathToScreenshots + "InHarmony.png"));
        ImageDiff diffInHarmony = new ImageDiffer().makeDiff(expectedInHarmony, actualInHarmony);
        Assert.assertFalse(diffInHarmony.hasDiff());

        peruTargetMarkets.getFamilyTravel().click();
        Selenide.sleep(2000);
        BufferedImage actualFamilyTravel = ImageIO.read(new File(screenshots.takeScreenShotAsFile().getPath()));
        BufferedImage expectedFamilyTravel = ImageIO.read(new File(System.getProperty("user.dir") + pathToScreenshots + "FamilyTravel.png"));
        ImageDiff diffFamilyTravel = new ImageDiffer().makeDiff(expectedFamilyTravel, actualFamilyTravel);
        Assert.assertFalse(diffFamilyTravel.hasDiff());

        peruTargetMarkets.getRomanceTravel().click();
        Selenide.sleep(2000);
        BufferedImage actualRomanceTravel = ImageIO.read(new File(screenshots.takeScreenShotAsFile().getPath()));
        BufferedImage expectedRomanceTravel = ImageIO.read(new File(System.getProperty("user.dir") + pathToScreenshots + "RomanceTravel.png"));
        ImageDiff diffRomanceTravel = new ImageDiffer().makeDiff(expectedRomanceTravel, actualRomanceTravel);
        Assert.assertFalse(diffRomanceTravel.hasDiff());

        peruTargetMarkets.getMeetings().click();
        Selenide.sleep(2000);
        BufferedImage actualMeetings = ImageIO.read(new File(screenshots.takeScreenShotAsFile().getPath()));
        BufferedImage expectedMeetings = ImageIO.read(new File(System.getProperty("user.dir") + pathToScreenshots + "Meetings.png"));
        ImageDiff diffMeetings = new ImageDiffer().makeDiff(expectedMeetings, actualMeetings);
        Assert.assertFalse(diffMeetings.hasDiff());
    }
}
