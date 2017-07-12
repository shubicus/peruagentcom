package tests.supplier_directory.tour_operators;


import com.automation.remarks.testng.VideoListener;
import com.automation.remarks.video.annotations.Video;
import config.ConfigurationExtentReport;
import org.testng.ITestResult;
import org.testng.annotations.*;
import webpages.supplier_directory.tour_operators.TourOperators;

import java.io.IOException;

import static com.codeborne.selenide.Condition.disappear;
import static com.codeborne.selenide.Selenide.refresh;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static config.ConfigurationExtentReport.extent;
import static utils.SupplierDirectoryComparator.compareInfoCardBody;
import static utils.SupplierDirectoryComparator.compareResponse;

@Listeners(VideoListener.class)
public class ExternalLinksTours {

    private TourOperators tourOperators = new TourOperators();
    private int cards;

    @BeforeClass
    public void openIntroductionPage() {
        getWebDriver().navigate().to(tourOperators.getUrl());
        tourOperators.getLoadPage().waitUntil(disappear, 10000);
    }

    @BeforeMethod
    public void refreshPage() {
        refresh();
        tourOperators.getCloseFilterWindow_btn().click();
        tourOperators.getLoadPage().waitUntil(disappear, 10000);
    }

    @AfterMethod
    public void recordTestsToExtentReport(ITestResult result) throws IOException {
        ConfigurationExtentReport.getResult(result);
    }


    @Video
    @Test(description = "This TC#036 verifies that card and body have the same info.")
    public void test1OperatorsCardBodyInfo() {
        ConfigurationExtentReport.test = extent.createTest("testOperatorsCardBodyInfo", "This TC#036 verifies that card and body have the same info.");

        this.cards = tourOperators.getCards().size();

        compareInfoCardBody(cards);
    }

    @Video
    @Test(description = "This TC#037 verifies that external links are alive (code=200).")
    public void test2OperatorsExternalLinks() throws IOException {
        ConfigurationExtentReport.test = extent.createTest("testOperatorsExternalLinks", "This TC#037 verifies that external links are alive (code=200).");

        compareResponse(cards);

    }


}
