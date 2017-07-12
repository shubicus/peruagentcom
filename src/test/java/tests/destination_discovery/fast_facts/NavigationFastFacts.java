package tests.destination_discovery.fast_facts;


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
import webpages.destination_discovery.fast_facts.FastFacts;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Screenshots.screenshots;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static config.ConfigurationExtentReport.extent;

@Listeners(VideoListener.class)
public class NavigationFastFacts {

    private FastFacts fastFacts = new FastFacts();
    private String pathToScreenshots = "/src/test/resources/fast_facts_screenshots/";

    @BeforeClass
    public void openNavigationFastFactsPage() {
        getWebDriver().navigate().to(fastFacts.getUrl());
    }


    @AfterMethod
    public void recordTestsToExtentReport(ITestResult result) throws IOException {
        ConfigurationExtentReport.getResult(result);
    }


    @Video
    @Test(description = "This TC#023 verifies that FastFactsPage has correct Face/Frontend.")
    public void testFaceFastFactsPage() throws IOException {
        ConfigurationExtentReport.test = extent.createTest("testFaceFastFactsPage", "This TC#023 verifies that FastFactsPage has correct Face.");

        fastFacts.getTitleOfPage_txt().waitUntil(visible, 3000).shouldHave(text("FAST FACTS"));
        Selenide.sleep(2000);
        BufferedImage actualFastFacts = ImageIO.read(new File(screenshots.takeScreenShotAsFile().getPath()));
        BufferedImage expectedFastFacts = ImageIO.read(new File(System.getProperty("user.dir") + pathToScreenshots + "FastFacts.png"));
        ImageDiff diffFastFacts = new ImageDiffer().makeDiff(expectedFastFacts, actualFastFacts);
        Assert.assertFalse(diffFastFacts.hasDiff());
    }

    @Video
    @Test(description = "This TC#029 verifies that all Elements have correct behave.", dependsOnMethods = "testFaceFastFactsPage")
    public void testNavigationButtons() {
        ConfigurationExtentReport.test = extent.createTest("testNavigationButtons", "This TC#029 verifies that all Elements have correct behave.");

        fastFacts.getFancybox().shouldBe(disappear);
        fastFacts.getTitleMap_btn().click();
        fastFacts.getFancybox().shouldBe(visible).shouldHave(attribute("style", "width: auto; height: auto; display: block;"));
        Assert.assertEquals(fastFacts.getSrcAttribute().getAttribute("src"), fastFacts.getEnlargeMapImage_link());
        fastFacts.getFancyboxClose().click();
        fastFacts.getFancybox().shouldBe(disappear);

        fastFacts.getTitleGetting_btn().click();
        fastFacts.getFancybox().shouldBe(visible).shouldHave(attribute("style", "width: auto; height: auto; display: block;"));
        Assert.assertEquals(fastFacts.getSrcAttribute().getAttribute("src"), fastFacts.getEnlargeGetting_link());
        fastFacts.getFancyboxClose().click();
        fastFacts.getFancybox().shouldBe(disappear);

        fastFacts.getTitlePeruDelivers_btn().click();
        fastFacts.getFancybox().shouldBe(visible).shouldHave(attribute("style", "width: auto; height: auto; overflow: hidden; display: block;"));
        Assert.assertEquals(fastFacts.getSrcAttribute().getAttribute("src"), fastFacts.getEnlargePeruDelivers_link());
        fastFacts.getFancyboxClose().click();
        fastFacts.getFancybox().shouldBe(disappear);

        fastFacts.getTitleFunFacts_btn().click();
        fastFacts.getFancybox().shouldBe(visible).shouldHave(attribute("style", "width: auto; height: auto; overflow: hidden; display: block;"));
        Assert.assertEquals(fastFacts.getSrcAttribute().getAttribute("src"), fastFacts.getEnlargeFunFacts_link());
        fastFacts.getFancyboxClose().click();
        fastFacts.getFancybox().shouldBe(disappear);

        fastFacts.getTitleFestivals_btn().click();
        fastFacts.getFancybox().shouldBe(visible).shouldHave(attribute("style", "width: auto; height: auto; display: block;"));
        Assert.assertEquals(fastFacts.getSrcAttribute().getAttribute("src"), fastFacts.getEnlargeFestivals_link());
        fastFacts.getFancyboxClose().click();
        fastFacts.getFancybox().shouldBe(disappear);

        fastFacts.getTitleContact_btn().click();
        Assert.assertEquals(getWebDriver().getCurrentUrl(), fastFacts.getEnlargeContact_link());
        getWebDriver().navigate().back();

        fastFacts.getTitleNews_btn().click();
        fastFacts.getFancybox().shouldBe(visible).shouldHave(attribute("style", "width: auto; height: auto; display: block;"));
        Assert.assertEquals(fastFacts.getSrcAttribute().getAttribute("src"), fastFacts.getEnlargeNews_link());
        fastFacts.getFancyboxClose().click();
        fastFacts.getFancybox().shouldBe(disappear);

        fastFacts.getTitleFAQ_btn().click();
        Assert.assertEquals(getWebDriver().getCurrentUrl(), fastFacts.getEnlargeFAQ_link());
        getWebDriver().navigate().back();

        fastFacts.getTitleAwards_btn().click();
        fastFacts.getFancybox().shouldBe(visible).shouldHave(attribute("style", "width: auto; height: auto; display: block;"));
        Assert.assertEquals(fastFacts.getSrcAttribute().getAttribute("src"), fastFacts.getEnlargeAwards_link());
        fastFacts.getFancyboxClose().click();
        fastFacts.getFancybox().shouldBe(disappear);


    }
}
