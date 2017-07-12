package get_content;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import webpages.homepage.HomePage;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import static com.codeborne.selenide.Selenide.$;
import static get_content.Configs.browserConfigs;
import static get_content.Configs.quiteDriver;

/**
 * Run this Class if you need to refresh the images for HomePage.
 */
public class GetHomePageImages {

    private static HomePage homePage = new HomePage();
    private static String path = "src/test/resources/homepage_images/";
    private static String attribute = "style";
    private static String extension = ".png";
    private static String formatName = "png";
    private static String attributeSrc = "src";
    private static long time = 3000;

    private static SelenideElement introduction_transform = $("#des > li:nth-child(1)");
    private static SelenideElement tourOperators_transform = $("#supplier > li:nth-child(1)");
    private static SelenideElement brochures_transform = $("#sales > li:nth-child(1)");

    public static void takeLogoImage() throws IOException {

        ImageIO.write(ImageIO.read(new URL(homePage.getLogo_img().getAttribute(attributeSrc))), formatName, new File(path + "Logo_img" + extension));
    }

    public static void takeAllFourMainButtons() throws IOException {

        ImageIO.write(ImageIO.read(new URL(homePage.getLogin_btn_img().getAttribute(attributeSrc))), formatName, new File(path + "Login_btn_img" + extension));
        ImageIO.write(ImageIO.read(new URL(homePage.getDestinationDiscovery_btn_img().getAttribute(attributeSrc))), formatName, new File(path + "DestinationDiscovery_btn_img" + extension));
        ImageIO.write(ImageIO.read(new URL(homePage.getSupplierDirectory_btn_img().getAttribute(attributeSrc))), formatName, new File(path + "SupplierDirectory_btn_img" + extension));
        ImageIO.write(ImageIO.read(new URL(homePage.getSalesToolbox_btn_img().getAttribute(attributeSrc))), formatName, new File(path + "SalesToolbox_btn_img" + extension));
    }

    public static void takeDestinationDiscoveryButtonImages() throws IOException {

        homePage.getDestinationDiscovery_btn_img().click();  //click to see 6 image buttons

        introduction_transform.waitUntil(Condition.attribute(attribute, "transform: rotate(360deg); position: absolute; opacity: 1; left: 233px; top: -42px;"), time);  //wait open

        ImageIO.write(ImageIO.read(new URL(homePage.getIntroduction_btn_img().getAttribute(attributeSrc))), formatName, new File(path + "Introduction_btn_img" + extension));

        ImageIO.write(ImageIO.read(new URL(homePage.getPeruEssentials_btn_img().getAttribute(attributeSrc))), formatName, new File(path + "PeruEssentials_btn_img" + extension));

        ImageIO.write(ImageIO.read(new URL(homePage.getDiscoverPeru_btn_img().getAttribute(attributeSrc))), formatName, new File(path + "DiscoverPeru_btn_img" + extension));

        ImageIO.write(ImageIO.read(new URL(homePage.getActivePeru_btn_img().getAttribute(attributeSrc))), formatName, new File(path + "ActivePeru_btn_img" + extension));

        ImageIO.write(ImageIO.read(new URL(homePage.getPeruTargetMarkets_btn_img().getAttribute(attributeSrc))), formatName, new File(path + "PeruTargetMarkets_btn_img" + extension));

        ImageIO.write(ImageIO.read(new URL(homePage.getFastFacts_btn_img().getAttribute(attributeSrc))), formatName, new File(path + "FastFacts_btn_img" + extension));

        homePage.getDestinationDiscovery_btn_img().click();  //click again to close
    }

    public static void takeSupplierDirectoryButtonImages() throws IOException {

        homePage.getSupplierDirectory_btn_img().click();  //click to see 3 image buttons

        tourOperators_transform.waitUntil(Condition.attribute(attribute, "transform: rotate(360deg); position: absolute; opacity: 1; left: 233px; top: -42px;"), time);  //wait open

        ImageIO.write(ImageIO.read(new URL(homePage.getTourOperators_btn_img().getAttribute(attributeSrc))), formatName, new File(path + "TourOperators_btn_img" + extension));

        ImageIO.write(ImageIO.read(new URL(homePage.getHotelsAccommodation_btn_img().getAttribute(attributeSrc))), formatName, new File(path + "HotelsAccommodation_btn_img" + extension));

        ImageIO.write(ImageIO.read(new URL(homePage.getCruisesRiverCruises_btn_img().getAttribute(attributeSrc))), formatName, new File(path + "CruisesRiverCruises_btn_img" + extension));

        homePage.getSupplierDirectory_btn_img().click();  //click again to close
    }

    public static void takeSalesToolboxButtonImages() throws IOException {

        homePage.getSalesToolbox_btn_img().click();  //click to see 5 image buttons

        brochures_transform.waitUntil(Condition.attribute(attribute, "transform: rotate(360deg); position: absolute; opacity: 1; left: 233px; top: -42px;"), time);  //wait open

        ImageIO.write(ImageIO.read(new URL(homePage.getBrochures_btn_img().getAttribute(attributeSrc))), formatName, new File(path + "Brochures_btn_img" + extension));

        ImageIO.write(ImageIO.read(new URL(homePage.getVideos_btn_img().getAttribute(attributeSrc))), formatName, new File(path + "Videos_btn_img" + extension));

        ImageIO.write(ImageIO.read(new URL(homePage.getExplorePeru_btn_img().getAttribute(attributeSrc))), formatName, new File(path + "ExplorePeru_btn_img" + extension));

        ImageIO.write(ImageIO.read(new URL(homePage.getOfficialWebsite_btn_img().getAttribute(attributeSrc))), formatName, new File(path + "OfficialWebsite_btn_img" + extension));

        ImageIO.write(ImageIO.read(new URL(homePage.getPresentation_btn_img().getAttribute(attributeSrc))), formatName, new File(path + "Presentation_btn_img" + extension));

        homePage.getSalesToolbox_btn_img().click();  //click again to close
    }


    public static void main(String[] args) throws IOException {

        browserConfigs();  //open Browser

        //take Screenshots
        System.out.println("start to 5");
        System.out.println("1 - takeLogoImage()");
        takeLogoImage();
        System.out.println("2 - takeAllFourMainButtons()");
        takeAllFourMainButtons();
        System.out.println("3 - takeDestinationDiscoveryButtonImages()");
        takeDestinationDiscoveryButtonImages();
        System.out.println("4 - takeSupplierDirectoryButtonImages()");
        takeSupplierDirectoryButtonImages();
        System.out.println("5 - takeSalesToolboxButtonImages()");
        takeSalesToolboxButtonImages();

        System.out.println("end");
        quiteDriver();  //close Browser
    }

}