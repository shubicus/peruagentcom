package tests.destination_discovery.active_peru;

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
import webpages.destination_discovery.active_peru.ActivePeru;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static com.codeborne.selenide.Screenshots.screenshots;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static config.ConfigurationExtentReport.extent;

@Listeners({VideoListener.class, ScreenshotListenerForNonSelenideAssertion.class})
public class NavigationActivePeru {

    private ActivePeru activePeru = new ActivePeru();
    private String pathToScreenshots = "/src/test/resources/active_peru_screenshots/";

    @BeforeClass
    public void openNavigationActivePeruPage() {
        getWebDriver().navigate().to(activePeru.getUrl());
    }

    @AfterMethod
    public void recordTestsToExtentReport(ITestResult result) throws IOException {
        ConfigurationExtentReport.getResult(result);
    }

    @Video
    @Test(description = "This TC#022 verifies that text-link navigate a user to the correct place of the ActivePeru page.")
    public void testNavigationActivePeruPage() throws IOException {
        ConfigurationExtentReport.test = extent.createTest("testNavigationActivePeruPage", "This TC#022 verifies that text-link navigate a user to the correct place of ActivePeru page.");

        activePeru.getHikingTrekking().click();
        Selenide.sleep(2000);
        BufferedImage actualHikingTrekking = ImageIO.read(new File(screenshots.takeScreenShotAsFile().getPath()));
        BufferedImage expectedHikingTrekking = ImageIO.read(new File(System.getProperty("user.dir") + pathToScreenshots + "HikingTrekking.png"));
        ImageDiff diffHikingTrekking = new ImageDiffer().makeDiff(expectedHikingTrekking, actualHikingTrekking);
        Assert.assertFalse(diffHikingTrekking.hasDiff());

        activePeru.getEcotourism().click();
        Selenide.sleep(2000);
        BufferedImage actualEcotourism = ImageIO.read(new File(screenshots.takeScreenShotAsFile().getPath()));
        BufferedImage expectedEcotourism = ImageIO.read(new File(System.getProperty("user.dir") + pathToScreenshots + "Ecotourism.png"));
        ImageDiff diffEcotourism = new ImageDiffer().makeDiff(expectedEcotourism, actualEcotourism);
        Assert.assertFalse(diffEcotourism.hasDiff());

        activePeru.getSoftAdventure().click();
        Selenide.sleep(2000);
        BufferedImage actualSoftAdventure = ImageIO.read(new File(screenshots.takeScreenShotAsFile().getPath()));
        BufferedImage expectedSoftAdventure = ImageIO.read(new File(System.getProperty("user.dir") + pathToScreenshots + "SoftAdventure.png"));
        ImageDiff diffSoftAdventure = new ImageDiffer().makeDiff(expectedSoftAdventure, actualSoftAdventure);
        Assert.assertFalse(diffSoftAdventure.hasDiff());

        activePeru.getWatersports().click();
        Selenide.sleep(2000);
        BufferedImage actualWatersports = ImageIO.read(new File(screenshots.takeScreenShotAsFile().getPath()));
        BufferedImage expectedWatersports = ImageIO.read(new File(System.getProperty("user.dir") + pathToScreenshots + "Watersports.png"));
        ImageDiff diffWatersports = new ImageDiffer().makeDiff(expectedWatersports, actualWatersports);
        Assert.assertFalse(diffWatersports.hasDiff());

        activePeru.getTouringAncient().click();
        Selenide.sleep(2000);
        BufferedImage actualTouringAncient = ImageIO.read(new File(screenshots.takeScreenShotAsFile().getPath()));
        BufferedImage expectedTouringAncient = ImageIO.read(new File(System.getProperty("user.dir") + pathToScreenshots + "TouringAncient.png"));
        ImageDiff diffTouringAncient = new ImageDiffer().makeDiff(expectedTouringAncient, actualTouringAncient);
        Assert.assertFalse(diffTouringAncient.hasDiff());
    }

}
