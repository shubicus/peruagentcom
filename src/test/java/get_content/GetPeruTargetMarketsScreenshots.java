package get_content;


import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import webpages.destination_discovery.peru_target_markets.PeruTargetMarkets;

import static com.codeborne.selenide.Selenide.screenshot;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static get_content.Configs.browserConfigs;
import static get_content.Configs.quiteDriver;


/**
 * Run this Class if you need to refresh the screenshots for PeruTargetMarketsPage.
 */
public class GetPeruTargetMarketsScreenshots {

    private static PeruTargetMarkets peruTargetMarkets = new PeruTargetMarkets();
    private static String url = "http://peruagent.com/?chapterID=72";


    public static void main(String[] args) {

        browserConfigs();

        Configuration.reportsFolder = System.getProperty("user.dir") + "/src/test/resources/peru_target_markets_screenshots";

        getWebDriver().navigate().to(url);

        System.out.println("start to 5");

        peruTargetMarkets.getCulinaryTravel().click();
        Selenide.sleep(2000);
        screenshot("CulinaryTravel");
        System.out.println("1 - CulinaryTravel");

        peruTargetMarkets.getInHarmony().click();
        Selenide.sleep(2000);
        screenshot("InHarmony");
        System.out.println("2 - InHarmony");

        peruTargetMarkets.getFamilyTravel().click();
        Selenide.sleep(2000);
        screenshot("FamilyTravel");
        System.out.println("3 - FamilyTravel");

        peruTargetMarkets.getRomanceTravel().click();
        Selenide.sleep(2000);
        screenshot("RomanceTravel");
        System.out.println("4 - RomanceTravel");

        peruTargetMarkets.getMeetings().click();
        Selenide.sleep(2000);
        screenshot("Meetings");
        System.out.println("5 - Meetings");

        System.out.println("end");

        quiteDriver();

    }


}
