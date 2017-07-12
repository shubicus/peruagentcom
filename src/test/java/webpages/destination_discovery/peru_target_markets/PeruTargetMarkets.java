package webpages.destination_discovery.peru_target_markets;


import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class PeruTargetMarkets {

    private String  url = "http://peruagent.com/?chapterID=72";

    private SelenideElement title = $(".title-chapter");

    private SelenideElement culinaryTravel = $x("//a[text()='Culinary Travel ']");
    private SelenideElement inHarmony = $x("//a[text()='In Harmony with Nature']");
    private SelenideElement familyTravel = $x("//a[text()='Family Travel ']");
    private SelenideElement romanceTravel = $x("//a[text()='Romance Travel']");
    private SelenideElement meetings = $x("//a[text()='Meetings and Incentives']");


    //getters
    public SelenideElement getTitle() {
        return title;
    }

    public SelenideElement getCulinaryTravel() {
        return culinaryTravel;
    }

    public SelenideElement getInHarmony() {
        return inHarmony;
    }

    public SelenideElement getFamilyTravel() {
        return familyTravel;
    }

    public SelenideElement getRomanceTravel() {
        return romanceTravel;
    }

    public SelenideElement getMeetings() {
        return meetings;
    }

    public String getUrl() {
        return url;
    }
}
