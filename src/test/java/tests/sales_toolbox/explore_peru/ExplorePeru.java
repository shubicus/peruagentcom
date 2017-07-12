package tests.sales_toolbox.explore_peru;


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

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static com.codeborne.selenide.Screenshots.screenshots;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static config.ConfigurationExtentReport.extent;

@Listeners({VideoListener.class, ScreenshotListenerForNonSelenideAssertion.class})
public class ExplorePeru {

    private webpages.sales_toolbox.explore_peru.ExplorePeru explorePeru = new webpages.sales_toolbox.explore_peru.ExplorePeru();
    private String pathToScreenshots = "/src/test/resources/explore_peru_screenshots/";

    @BeforeClass
    public void openIntroductionPage() {
        getWebDriver().navigate().to(explorePeru.getUrl());
    }


    @AfterMethod
    public void recordTestsToExtentReport(ITestResult result) throws IOException {
        ConfigurationExtentReport.getResult(result);
    }


    @Video
    @Test(description = "This TC#026 verifies that the Map is actual.")
    public void testMap() throws IOException {
        ConfigurationExtentReport.test = extent.createTest("testMap", "This TC#026 verifies that Map is correct.");

        Selenide.sleep(2000);
        BufferedImage actualMap = ImageIO.read(new File(screenshots.takeScreenShotAsFile().getPath()));
        BufferedImage expectedMap = ImageIO.read(new File(System.getProperty("user.dir") + pathToScreenshots + "Map.png"));
        ImageDiff diffMap = new ImageDiffer().makeDiff(expectedMap, actualMap);
        Assert.assertFalse(diffMap.hasDiff());
    }

}
