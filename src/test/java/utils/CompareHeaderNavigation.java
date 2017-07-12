package utils;


import webpages.header.GlobalButtons;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.switchTo;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class CompareHeaderNavigation {

    private static GlobalButtons globalButtons = new GlobalButtons();

    public static String compareSalesToolboxLinks(String linkText) {
        globalButtons.getSalesToolbox_dropdown_btn().click();
        globalButtons.getSalesToolbox_dropdown_items().shouldHaveSize(5);
        globalButtons.getSalesToolbox_dropdown_items().findBy(text(linkText)).click();
        return getWebDriver().getCurrentUrl();
    }

    public static String compareSupplierShowcaseLinks(String linkText) {
        globalButtons.getSupplierShowcase_dropdown_btn().click();
        globalButtons.getSupplierShowcase_dropdown_items().shouldHaveSize(3);
        globalButtons.getSupplierShowcase_dropdown_items().findBy(text(linkText)).click();
        switchTo().window(1);
        String url = getWebDriver().getCurrentUrl();
        switchTo().window(1).close();
        switchTo().window(0);
        return url;
    }

    public static String compareDiscoverLinks(String linkText) {
        globalButtons.getDiscoverPeru_dropdown_btn().click();
        globalButtons.getDiscoveryPeru_dropdown_items().shouldHaveSize(5);
        globalButtons.getDiscoveryPeru_dropdown_items().findBy(text(linkText)).click();
        return getWebDriver().getCurrentUrl();
    }

}
