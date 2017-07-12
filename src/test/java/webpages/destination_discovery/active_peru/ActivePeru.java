package webpages.destination_discovery.active_peru;


import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class ActivePeru {

    private String url = "http://peruagent.com/?chapterID=71";

    private SelenideElement title = $(".title-chapter");

    private SelenideElement hikingTrekking = $x("//a[text()='Hiking & Trekking ']");
    private SelenideElement ecotourism = $x("//a[text()='Ecotourism and  Birdwatching ']");
    private SelenideElement softAdventure = $x("//a[text()='Soft Adventure ']");
    private SelenideElement watersports = $x("//a[text()='Watersports ']");
    private SelenideElement touringAncient = $x("//a[text()='Touring Ancient Sites ']");


    //getters
    public SelenideElement getTitle() {
        return title;
    }

    public SelenideElement getHikingTrekking() {
        return hikingTrekking;
    }

    public SelenideElement getEcotourism() {
        return ecotourism;
    }

    public SelenideElement getSoftAdventure() {
        return softAdventure;
    }

    public SelenideElement getWatersports() {
        return watersports;
    }

    public SelenideElement getTouringAncient() {
        return touringAncient;
    }

    public String getUrl() {
        return url;
    }
}
