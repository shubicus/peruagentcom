package get_content;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import webpages.destination_discovery.introduction.Introduction;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static get_content.Configs.browserConfigs;
import static get_content.Configs.quiteDriver;
import static com.codeborne.selenide.Selenide.*;

/**
 * Run this Class if you need to refresh the screenshots for IntroductionPage.
 */
public class GetIntroductionPageScreenshots {


    private static Introduction introduction = new Introduction();
    private static String url = "http://peruagent.com/?chapterID=68";


    public static void main(String[] args) {

        browserConfigs();

        Configuration.reportsFolder = System.getProperty("user.dir") + "/src/test/resources/introduction_screenshots";

        getWebDriver().navigate().to(url);

        System.out.println("start to 4");

        introduction.getWelcomeToPeru_link().click();
        Selenide.sleep(2000);
        screenshot("WelcomeToPeru");
        System.out.println("1 - WelcomeToPeru");

        introduction.getSellingPeru1_link().click();
        Selenide.sleep(2000);
        screenshot("SellingPeru1");
        System.out.println("2 - SellingPeru1");

        introduction.getSellingPeru2_link().click();
        Selenide.sleep(2000);
        screenshot("SellingPeru2");
        System.out.println("3 - SellingPeru2");

        introduction.getPeruOfToday_link().click();
        Selenide.sleep(2000);
        screenshot("PeruOfToday");
        System.out.println("4 - PeruOfToday");

        System.out.println("end");

        quiteDriver();
    }

}



