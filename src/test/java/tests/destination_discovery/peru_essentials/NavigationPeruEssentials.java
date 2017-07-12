package tests.destination_discovery.peru_essentials;


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
import webpages.destination_discovery.peru_essentials.PeruEssentials;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static com.codeborne.selenide.Screenshots.screenshots;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static config.ConfigurationExtentReport.extent;

@Listeners({VideoListener.class, ScreenshotListenerForNonSelenideAssertion.class})
public class NavigationPeruEssentials {

    private PeruEssentials peruEssentials = new PeruEssentials();
    private String pathToScreenshots = "/src/test/resources/peru_essentials_screenshots/";

    @BeforeClass
    public void openNavigationPeruEssentials() {
        getWebDriver().navigate().to(peruEssentials.getUrl());
    }


    @AfterMethod
    public void recordTestsToExtentReport(ITestResult result) throws IOException {
        ConfigurationExtentReport.getResult(result);
    }


    @Video
    @Test(description = "This TC#020 verifies that text-link navigate a user to the correct place of PeruEssentials page.")
    public void testNavigationPeruEssentialsPage() throws IOException {
        ConfigurationExtentReport.test = extent.createTest("testNavigationPeruEssentialsPage", "This TC#020 verifies that text-link navigate a user to the correct place of PeruEssentials page.");

        peruEssentials.getGettingThere_link().click();
        Selenide.sleep(2000);
        BufferedImage actualGettingThere = ImageIO.read(new File(screenshots.takeScreenShotAsFile().getPath()));
        BufferedImage expectedGettingThere = ImageIO.read(new File(System.getProperty("user.dir") + pathToScreenshots + "GettingThere.png"));
        ImageDiff diffGettingThere = new ImageDiffer().makeDiff(expectedGettingThere, actualGettingThere);
        Assert.assertFalse(diffGettingThere.hasDiff());

        peruEssentials.getGettingAround_link().click();
        Selenide.sleep(2000);
        BufferedImage actualGettingAround = ImageIO.read(new File(screenshots.takeScreenShotAsFile().getPath()));
        BufferedImage expectedGettingAround = ImageIO.read(new File(System.getProperty("user.dir") + pathToScreenshots + "GettingAround.png"));
        ImageDiff diffGettingAround = new ImageDiffer().makeDiff(expectedGettingAround, actualGettingAround);
        Assert.assertFalse(diffGettingAround.hasDiff());

        peruEssentials.getAccommodations_link().click();
        Selenide.sleep(2000);
        BufferedImage actualAccommodations = ImageIO.read(new File(screenshots.takeScreenShotAsFile().getPath()));
        BufferedImage expectedAccommodations = ImageIO.read(new File(System.getProperty("user.dir") + pathToScreenshots + "Accommodations.png"));
        ImageDiff diffAccommodations = new ImageDiffer().makeDiff(expectedAccommodations, actualAccommodations);
        Assert.assertFalse(diffAccommodations.hasDiff());

        peruEssentials.getShopping_link().click();
        Selenide.sleep(2000);
        BufferedImage actualShopping = ImageIO.read(new File(screenshots.takeScreenShotAsFile().getPath()));
        BufferedImage expectedShopping = ImageIO.read(new File(System.getProperty("user.dir") + pathToScreenshots + "Shopping.png"));
        ImageDiff diffShopping = new ImageDiffer().makeDiff(expectedShopping, actualShopping);
        Assert.assertFalse(diffShopping.hasDiff());

        peruEssentials.getDiningNightlife_link().click();
        Selenide.sleep(2000);
        BufferedImage actualDiningNightlife = ImageIO.read(new File(screenshots.takeScreenShotAsFile().getPath()));
        BufferedImage expectedDiningNightlife = ImageIO.read(new File(System.getProperty("user.dir") + pathToScreenshots + "DiningNightlife.png"));
        ImageDiff diffDiningNightlife = new ImageDiffer().makeDiff(expectedDiningNightlife, actualDiningNightlife);
        Assert.assertFalse(diffDiningNightlife.hasDiff());

        peruEssentials.getFestivals_link().click();
        Selenide.sleep(2000);
        BufferedImage actualFestivals = ImageIO.read(new File(screenshots.takeScreenShotAsFile().getPath()));
        BufferedImage expectedFestivals = ImageIO.read(new File(System.getProperty("user.dir") + pathToScreenshots + "Festivals.png"));
        ImageDiff diffFestivals = new ImageDiffer().makeDiff(expectedFestivals, actualFestivals);
        Assert.assertFalse(diffFestivals.hasDiff());
    }

}
