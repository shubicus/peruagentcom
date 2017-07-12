package tests.supplier_directory.hotels_accommodation;


import com.automation.remarks.testng.VideoListener;
import com.automation.remarks.video.annotations.Video;
import config.ConfigurationExtentReport;
import org.testng.ITestResult;
import org.testng.annotations.*;
import webpages.supplier_directory.hotels_accommodation.HotelsAccommodation;

import java.io.IOException;

import static com.codeborne.selenide.Condition.disappear;
import static com.codeborne.selenide.Selenide.refresh;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static config.ConfigurationExtentReport.extent;
import static utils.SupplierDirectoryComparator.compareInfoCardBody;
import static utils.SupplierDirectoryComparator.compareResponse;

@Listeners(VideoListener.class)
public class ExternalLinksHotels {

    private HotelsAccommodation hotels = new HotelsAccommodation();
    private int cards;

    @BeforeClass
    public void openIntroductionPage() {
        getWebDriver().navigate().to(hotels.getUrl());
        hotels.getLoadPage().waitUntil(disappear, 10000);
    }

    @BeforeMethod
    public void refreshPage() {
        refresh();
        hotels.getCloseFilterWindow_btn().click();
        hotels.getLoadPage().waitUntil(disappear, 10000);
    }

    @AfterMethod
    public void recordTestsToExtentReport(ITestResult result) throws IOException {
        ConfigurationExtentReport.getResult(result);
    }

    @Video
    @Test(description = "This TC#034 verifies that card and body have the same info.")
    public void test1OperatorsCardBodyInfo() {
        ConfigurationExtentReport.test = extent.createTest("testOperatorsCardBodyInfo", "This TC#0?? verifies that card and body have the same info.");

        this.cards = hotels.getCards().size();

        compareInfoCardBody(cards);
    }

    @Video
    @Test(description = "This TC#035 verifies that All external links are alive (code=200).")
    public void test2HotelsExternalLinks() throws IOException {
        ConfigurationExtentReport.test = extent.createTest("testHotelsExternalLinks", "This TC#0?? verifies that All external links are alive (code=200).");

        compareResponse(cards);

    }


}
