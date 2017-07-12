package tests.homepage;

import com.automation.remarks.testng.VideoListener;
import com.automation.remarks.video.annotations.Video;
import config.ConfigurationExtentReport;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import utils.ScreenshotListenerForNonSelenideAssertion;
import webpages.homepage.HomePage;
import webpages.login_form.WelcomeLoginForm;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import static com.codeborne.selenide.Condition.*;
import static config.ConfigurationExtentReport.extent;

@Listeners({VideoListener.class, ScreenshotListenerForNonSelenideAssertion.class})
public class ImagesAndBehave {

    private HomePage homePage = new HomePage();
    private WelcomeLoginForm welcomeLoginForm = new WelcomeLoginForm();


    private String pathToImages = "/src/test/resources/homepage_images/";


    @AfterMethod
    public void recordTestsToExtentReport(ITestResult result) throws IOException {
        ConfigurationExtentReport.getResult(result);
    }


    @Video
    @Test(description = "This TC#001 verifies that Logo and four Center-Buttons are exist and have correct images.")
    public void testImagesFourCenterButtonsAndLogo() throws IOException {
        ConfigurationExtentReport.test = extent.createTest("testImagesFourCenterButtonsAndLogo", "This TC#001 verifies that Logo and four Center-Buttons are exist and have correct images");


        BufferedImage expectedLogo = ImageIO.read(new File(System.getProperty("user.dir") + pathToImages + "Logo_img.png"));
        BufferedImage actualLogo = ImageIO.read(new URL(homePage.getLogo_img().getAttribute("src")));
        ImageDiff diffLogo = new ImageDiffer().makeDiff(expectedLogo, actualLogo);
        Assert.assertFalse(diffLogo.hasDiff());


        BufferedImage expectedLogin = ImageIO.read(new File(System.getProperty("user.dir") + pathToImages + "Login_btn_img.png"));
        BufferedImage actualLogin = ImageIO.read(new URL(homePage.getLogin_btn_img().getAttribute("src")));
        ImageDiff diffLogin = new ImageDiffer().makeDiff(expectedLogin, actualLogin);
        Assert.assertFalse(diffLogin.hasDiff());


        BufferedImage expectedDestinationDiscovery = ImageIO.read(new File(System.getProperty("user.dir") + pathToImages + "DestinationDiscovery_btn_img.png"));
        BufferedImage actualDestinationDiscovery = ImageIO.read(new URL(homePage.getDestinationDiscovery_btn_img().getAttribute("src")));
        ImageDiff diffDestinationDiscovery = new ImageDiffer().makeDiff(expectedDestinationDiscovery, actualDestinationDiscovery);
        Assert.assertFalse(diffDestinationDiscovery.hasDiff());


        BufferedImage expectedSupplierDirectory = ImageIO.read(new File(System.getProperty("user.dir") + pathToImages + "SupplierDirectory_btn_img.png"));
        BufferedImage actualSupplierDirectory = ImageIO.read(new URL(homePage.getSupplierDirectory_btn_img().getAttribute("src")));
        ImageDiff diffSupplierDirectory = new ImageDiffer().makeDiff(expectedSupplierDirectory, actualSupplierDirectory);
        Assert.assertFalse(diffSupplierDirectory.hasDiff());


        BufferedImage expectedSalesToolbox = ImageIO.read(new File(System.getProperty("user.dir") + pathToImages + "SalesToolbox_btn_img.png"));
        BufferedImage actualSalesToolbox = ImageIO.read(new URL(homePage.getSalesToolbox_btn_img().getAttribute("src")));
        ImageDiff diffSalesToolbox = new ImageDiffer().makeDiff(expectedSalesToolbox, actualSalesToolbox);
        Assert.assertFalse(diffSalesToolbox.hasDiff());

    }

    @Video
    @Test(description = "This TC#002 verifies that Hidden DestinationDiscovery buttons are exist and have correct images.")
    public void testImagesHiddenDestinationDiscoveryButtons() throws IOException {
        ConfigurationExtentReport.test = extent.createTest("testImagesHidedDestinationDiscoveryButtons", "This TC#002 verifies that Hided DestinationDiscovery buttons are exist and have correct images");

        BufferedImage expectedIntroduction = ImageIO.read(new File(System.getProperty("user.dir") + pathToImages + "Introduction_btn_img.png"));
        BufferedImage actualIntroduction = ImageIO.read(new URL(homePage.getIntroduction_btn_img().getAttribute("src")));
        ImageDiff diffIntroduction = new ImageDiffer().makeDiff(expectedIntroduction, actualIntroduction);
        Assert.assertFalse(diffIntroduction.hasDiff());

        BufferedImage expectedPeruEssentials = ImageIO.read(new File(System.getProperty("user.dir") + pathToImages + "PeruEssentials_btn_img.png"));
        BufferedImage actualPeruEssentials = ImageIO.read(new URL(homePage.getPeruEssentials_btn_img().getAttribute("src")));
        ImageDiff diffPeruEssentials = new ImageDiffer().makeDiff(expectedPeruEssentials, actualPeruEssentials);
        Assert.assertFalse(diffPeruEssentials.hasDiff());

        BufferedImage expectedDiscoverPeru = ImageIO.read(new File(System.getProperty("user.dir") + pathToImages + "DiscoverPeru_btn_img.png"));
        BufferedImage actualDiscoverPeru = ImageIO.read(new URL(homePage.getDiscoverPeru_btn_img().getAttribute("src")));
        ImageDiff diffDiscoverPeru = new ImageDiffer().makeDiff(expectedDiscoverPeru, actualDiscoverPeru);
        Assert.assertFalse(diffDiscoverPeru.hasDiff());

        BufferedImage expectedActivePeru = ImageIO.read(new File(System.getProperty("user.dir") + pathToImages + "ActivePeru_btn_img.png"));
        BufferedImage actualActivePeru = ImageIO.read(new URL(homePage.getActivePeru_btn_img().getAttribute("src")));
        ImageDiff diffActivePeru = new ImageDiffer().makeDiff(expectedActivePeru, actualActivePeru);
        Assert.assertFalse(diffActivePeru.hasDiff());

        BufferedImage expectedPeruTargetMarkets = ImageIO.read(new File(System.getProperty("user.dir") + pathToImages + "PeruTargetMarkets_btn_img.png"));
        BufferedImage actualPeruTargetMarkets = ImageIO.read(new URL(homePage.getPeruTargetMarkets_btn_img().getAttribute("src")));
        ImageDiff diffPeruTargetMarkets = new ImageDiffer().makeDiff(expectedPeruTargetMarkets, actualPeruTargetMarkets);
        Assert.assertFalse(diffPeruTargetMarkets.hasDiff());

        BufferedImage expectedFastFacts = ImageIO.read(new File(System.getProperty("user.dir") + pathToImages + "FastFacts_btn_img.png"));
        BufferedImage actualFastFacts = ImageIO.read(new URL(homePage.getFastFacts_btn_img().getAttribute("src")));
        ImageDiff diffFastFacts = new ImageDiffer().makeDiff(expectedFastFacts, actualFastFacts);
        Assert.assertFalse(diffFastFacts.hasDiff());

    }

    @Video
    @Test(description = "This TC#003 verifies that Hidden SupplierDirectory buttons are exist and have correct images.")
    public void testImagesHiddenSupplierDirectoryButtons() throws IOException {
        ConfigurationExtentReport.test = extent.createTest("testImagesHidedSupplierDirectoryButtons", "This TC#003 verifies that Hided SupplierDirectory buttons are exist and have correct images");

        BufferedImage expectedTourOperators = ImageIO.read(new File(System.getProperty("user.dir") + pathToImages + "TourOperators_btn_img.png"));
        BufferedImage actualTourOperators = ImageIO.read(new URL(homePage.getTourOperators_btn_img().getAttribute("src")));
        ImageDiff diffTourOperators = new ImageDiffer().makeDiff(expectedTourOperators, actualTourOperators);
        Assert.assertFalse(diffTourOperators.hasDiff());

        BufferedImage expectedHotelsAccommodation = ImageIO.read(new File(System.getProperty("user.dir") + pathToImages + "HotelsAccommodation_btn_img.png"));
        BufferedImage actualHotelsAccommodation = ImageIO.read(new URL(homePage.getHotelsAccommodation_btn_img().getAttribute("src")));
        ImageDiff diffHotelsAccommodation = new ImageDiffer().makeDiff(expectedHotelsAccommodation, actualHotelsAccommodation);
        Assert.assertFalse(diffHotelsAccommodation.hasDiff());

        BufferedImage expectedCruisesRiverCruises = ImageIO.read(new File(System.getProperty("user.dir") + pathToImages + "CruisesRiverCruises_btn_img.png"));
        BufferedImage actualCruisesRiverCruises = ImageIO.read(new URL(homePage.getCruisesRiverCruises_btn_img().getAttribute("src")));
        ImageDiff diffCruisesRiverCruises = new ImageDiffer().makeDiff(expectedCruisesRiverCruises, actualCruisesRiverCruises);
        Assert.assertFalse(diffCruisesRiverCruises.hasDiff());

    }

    @Video
    @Test(description = "This TC#004 verifies that Hidden SalesToolbox buttons are exist and have correct images.")
    public void testImagesHiddenSalesToolboxButtons() throws IOException {
        ConfigurationExtentReport.test = extent.createTest("testImagesHidedSalesToolboxButtons", "This TC#004 verifies that Hided SalesToolbox buttons are exist and have correct images");

        BufferedImage expectedBrochures = ImageIO.read(new File(System.getProperty("user.dir") + pathToImages + "Brochures_btn_img.png"));
        BufferedImage actualBrochures = ImageIO.read(new URL(homePage.getBrochures_btn_img().getAttribute("src")));
        ImageDiff diffBrochures = new ImageDiffer().makeDiff(expectedBrochures, actualBrochures);
        Assert.assertFalse(diffBrochures.hasDiff());

        BufferedImage expectedVideos = ImageIO.read(new File(System.getProperty("user.dir") + pathToImages + "Videos_btn_img.png"));
        BufferedImage actualVideos = ImageIO.read(new URL(homePage.getVideos_btn_img().getAttribute("src")));
        ImageDiff diffVideos = new ImageDiffer().makeDiff(expectedVideos, actualVideos);
        Assert.assertFalse(diffVideos.hasDiff());

        BufferedImage expectedExplorePeru = ImageIO.read(new File(System.getProperty("user.dir") + pathToImages + "ExplorePeru_btn_img.png"));
        BufferedImage actualExplorePeru = ImageIO.read(new URL(homePage.getExplorePeru_btn_img().getAttribute("src")));
        ImageDiff diffExplorePeru = new ImageDiffer().makeDiff(expectedExplorePeru, actualExplorePeru);
        Assert.assertFalse(diffExplorePeru.hasDiff());

        BufferedImage expectedOfficialWebsite = ImageIO.read(new File(System.getProperty("user.dir") + pathToImages + "OfficialWebsite_btn_img.png"));
        BufferedImage actualOfficialWebsite = ImageIO.read(new URL(homePage.getOfficialWebsite_btn_img().getAttribute("src")));
        ImageDiff diffOfficialWebsite = new ImageDiffer().makeDiff(expectedOfficialWebsite, actualOfficialWebsite);
        Assert.assertFalse(diffOfficialWebsite.hasDiff());

        BufferedImage expectedPresentation = ImageIO.read(new File(System.getProperty("user.dir") + pathToImages + "Presentation_btn_img.png"));
        BufferedImage actualPresentation = ImageIO.read(new URL(homePage.getPresentation_btn_img().getAttribute("src")));
        ImageDiff diffPresentation = new ImageDiffer().makeDiff(expectedPresentation, actualPresentation);
        Assert.assertFalse(diffPresentation.hasDiff());

    }

    @Video
    @Test(description = "This TC#005 verifies that on click LoginButton the WelcomeLoginForm is shown.", dependsOnMethods = "testImagesFourCenterButtonsAndLogo")
    public void testLoginClick() {
        ConfigurationExtentReport.test = extent.createTest("testLoginClick", "This TC#005 verifies that on click LoginButton the WelcomeLoginForm is shown.");

        homePage.getLogin_btn_img().click();
        welcomeLoginForm.getWelcomeForm().shouldBe(visible);
    }

    @Video
    @Test(description = "This TC#006 verifies that on click LoginHideButton the WelcomeLoginForm is hidden.", dependsOnMethods = "testLoginClick")
    public void testLoginClickHide() {
        ConfigurationExtentReport.test = extent.createTest("testLoginClickHide", "This TC#006 verifies that on click LoginHideButton the WelcomeLoginForm is hidden.");

        welcomeLoginForm.getHideWelcomeForm_btn().click();
        welcomeLoginForm.getWelcomeForm().shouldNotBe(visible);
    }

    @Video
    @Test(description = "This TC#007 verifies that on first click DestinationDiscoveryButton the SixImageButtons are shown.", dependsOnMethods = "testLoginClickHide")
    public void testDestinationDiscoveryClickShow() {
        ConfigurationExtentReport.test = extent.createTest("testDestinationDiscoveryClick", "This TC#007 verifies that on click DestinationDiscoveryButton the SixImageButtons is shown.");

        homePage.getDestinationDiscovery_btn_img().click();  //open

        homePage.getIntroduction_btn_img().parent().parent().waitUntil(visible, 3000).shouldHave(attribute("style", "transform: rotate(360deg); position: absolute; opacity: 1; left: 233px; top: -42px;"));
        homePage.getPeruEssentials_btn_img().parent().parent().shouldBe(visible).shouldHave(attribute("style", "transform: rotate(360deg); position: absolute; opacity: 1; left: 402px; top: 100px;"));
        homePage.getDiscoverPeru_btn_img().parent().parent().shouldBe(visible).shouldHave(attribute("style", "transform: rotate(360deg); position: absolute; opacity: 1; left: 364px; top: 316px;"));
        homePage.getActivePeru_btn_img().parent().parent().shouldBe(visible).shouldHave(attribute("style", "transform: rotate(360deg); position: absolute; opacity: 1; left: 157px; top: 392px;"));
        homePage.getPeruTargetMarkets_btn_img().parent().parent().shouldBe(visible).shouldHave(attribute("style", "transform: rotate(360deg); position: absolute; opacity: 1; left: -12px; top: 250px;"));
        homePage.getFastFacts_btn_img().parent().parent().shouldBe(visible).shouldHave(attribute("style", "transform: rotate(360deg); position: absolute; opacity: 1; left: 26px; top: 34px;"));

    }

    @Video
    @Test(description = "This TC#008 verifies that on second click DestinationDiscoveryButton the SixImageButtons are hidden.", dependsOnMethods = "testDestinationDiscoveryClickShow")
    public void testDestinationDiscoveryClickHide() {
        ConfigurationExtentReport.test = extent.createTest("testDestinationDiscoveryClickHide", "This TC#008 verifies that on second click DestinationDiscoveryButton the SixImageButtons is hidden.");

        homePage.getDestinationDiscovery_btn_img().click(); //close

        homePage.getIntroduction_btn_img().parent().parent().waitUntil(hidden, 3000).shouldHave(attribute("style", "transform: rotate(-360deg); position: absolute; opacity: 0; left: 250px; top: 250px;"));
        homePage.getPeruEssentials_btn_img().parent().parent().shouldBe(hidden).shouldHave(attribute("style", "transform: rotate(-360deg); position: absolute; opacity: 0; left: 250px; top: 250px;"));
        homePage.getDiscoverPeru_btn_img().parent().parent().shouldBe(hidden).shouldHave(attribute("style", "transform: rotate(-360deg); position: absolute; opacity: 0; left: 250px; top: 250px;"));
        homePage.getActivePeru_btn_img().parent().parent().shouldBe(hidden).shouldHave(attribute("style", "transform: rotate(-360deg); position: absolute; opacity: 0; left: 250px; top: 250px;"));
        homePage.getPeruTargetMarkets_btn_img().parent().parent().shouldBe(hidden).shouldHave(attribute("style", "transform: rotate(-360deg); position: absolute; opacity: 0; left: 250px; top: 250px;"));
        homePage.getFastFacts_btn_img().parent().parent().shouldBe(hidden).shouldHave(attribute("style", "transform: rotate(-360deg); position: absolute; opacity: 0; left: 250px; top: 250px;"));

    }

    @Video
    @Test(description = "This TC#009 verifies that on first click SupplierDirectoryButton the ThreeImageButtons are shown.", dependsOnMethods = "testDestinationDiscoveryClickHide")
    public void testSupplierDirectoryClickShow() {
        ConfigurationExtentReport.test = extent.createTest("testSupplierDirectoryClickShow", "This TC#009 verifies that on first click SupplierDirectoryButton the ThreeImageButtons are shown.");

        homePage.getSupplierDirectory_btn_img().click();  //open

        homePage.getTourOperators_btn_img().parent().parent().waitUntil(visible, 3000).shouldHave(attribute("style", "transform: rotate(360deg); position: absolute; opacity: 1; left: 233px; top: -42px;"));
        homePage.getHotelsAccommodation_btn_img().parent().parent().shouldBe(visible).shouldHave(attribute("style", "transform: rotate(360deg); position: absolute; opacity: 1; left: 364px; top: 316px;"));
        homePage.getCruisesRiverCruises_btn_img().parent().parent().shouldBe(visible).shouldHave(attribute("style", "transform: rotate(360deg); position: absolute; opacity: 1; left: -12px; top: 250px;"));

    }

    @Video
    @Test(description = "This TC#010 verifies that on second click SupplierDirectoryButton the ThreeImageButtons are hidden.", dependsOnMethods = "testSupplierDirectoryClickShow")
    public void testSupplierDirectoryClickHide() {
        ConfigurationExtentReport.test = extent.createTest("testSupplierDirectoryClickHide", "This TC#010 verifies that on second click SupplierDirectoryButton the ThreeImageButtons are hidden.");

        homePage.getSupplierDirectory_btn_img().click();  //close

        homePage.getTourOperators_btn_img().parent().parent().waitUntil(hidden, 3000).shouldHave(attribute("style", "transform: rotate(-360deg); position: absolute; opacity: 0; left: 250px; top: 250px;"));
        homePage.getHotelsAccommodation_btn_img().parent().parent().shouldBe(hidden).shouldHave(attribute("style", "transform: rotate(-360deg); position: absolute; opacity: 0; left: 250px; top: 250px;"));
        homePage.getHotelsAccommodation_btn_img().parent().parent().shouldBe(hidden).shouldHave(attribute("style", "transform: rotate(-360deg); position: absolute; opacity: 0; left: 250px; top: 250px;"));

    }

    @Video
    @Test(description = "This TC#011 verifies that on first click SalesToolboxButton the FiveImageButtons are shown.", dependsOnMethods = "testSupplierDirectoryClickHide")
    public void testSalesToolboxButtonClickShow() {
        ConfigurationExtentReport.test = extent.createTest("testSalesToolboxButtonClickShow", "This TC#011 verifies that on first click SalesToolboxButton the FiveImageButtons are shown.");

        homePage.getSalesToolbox_btn_img().click();  //open

        homePage.getBrochures_btn_img().parent().parent().waitUntil(visible, 3000).shouldHave(attribute("style", "transform: rotate(360deg); position: absolute; opacity: 1; left: 233px; top: -42px;"));
        homePage.getVideos_btn_img().parent().parent().shouldBe(visible).shouldHave(attribute("style", "transform: rotate(360deg); position: absolute; opacity: 1; left: 413px; top: 144px;"));
        homePage.getExplorePeru_btn_img().parent().parent().shouldBe(visible).shouldHave(attribute("style", "transform: rotate(360deg); position: absolute; opacity: 1; left: 291px; top: 373px;"));
        homePage.getOfficialWebsite_btn_img().parent().parent().shouldBe(visible).shouldHave(attribute("style", "transform: rotate(360deg); position: absolute; opacity: 1; left: 37px; top: 328px;"));
        homePage.getPresentation_btn_img().parent().parent().shouldBe(visible).shouldHave(attribute("style", "transform: rotate(360deg); position: absolute; opacity: 1; left: 1px; top: 72px;"));

    }

    @Video
    @Test(description = "This TC#012 verifies that on second click SalesToolboxButton the FiveImageButtons are hidden.", dependsOnMethods = "testSalesToolboxButtonClickShow")
    public void testSalesToolboxButtonClickShowHide() {
        ConfigurationExtentReport.test = extent.createTest("testSalesToolboxButtonClickShowHide", "This TC#012 verifies that on second click SalesToolboxButton the FiveImageButtons are hidden.");

        homePage.getSalesToolbox_btn_img().click();  //close

        homePage.getBrochures_btn_img().parent().parent().waitUntil(hidden, 3000).shouldHave(attribute("style", "transform: rotate(-360deg); position: absolute; opacity: 0; left: 250px; top: 250px;"));
        homePage.getVideos_btn_img().parent().parent().shouldBe(hidden).shouldHave(attribute("style", "transform: rotate(-360deg); position: absolute; opacity: 0; left: 250px; top: 250px;"));
        homePage.getExplorePeru_btn_img().parent().parent().shouldBe(hidden).shouldHave(attribute("style", "transform: rotate(-360deg); position: absolute; opacity: 0; left: 250px; top: 250px;"));
        homePage.getOfficialWebsite_btn_img().parent().parent().shouldBe(hidden).shouldHave(attribute("style", "transform: rotate(-360deg); position: absolute; opacity: 0; left: 250px; top: 250px;"));
        homePage.getPresentation_btn_img().parent().parent().shouldBe(hidden).shouldHave(attribute("style", "transform: rotate(-360deg); position: absolute; opacity: 0; left: 250px; top: 250px;"));

    }


}
