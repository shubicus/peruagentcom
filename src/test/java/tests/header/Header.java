package tests.header;


import com.automation.remarks.testng.VideoListener;
import com.automation.remarks.video.annotations.Video;
import config.ConfigurationExtentReport;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utils.CompareHeaderNavigation;
import webpages.destination_discovery.active_peru.ActivePeru;
import webpages.destination_discovery.discover_peru.DiscoverPeru;
import webpages.destination_discovery.fast_facts.FastFacts;
import webpages.destination_discovery.introduction.Introduction;
import webpages.destination_discovery.peru_essentials.PeruEssentials;
import webpages.destination_discovery.peru_target_markets.PeruTargetMarkets;
import webpages.header.GlobalButtons;
import webpages.homepage.HomePage;
import webpages.sales_toolbox.brochures.Brochures;
import webpages.sales_toolbox.explore_peru.ExplorePeru;
import webpages.sales_toolbox.official_website.OfficialWebsite;
import webpages.sales_toolbox.presentation.Presentation;
import webpages.sales_toolbox.videos.Videos;
import webpages.supplier_directory.cruises_river.CruisesRiver;
import webpages.supplier_directory.hotels_accommodation.HotelsAccommodation;
import webpages.supplier_directory.tour_operators.TourOperators;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.switchTo;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static config.ConfigurationExtentReport.extent;
import static utils.CompareHeaderNavigation.*;

@Listeners(VideoListener.class)
public class Header {

    private FastFacts fastFacts = new FastFacts();
    private GlobalButtons globalButtons = new GlobalButtons();

    private HomePage homePage = new HomePage();

    private Introduction introduction = new Introduction();
    private DiscoverPeru discoverPeru = new DiscoverPeru();
    private PeruEssentials peruEssentials = new PeruEssentials();
    private ActivePeru activePeru = new ActivePeru();
    private PeruTargetMarkets peruTargetMarkets = new PeruTargetMarkets();
    private HotelsAccommodation hotelsAccommodation = new HotelsAccommodation();
    private TourOperators tourOperators = new TourOperators();
    private CruisesRiver cruisesRiver = new CruisesRiver();
    private Videos videos = new Videos();
    private Brochures brochures = new Brochures();
    private Presentation presentation = new Presentation();
    private ExplorePeru explorePeru = new ExplorePeru();
    private OfficialWebsite officialWebsite = new OfficialWebsite();

    @BeforeClass
    public void openIntroductionPage() {
        getWebDriver().navigate().to(fastFacts.getUrl());  //it can be any place to start this test-case
    }


    @AfterMethod
    public void recordTestsToExtentReport(ITestResult result) throws IOException {
        ConfigurationExtentReport.getResult(result);
    }


    @Video
    @Test(description = "This TC#038 verifies that the Header navigates to the Homepage.")
    public void test1HeaderNavigationHome() {
        ConfigurationExtentReport.test = extent.createTest("testHeaderNavigationHome", "This TC#038 verifies that the Header navigates to the Homepage.");

        globalButtons.getHome_btn().click();
        String urlHome = getWebDriver().getCurrentUrl();
        Assert.assertEquals(urlHome, homePage.getUrl());

        getWebDriver().navigate().back();
    }

    @Video
    @Test(description = "This TC#039 verifies that the Header navigates to the sub DiscoverPeru links.")
    public void test2HeaderNavigationDiscoverPeru() {
        ConfigurationExtentReport.test = extent.createTest("testHeaderNavigationDiscoverPeru", "This TC#039 verifies that the Header navigates to the sub DiscoverPeru links.");

        Assert.assertEquals(compareDiscoverLinks("Introduction"), introduction.getUrl());
        Assert.assertEquals(compareDiscoverLinks("Peru Essentials"), peruEssentials.getUrl());
        Assert.assertEquals(compareDiscoverLinks("Discover Peru"), discoverPeru.getUrl());
        Assert.assertEquals(compareDiscoverLinks("Active Peru"), activePeru.getUrl());
        Assert.assertEquals(compareDiscoverLinks("Peru: Target Markets   "), peruTargetMarkets.getUrl());
    }

    @Video
    @Test(description = "This TC#040 verifies that the Header navigates to the sub SupplierShowcase links.")
    public void test3HeaderNavigationSupplierShowcase() {
        ConfigurationExtentReport.test = extent.createTest("testHeaderNavigationSupplierShowcase", "This TC#040 verifies that the Header navigates to the sub SupplierShowcase links.");

        Assert.assertEquals(compareSupplierShowcaseLinks("Hotels & Accommodations"), hotelsAccommodation.getUrl());
        Assert.assertEquals(compareSupplierShowcaseLinks("Tour Operators"), tourOperators.getUrl());
        Assert.assertEquals(compareSupplierShowcaseLinks("Cruises & River Cruises"), cruisesRiver.getUrl());
    }

    @Video
    @Test(description = "This TC#041 verifies that the Header navigates to the sub SalesToolbox links.")
    public void test4HeaderNavigationSalesToolbox() {
        ConfigurationExtentReport.test = extent.createTest("test4HeaderNavigationSalesToolbox", "This TC#041 verifies that the Header navigates to the sub SalesToolbox links.");

        Assert.assertEquals(compareSalesToolboxLinks("Videos"), videos.getUrl());
        Assert.assertEquals(compareSalesToolboxLinks("Brochures"), brochures.getUrl());
        Assert.assertEquals(compareSalesToolboxLinks(" Presentation "), presentation.getUrl());
        presentation.getFancyboxClose_btn().click();
        Assert.assertEquals(compareSalesToolboxLinks(" Explore Peru "), explorePeru.getUrl());

        compareSalesToolboxLinks("Official Website");
        switchTo().window(1);
        Assert.assertEquals(getWebDriver().getCurrentUrl(), officialWebsite.getUrl());
        switchTo().window(1).close();
        switchTo().window(0);
    }

}
