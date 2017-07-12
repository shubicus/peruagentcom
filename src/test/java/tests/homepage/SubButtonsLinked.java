package tests.homepage;


import com.automation.remarks.testng.VideoListener;
import com.automation.remarks.video.annotations.Video;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import config.ConfigurationExtentReport;
import webpages.destination_discovery.active_peru.ActivePeru;
import webpages.sales_toolbox.brochures.Brochures;
import webpages.supplier_directory.cruises_river.CruisesRiver;
import webpages.destination_discovery.discover_peru.DiscoverPeru;
import webpages.sales_toolbox.explore_peru.ExplorePeru;
import webpages.header.GlobalButtons;
import webpages.homepage.HomePage;
import webpages.supplier_directory.hotels_accommodation.HotelsAccommodation;
import webpages.destination_discovery.introduction.Introduction;
import webpages.sales_toolbox.official_website.OfficialWebsite;
import webpages.destination_discovery.peru_essentials.PeruEssentials;
import webpages.destination_discovery.peru_target_markets.PeruTargetMarkets;
import webpages.sales_toolbox.presentation.Presentation;
import webpages.supplier_directory.tour_operators.TourOperators;
import webpages.sales_toolbox.videos.Videos;

import java.io.IOException;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static config.ConfigurationExtentReport.extent;

@Listeners(VideoListener.class)
public class SubButtonsLinked {

    private HomePage homePage = new HomePage();
    private GlobalButtons globalButtons = new GlobalButtons();



    @AfterMethod
    public void recordTestsToExtentReport(ITestResult result) throws IOException {
        ConfigurationExtentReport.getResult(result);
    }

    @Video
    @Test(description = "This TC#014 verifies that SubDestinationDiscovery Buttons are clickable and opens in new URL.")
    public void test1SubDestinationDiscoveryButtons() {
        ConfigurationExtentReport.test = extent.createTest("testSubDestinationDiscoveryButtons", "This TC#014 verifies that SubDestinationDiscovery Buttons are clickable and opens in new Window");

        Introduction introduction = new Introduction();
        PeruEssentials peruEssentials = new PeruEssentials();
        DiscoverPeru discoverPeru = new DiscoverPeru();
        ActivePeru activePeru = new ActivePeru();
        PeruTargetMarkets peruTargetMarkets = new PeruTargetMarkets();


        refresh();

        homePage.getDestinationDiscovery_btn_img().click();
        homePage.getIntroduction_btn_img().click();
        introduction.getTitle().shouldHave(text("EPISODE 1: Introduction"));

//        navigator.back();
        globalButtons.getHome_btn().click();

        homePage.getDestinationDiscovery_btn_img().click();
        homePage.getPeruEssentials_btn_img().click();
        peruEssentials.getTitle().shouldHave(text("EPISODE 2: Peru Essentials"));

//        navigator.back();
        globalButtons.getHome_btn().click();

        homePage.getDestinationDiscovery_btn_img().click();
        homePage.getDiscoverPeru_btn_img().click();
        discoverPeru.getTitle().shouldHave(text("EPISODE 3: Discover Peru"));

//        navigator.back();
        globalButtons.getHome_btn().click();

        homePage.getDestinationDiscovery_btn_img().click();
        homePage.getActivePeru_btn_img().click();
        activePeru.getTitle().shouldHave(text("EPISODE 4: Active Peru"));

//        navigator.back();
        globalButtons.getHome_btn().click();

        homePage.getDestinationDiscovery_btn_img().click();
        homePage.getPeruTargetMarkets_btn_img().click();
        peruTargetMarkets.getTitle().shouldHave(text("EPISODE 5: Peru: Target Markets   "));

        globalButtons.getHome_btn().click();
    }


    @Video
    @Test(description = "This TC#015 verifies that SubSupplierDirectory Buttons are clickable and opens in new BrowserTab.")
    public void test2SubSupplierDirectoryButtons() {
        ConfigurationExtentReport.test = extent.createTest("testSubSupplierDirectoryButtons", "This TC#015 verifies that SubSupplierDirectory Buttons are clickable and opens in new BrowserTab");

        TourOperators tourOperators = new TourOperators();
        HotelsAccommodation hotelsAccommodation = new HotelsAccommodation();
        CruisesRiver cruisesRiver = new CruisesRiver();

        refresh();

        homePage.getSupplierDirectory_btn_img().click();

        homePage.getTourOperators_btn_img().click();
        String tourUrl = switchTo().window(1).getCurrentUrl();
        tourOperators.getFilterOnType_txt().shouldHave(text("Filter on Location:"));
        Assert.assertEquals(tourUrl, tourOperators.getUrl());

        switchTo().window(homePage.getTitle());

        homePage.getHotelsAccommodation_btn_img().click();
        String hotelsUrl = switchTo().window(2).getCurrentUrl();
        hotelsAccommodation.getFilterOnType_txt().shouldHave(text("Filter on Region:"));
        Assert.assertEquals(hotelsUrl, hotelsAccommodation.getUrl());

        switchTo().window(homePage.getTitle());

        homePage.getCruisesRiverCruises_btn_img().click();
        String cruiseUrl = switchTo().window(3).getCurrentUrl();
        cruisesRiver.getFilterOnType_txt().shouldHave(text("Filter on type of cruise:"));
        Assert.assertEquals(cruiseUrl, cruisesRiver.getUrl());

        switchTo().window(3).close();
        switchTo().window(2).close();
        switchTo().window(1).close();

        switchTo().window(homePage.getTitle());
    }


    @Video
    @Test(description = "This TC#016 verifies that Sub ButtonsSalesToolbox are clickable and opens in new URL.")
    public void test3SubSalesToolboxButtons() {
        ConfigurationExtentReport.test = extent.createTest("testSubSalesToolboxButtons", "This TC#016 verifies that Sub ButtonsSalesToolbox are clickable and opens in new URL");

        Presentation presentation = new Presentation();
        Brochures brochures = new Brochures();
        Videos videos = new Videos();
        ExplorePeru explorePeru = new ExplorePeru();
        OfficialWebsite officialWebsite = new OfficialWebsite();  //new Tab in Browser


        refresh();

        homePage.getSalesToolbox_btn_img().click();
        homePage.getVideos_btn_img().click();
        String urlVideo = WebDriverRunner.getWebDriver().getCurrentUrl();
        Assert.assertEquals(urlVideo, videos.getUrl());

//        navigator.back();
        globalButtons.getHome_btn().click();

        homePage.getSalesToolbox_btn_img().click();
        homePage.getBrochures_btn_img().click();
        String urlBrochures = WebDriverRunner.getWebDriver().getCurrentUrl();
        Assert.assertEquals(urlBrochures, brochures.getUrl());

//        navigator.back();
        globalButtons.getHome_btn().click();

        homePage.getSalesToolbox_btn_img().click();
        homePage.getExplorePeru_btn_img().click();
        String urlExplore = WebDriverRunner.getWebDriver().getCurrentUrl();
        Assert.assertEquals(urlExplore, explorePeru.getUrl());

//        navigator.back();
        globalButtons.getHome_btn().click();

        homePage.getSalesToolbox_btn_img().click();
        homePage.getPresentation_btn_img().click();
        String urlPresentation = WebDriverRunner.getWebDriver().getCurrentUrl();
        Assert.assertEquals(urlPresentation, presentation.getUrl());

        navigator.back();
//        globalButtons.getHome_btn().click();

        homePage.getSalesToolbox_btn_img().click();
        homePage.getOfficialWebsite_btn_img().click();  //new Tab in Browser
        String urlWebsite = switchTo().window(1).getCurrentUrl();
        String titleWebsite = WebDriverRunner.getWebDriver().getTitle();
        Assert.assertEquals(urlWebsite, officialWebsite.getUrl());
        Assert.assertEquals(titleWebsite, officialWebsite.getTitleWindow());

        switchTo().window(1).close();

        switchTo().window(homePage.getTitle());
    }


}
