package get_content;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import webpages.contact.Contact;

import java.io.File;
import java.io.IOException;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static get_content.Configs.browserConfigs;
import static get_content.Configs.quiteDriver;

/**
 * Run this Class to get the screenshots of the contact cards.
 */
public class GetContactScreenshots {

    private static Contact contact = new Contact();

    public static void main(String[] args) throws IOException {

        browserConfigs();

        String path = System.getProperty("user.dir") + "/src/test/resources/contact_screenshots/";
        Configuration.reportsFolder = path;

        getWebDriver().navigate().to(contact.getUrl());

        System.out.println("start to 3");

        contact.getIncomingTourismCoordinator_btn().click();
        Selenide.sleep(2000);
        contact.getContact().screenshot().renameTo(new File(path + "IncomingTourismCoordinator.png"));
        System.out.println("1");

        contact.getCanada_btn().click();
        Selenide.sleep(2000);
        contact.getContact().screenshot().renameTo(new File(path + "Canada.png"));
        System.out.println("2");

        contact.getUnitedStates_btn().click();
        Selenide.sleep(2000);
        contact.getContact().screenshot().renameTo(new File(path + "UnitedStates.png"));
        System.out.println("3");

        System.out.println("end");

        quiteDriver();

    }
}
