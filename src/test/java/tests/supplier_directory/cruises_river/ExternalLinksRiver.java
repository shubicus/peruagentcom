package tests.supplier_directory.cruises_river;

import com.automation.remarks.testng.VideoListener;
import com.automation.remarks.video.annotations.Video;
import config.ConfigurationExtentReport;
import org.testng.ITestResult;
import org.testng.annotations.*;
import webpages.supplier_directory.cruises_river.CruisesRiver;

import java.io.IOException;

import static com.codeborne.selenide.Condition.disappear;
import static com.codeborne.selenide.Selenide.refresh;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static config.ConfigurationExtentReport.extent;
import static utils.SupplierDirectoryComparator.compareInfoCardBody;
import static utils.SupplierDirectoryComparator.compareResponse;


@Listeners(VideoListener.class)
public class ExternalLinksRiver {

    private CruisesRiver cruisesRiver = new CruisesRiver();
    private int cardsRiver;

    @BeforeClass
    public void openIntroductionPage() {
        getWebDriver().navigate().to(cruisesRiver.getUrl());
        cruisesRiver.getRiverCruise_filter_btn().click();
        cruisesRiver.getLoadPage().waitUntil(disappear, 10000);
    }

    @BeforeMethod
    public void refreshPage() {
        refresh();
        cruisesRiver.getLoadPage().waitUntil(disappear, 10000);
    }

    @AfterMethod
    public void recordTestsToExtentReport(ITestResult result) throws IOException {
        ConfigurationExtentReport.getResult(result);
    }


    @Video
    @Test(description = "This TC#032 verifies that River's card and body have the same info.")
    public void test1RiverOperatorsCardBodyInfo() {
        ConfigurationExtentReport.test = extent.createTest("test1RiverOperatorsCardBodyInfo", "This TC#032 verifies that River's card and body have the same info.");

        this.cardsRiver = cruisesRiver.getCards().size();

        compareInfoCardBody(cardsRiver);
    }

    @Video
    @Test(description = "This TC#033 verifies that River's external links are alive (code=200).")
    public void test2RiverOperatorsExternalLinks() throws IOException {
        ConfigurationExtentReport.test = extent.createTest("test2RiverOperatorsExternalLinks", "This TC#033 verifies that River's external links are alive (code=200).");

        compareResponse(cardsRiver);
    }

}
