package webpages.destination_discovery.peru_essentials;


import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class PeruEssentials {

    private String url = "http://peruagent.com/?chapterID=70";

    private SelenideElement title = $(".title-chapter");

    private SelenideElement gettingThere_link = $x("//a[text()='Getting There ']");
    private SelenideElement gettingAround_link = $x("//a[text()='Getting Around']");
    private SelenideElement accommodations_link = $x("//a[text()='Accommodations ']");
    private SelenideElement shopping_link = $x("//a[text()='Shopping ']");
    private SelenideElement diningNightlife_link = $x("//a[text()='Dining & Nightlife ']");
    private SelenideElement festivals_link = $x("//a[text()='Festivals ']");


    //getters
    public SelenideElement getGettingThere_link() {
        return gettingThere_link;
    }

    public SelenideElement getGettingAround_link() {
        return gettingAround_link;
    }

    public SelenideElement getAccommodations_link() {
        return accommodations_link;
    }

    public SelenideElement getShopping_link() {
        return shopping_link;
    }

    public SelenideElement getDiningNightlife_link() {
        return diningNightlife_link;
    }

    public SelenideElement getFestivals_link() {
        return festivals_link;
    }

    public SelenideElement getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }
}
