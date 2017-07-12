package get_content;


import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import webpages.destination_discovery.discover_peru.DiscoverPeru;

import static com.codeborne.selenide.Selenide.screenshot;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static get_content.Configs.browserConfigs;
import static get_content.Configs.quiteDriver;

/**
 * Run this Class if you need to refresh the screenshots for DiscoverPeruPage.
 */
public class GetDiscoverPeruScreenshots {

    private static DiscoverPeru discoverPeru = new DiscoverPeru();


    public static void main(String[] args) {

        browserConfigs();

        Configuration.reportsFolder = System.getProperty("user.dir") + "/src/test/resources/discover_peru_screenshots";

        getWebDriver().navigate().to(discoverPeru.getUrl());

        System.out.println("start to 8");

        discoverPeru.getMachuPicchu_link().click();
        Selenide.sleep(2000);
        screenshot("MachuPicchu");
        System.out.println("1 - MachuPicchu");

        discoverPeru.getIncaTrail_link().click();
        Selenide.sleep(2000);
        screenshot("IncaTrail");
        System.out.println("2 - IncaTrail");

        discoverPeru.getLakeTiticaca_link().click();
        Selenide.sleep(2000);
        screenshot("LakeTiticaca");
        System.out.println("3 - LakeTiticaca");

        discoverPeru.getPerusAmazon_link().click();
        Selenide.sleep(2000);
        screenshot("PerusAmazon");
        System.out.println("4 - PerusAmazon");

        discoverPeru.getColcaCanyon_link().click();
        Selenide.sleep(2000);
        screenshot("ColcaCanyon");
        System.out.println("5 - ColcaCanyon");

        discoverPeru.getNazcaLines_link().click();
        Selenide.sleep(2000);
        screenshot("NazcaLines");
        System.out.println("6 - NazcaLines");

        discoverPeru.getLima_link().click();
        Selenide.sleep(2000);
        screenshot("Lima");
        System.out.println("7 - Lima");

        discoverPeru.getCusco_link().click();
        Selenide.sleep(2000);
        screenshot("Cusco");
        System.out.println("8 - Cusco");

        System.out.println("end");

        quiteDriver();

    }


}
