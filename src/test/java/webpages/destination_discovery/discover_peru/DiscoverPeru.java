package webpages.destination_discovery.discover_peru;


import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class DiscoverPeru {

    private String url = "http://peruagent.com/?chapterID=69";

    private SelenideElement title = $(".title-chapter");

    private SelenideElement machuPicchu_link = $x("//a[text()='Machu Picchu ']");
    private SelenideElement incaTrail_link = $x("//a[text()='The Inca Trail to Machu Picchu']");
    private SelenideElement lakeTiticaca_link = $x("//a[text()='Lake Titicaca ']");
    private SelenideElement perusAmazon_link = $x("//nav[2]/div[1]//li[4]/a");
    private SelenideElement colcaCanyon_link = $x("//a[text()='The Colca Canyon ']");
    private SelenideElement nazcaLines_link = $x("//a[text()='The Nazca Lines']");
    private SelenideElement lima_link = $x("//a[text()='Lima - Cosmopolitan Adventures']");
    private SelenideElement cusco_link = $x("//a[text()='Cusco Up Close ']");


    //getters
    public SelenideElement getTitle() {
        return title;
    }

    public SelenideElement getMachuPicchu_link() {
        return machuPicchu_link;
    }

    public SelenideElement getIncaTrail_link() {
        return incaTrail_link;
    }

    public SelenideElement getLakeTiticaca_link() {
        return lakeTiticaca_link;
    }

    public SelenideElement getPerusAmazon_link() {
        return perusAmazon_link;
    }

    public SelenideElement getColcaCanyon_link() {
        return colcaCanyon_link;
    }

    public SelenideElement getNazcaLines_link() {
        return nazcaLines_link;
    }

    public SelenideElement getLima_link() {
        return lima_link;
    }

    public SelenideElement getCusco_link() {
        return cusco_link;
    }

    public String getUrl() {
        return url;
    }
}
