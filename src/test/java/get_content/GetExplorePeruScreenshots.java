package get_content;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import webpages.sales_toolbox.explore_peru.ExplorePeru;

import static com.codeborne.selenide.Selenide.screenshot;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static get_content.Configs.browserConfigs;
import static get_content.Configs.quiteDriver;

/**
 * Run this Class if you need to refresh the screenshots for ExplorePeruPage.
 */
public class GetExplorePeruScreenshots {

    private static ExplorePeru explorePeru = new ExplorePeru();


    public static void main(String[] args) {

        browserConfigs();

        Configuration.reportsFolder = System.getProperty("user.dir") + "/src/test/resources/explore_peru_screenshots";

        getWebDriver().navigate().to(explorePeru.getUrl());

        System.out.println("start to 1");

        Selenide.sleep(2000);
        screenshot("Map");
        System.out.println("1 - Map");

        System.out.println("end");

        quiteDriver();

    }

}
