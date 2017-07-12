package tests.destination_discovery.discover_peru;

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
import webpages.destination_discovery.discover_peru.DiscoverPeru;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static com.codeborne.selenide.Screenshots.screenshots;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static config.ConfigurationExtentReport.extent;

@Listeners({VideoListener.class, ScreenshotListenerForNonSelenideAssertion.class})
public class NavigationDiscoverPeru {

    private DiscoverPeru discoverPeru = new DiscoverPeru();
    private String pathToScreenshots = "/src/test/resources/discover_peru_screenshots/";

    @BeforeClass
    public void openNavigationDiscoverPeruPage() {
        getWebDriver().navigate().to(discoverPeru.getUrl());
    }

    @AfterMethod
    public void recordTestsToExtentReport(ITestResult result) throws IOException {
        ConfigurationExtentReport.getResult(result);
    }

    @Video
    @Test(description = "This TC#021 verifies that text-link navigate a user to the correct place of the DiscoverPeru page.")
    public void testNavigationDiscoverPeruPage() throws IOException {
        ConfigurationExtentReport.test = extent.createTest("testNavigationDiscoverPeruPage", "This TC#021 verifies that text-link navigate a user to the correct place of DiscoverPeru page.");

        discoverPeru.getMachuPicchu_link().click();
        Selenide.sleep(2000);
        BufferedImage actualMachuPicchu = ImageIO.read(new File(screenshots.takeScreenShotAsFile().getPath()));
        BufferedImage expectedMachuPicchu = ImageIO.read(new File(System.getProperty("user.dir") + pathToScreenshots + "MachuPicchu.png"));
        ImageDiff diffMachuPicchu = new ImageDiffer().makeDiff(expectedMachuPicchu, actualMachuPicchu);
        Assert.assertFalse(diffMachuPicchu.hasDiff());

        discoverPeru.getIncaTrail_link().click();
        Selenide.sleep(2000);
        BufferedImage actualIncaTrail = ImageIO.read(new File(screenshots.takeScreenShotAsFile().getPath()));
        BufferedImage expectedIncaTrail = ImageIO.read(new File(System.getProperty("user.dir") + pathToScreenshots + "IncaTrail.png"));
        ImageDiff diffIncaTrail = new ImageDiffer().makeDiff(expectedIncaTrail, actualIncaTrail);
        Assert.assertFalse(diffIncaTrail.hasDiff());

        discoverPeru.getLakeTiticaca_link().click();
        Selenide.sleep(2000);
        BufferedImage actualLakeTiticaca = ImageIO.read(new File(screenshots.takeScreenShotAsFile().getPath()));
        BufferedImage expectedLakeTiticaca = ImageIO.read(new File(System.getProperty("user.dir") + pathToScreenshots + "LakeTiticaca.png"));
        ImageDiff diffLakeTiticaca = new ImageDiffer().makeDiff(expectedLakeTiticaca, actualLakeTiticaca);
        Assert.assertFalse(diffLakeTiticaca.hasDiff());

        discoverPeru.getPerusAmazon_link().click();
        Selenide.sleep(2000);
        BufferedImage actualPerusAmazon = ImageIO.read(new File(screenshots.takeScreenShotAsFile().getPath()));
        BufferedImage expectedPerusAmazon = ImageIO.read(new File(System.getProperty("user.dir") + pathToScreenshots + "PerusAmazon.png"));
        ImageDiff diffPerusAmazon = new ImageDiffer().makeDiff(expectedPerusAmazon, actualPerusAmazon);
        Assert.assertFalse(diffPerusAmazon.hasDiff());

        discoverPeru.getColcaCanyon_link().click();
        Selenide.sleep(2000);
        BufferedImage actualColcaCanyon = ImageIO.read(new File(screenshots.takeScreenShotAsFile().getPath()));
        BufferedImage expectedColcaCanyon = ImageIO.read(new File(System.getProperty("user.dir") + pathToScreenshots + "ColcaCanyon.png"));
        ImageDiff diffColcaCanyon = new ImageDiffer().makeDiff(expectedColcaCanyon, actualColcaCanyon);
        Assert.assertFalse(diffColcaCanyon.hasDiff());

        discoverPeru.getNazcaLines_link().click();
        Selenide.sleep(2000);
        BufferedImage actualNazcaLines = ImageIO.read(new File(screenshots.takeScreenShotAsFile().getPath()));
        BufferedImage expectedNazcaLines = ImageIO.read(new File(System.getProperty("user.dir") + pathToScreenshots + "NazcaLines.png"));
        ImageDiff diffNazcaLines = new ImageDiffer().makeDiff(expectedNazcaLines, actualNazcaLines);
        Assert.assertFalse(diffNazcaLines.hasDiff());

        discoverPeru.getLima_link().click();
        Selenide.sleep(2000);
        BufferedImage actualLima = ImageIO.read(new File(screenshots.takeScreenShotAsFile().getPath()));
        BufferedImage expectedLima = ImageIO.read(new File(System.getProperty("user.dir") + pathToScreenshots + "Lima.png"));
        ImageDiff diffLima = new ImageDiffer().makeDiff(expectedLima, actualLima);
        Assert.assertFalse(diffLima.hasDiff());

        discoverPeru.getCusco_link().click();
        Selenide.sleep(2000);
        BufferedImage actualCusco = ImageIO.read(new File(screenshots.takeScreenShotAsFile().getPath()));
        BufferedImage expectedCusco = ImageIO.read(new File(System.getProperty("user.dir") + pathToScreenshots + "Cusco.png"));
        ImageDiff diffCusco = new ImageDiffer().makeDiff(expectedCusco, actualCusco);
        Assert.assertFalse(diffCusco.hasDiff());
    }

}
