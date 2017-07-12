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
import static com.codeborne.selenide.WebDriverRunner.source;
import static config.ConfigurationExtentReport.extent;
import static utils.SupplierDirectoryComparator.compareInfoCardBody;
import static utils.SupplierDirectoryComparator.compareResponse;

@Listeners(VideoListener.class)
public class ExternalLinksCruise {

    private CruisesRiver cruisesRiver = new CruisesRiver();
    private int cardsCruise;

    @BeforeClass
    public void openIntroductionPage() {
        getWebDriver().navigate().to(cruisesRiver.getUrl());
//        cruisesRiver.getCloseFilterWindow_btn().click();  //
        cruisesRiver.getCruise_filter_btn().click();
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
    @Test(description = "This TC#030 verifies that Cruise's card and body have the same info.")
    public void test1CruiseOperatorsCardBodyInfo() {
        ConfigurationExtentReport.test = extent.createTest("test1CruiseOperatorsCardBodyInfo", "This TC#030 verifies that Cruise's card and body have the same info.");

        this.cardsCruise = cruisesRiver.getCards().size();
        System.out.println(cardsCruise);

        compareInfoCardBody(cardsCruise);
    }

    @Video
    @Test(description = "This TC#031 verifies that Cruise's external links are alive (code=200).", enabled = false)  //todo switch-ON after bugfix
    public void test2CruiseOperatorsExternalLinks() throws IOException {
        ConfigurationExtentReport.test = extent.createTest("test2CruiseOperatorsExternalLinks", "This TC#031 verifies that Cruise's external links are alive (code=200).");

        compareResponse(cardsCruise);
    }

}
