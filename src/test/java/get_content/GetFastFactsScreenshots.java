package get_content;


import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import webpages.destination_discovery.fast_facts.FastFacts;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.screenshot;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static get_content.Configs.browserConfigs;
import static get_content.Configs.quiteDriver;


/**
 * Run this Class if you need to refresh the screenshots for FastFactsPage.
 */
public class GetFastFactsScreenshots {


    private static FastFacts fastFacts = new FastFacts();


    public static void main(String[] args) {

        browserConfigs();

        Configuration.reportsFolder = System.getProperty("user.dir") + "/src/test/resources/fast_facts_screenshots";

        getWebDriver().navigate().to(fastFacts.getUrl());

        System.out.println("start to 1");

        fastFacts.getTitleOfPage_txt().waitUntil(visible, 3000);
        Selenide.sleep(2000);
        screenshot("FastFacts");
        System.out.println("1 - FastFacts");

        System.out.println("end");

        quiteDriver();

    }

}
