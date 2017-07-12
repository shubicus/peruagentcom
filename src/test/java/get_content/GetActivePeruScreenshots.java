package get_content;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import webpages.destination_discovery.active_peru.ActivePeru;

import static com.codeborne.selenide.Selenide.screenshot;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static get_content.Configs.browserConfigs;
import static get_content.Configs.quiteDriver;

/**
 * Run this Class if you need to refresh the screenshots for ActivePeruPage.
 */
public class GetActivePeruScreenshots {


    private static ActivePeru activePeru = new ActivePeru();
    private static String url = "http://peruagent.com/?chapterID=71";


    public static void main(String[] args) {

        browserConfigs();

        Configuration.reportsFolder = System.getProperty("user.dir") + "/src/test/resources/active_peru_screenshots";

        getWebDriver().navigate().to(url);

        System.out.println("start to 5");

        activePeru.getHikingTrekking().click();
        Selenide.sleep(2000);
        screenshot("HikingTrekking");
        System.out.println("1 - HikingTrekking");

        activePeru.getEcotourism().click();
        Selenide.sleep(2000);
        screenshot("Ecotourism");
        System.out.println("2 - Ecotourism");

        activePeru.getSoftAdventure().click();
        Selenide.sleep(2000);
        screenshot("SoftAdventure");
        System.out.println("3 - SoftAdventure");

        activePeru.getWatersports().click();
        Selenide.sleep(2000);
        screenshot("Watersports");
        System.out.println("4 - Watersports");

        activePeru.getTouringAncient().click();
        Selenide.sleep(2000);
        screenshot("TouringAncient");
        System.out.println("5 - TouringAncient");

        System.out.println("end");

        quiteDriver();

    }


}
