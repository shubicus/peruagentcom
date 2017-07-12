package webpages.header;


import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.$x;

public class GlobalButtons {

    private SelenideElement home_btn = $x("//a[text()=' HOME']");

    private SelenideElement discoverPeru_dropdown_btn = $x("//a[text()='Discover Peru ']");
    private ElementsCollection discoveryPeru_dropdown_items = $$("li.dropdown.open > ul > li > a");  //same

    private SelenideElement supplierShowcase_dropdown_btn = $x("//a[text()='Supplier Showcase ']");
    private ElementsCollection supplierShowcase_dropdown_items = $$("li.dropdown.open > ul > li > a");  //same

    private SelenideElement salesToolbox_dropdown_btn = $x("//a[text()='Sales Toolbox ']");
    private ElementsCollection salesToolbox_dropdown_items = $$("li.dropdown.open > ul > li > a");  //same

    private SelenideElement fastFacts_btn = $x("//a[text()='Fast Facts']");

    private SelenideElement Login_btn = $x("//button[text()='Log in']");


    //getters
    public SelenideElement getHome_btn() {
        return home_btn;
    }

    public SelenideElement getDiscoverPeru_dropdown_btn() {
        return discoverPeru_dropdown_btn;
    }

    public ElementsCollection getDiscoveryPeru_dropdown_items() {
        return discoveryPeru_dropdown_items;
    }

    public SelenideElement getSupplierShowcase_dropdown_btn() {
        return supplierShowcase_dropdown_btn;
    }

    public ElementsCollection getSupplierShowcase_dropdown_items() {
        return supplierShowcase_dropdown_items;
    }

    public SelenideElement getSalesToolbox_dropdown_btn() {
        return salesToolbox_dropdown_btn;
    }

    public ElementsCollection getSalesToolbox_dropdown_items() {
        return salesToolbox_dropdown_items;
    }

    public SelenideElement getFastFacts_btn() {
        return fastFacts_btn;
    }

    public SelenideElement getLogin_btn() {
        return Login_btn;
    }
}
