package get_content;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import webpages.destination_discovery.peru_essentials.PeruEssentials;

import static com.codeborne.selenide.Selenide.screenshot;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static get_content.Configs.browserConfigs;
import static get_content.Configs.quiteDriver;

/**
 * Run this Class if you need to refresh the screenshots for PeruEssentialsPage.
 */
public class GetPeruEssentialsPageScreenshots {

    private static PeruEssentials peruEssentials = new PeruEssentials();
    private static String url = "http://peruagent.com/?chapterID=70";

    public static void main(String[] args) {

        browserConfigs();

        Configuration.reportsFolder = System.getProperty("user.dir") + "/src/test/resources/peru_essentials_screenshots";

        getWebDriver().navigate().to(url);

        System.out.println("start to 6");

        peruEssentials.getGettingThere_link().click();
        Selenide.sleep(2000);
        screenshot("GettingThere");
        System.out.println("1 - GettingThere");

        peruEssentials.getGettingAround_link().click();
        Selenide.sleep(2000);
        screenshot("GettingAround");
        System.out.println("2 - GettingAround");

        peruEssentials.getAccommodations_link().click();
        Selenide.sleep(2000);
        screenshot("Accommodations");
        System.out.println("3 - Accommodations");

        peruEssentials.getShopping_link().click();
        Selenide.sleep(2000);
        screenshot("Shopping");
        System.out.println("4 - Shopping");

        peruEssentials.getDiningNightlife_link().click();
        Selenide.sleep(2000);
        screenshot("DiningNightlife");
        System.out.println("5 - DiningNightlife");

        peruEssentials.getFestivals_link().click();
        Selenide.sleep(2000);
        screenshot("Festivals");
        System.out.println("6 - Festivals");

        System.out.println("end");

        quiteDriver();

    }
}
