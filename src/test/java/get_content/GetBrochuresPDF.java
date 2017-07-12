package get_content;


import com.codeborne.selenide.Configuration;
import webpages.sales_toolbox.brochures.Brochures;

import java.io.FileNotFoundException;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static get_content.Configs.browserConfigs;
import static get_content.Configs.quiteDriver;

/**
 * Run this Class if you need to refresh the PDF files for BrochuresPage.
 */
public class GetBrochuresPDF {


    private static Brochures brochures = new Brochures();


    public static void main(String[] args) throws FileNotFoundException {

        browserConfigs();

        Configuration.reportsFolder = System.getProperty("user.dir") + "/src/test/resources/pdf";

        getWebDriver().navigate().to(brochures.getUrl());

        System.out.println("start to 7");

        brochures.getDot1_btn().click();
        brochures.getBrochure1_image().click();
        System.out.println(brochures.getDownload().download().getPath());
        brochures.getFancyboxClose_btn().click();
        System.out.println("1");

        brochures.getDot2_btn().click();
        brochures.getBrochure2_image().click();
        System.out.println(brochures.getDownload().download().getPath());
        brochures.getFancyboxClose_btn().click();
        System.out.println("2");

        brochures.getDot3_btn().click();
        brochures.getBrochure3_image().click();
        System.out.println(brochures.getDownload().download().getPath());
        brochures.getFancyboxClose_btn().click();
        System.out.println("3");

        brochures.getDot4_btn().click();
        brochures.getBrochure4_image().click();
        System.out.println(brochures.getDownload().download().getPath());
        brochures.getFancyboxClose_btn().click();
        System.out.println("4");

        brochures.getDot5_btn().click();
        brochures.getBrochure5_image().click();
        System.out.println(brochures.getDownload().download().getPath());
        brochures.getFancyboxClose_btn().click();
        System.out.println("5");

        brochures.getDot6_btn().click();
        brochures.getBrochure6_image().click();
        System.out.println(brochures.getDownload().download());
        brochures.getFancyboxClose_btn().click();
        System.out.println("6");

        brochures.getDot7_btn().click();
        brochures.getBrochure7_image().click();
        System.out.println(brochures.getDownload().download().getPath());
        brochures.getFancyboxClose_btn().click();
        System.out.println("7");

        System.out.println("end");

        quiteDriver();

    }

}
