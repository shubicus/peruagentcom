package get_content;


import com.codeborne.selenide.Configuration;
import webpages.sales_toolbox.presentation.Presentation;

import java.io.FileNotFoundException;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static get_content.Configs.browserConfigs;
import static get_content.Configs.quiteDriver;

/**
 * Run this Class if you need to refresh the Presentation.pdf file for PresentationPage.
 */
public class GetPresentationPDF {

    private static Presentation presentation = new Presentation();


    public static void main(String[] args) throws FileNotFoundException {

        browserConfigs();

        Configuration.reportsFolder = System.getProperty("user.dir") + "/src/test/resources/pdf";

        getWebDriver().navigate().to(presentation.getUrl());

        System.out.println("start to 1");

        System.out.println(presentation.getDownload().download().getPath());
        presentation.getFancyboxClose_btn().click();
        System.out.println("1");

        System.out.println("end");

        quiteDriver();

    }

}
