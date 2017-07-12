package webpages.homepage;


import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class Tutorial {

    private SelenideElement tutoral = $x("//div[@role='tooltip']");

    private SelenideElement prev_btn = $x("//button[text()='« Prev']");
    private SelenideElement next_btn = $x("//button[text()='Next »']");
    private SelenideElement endTour_btn = $x("//button[text()='End tour']");

    private SelenideElement title1 = $("#step-0 > h3");  //WELCOME TO A SIMPLIFIED SELLING JOURNEY
    private SelenideElement title2 = $("#step-2 > h3");  //CONTINUAL DISCOVERY
    private SelenideElement title3 = $("#step-3 > h3");  //ACCOMODATIONS DIRECTORY
    private SelenideElement title4 = $("#step-4 > h3");  //SALES TOOLBOX
    private SelenideElement title5 = $("#step-5 > h3");  //SOCIAL MEDIA RECAP
    private SelenideElement title6 = $("#step-6 > h3");  //SHARING A DEVICE?


    //getters
    public SelenideElement getPrev_btn() {
        return prev_btn;
    }

    public SelenideElement getNext_btn() {
        return next_btn;
    }

    public SelenideElement getEndTour_btn() {
        return endTour_btn;
    }

    public SelenideElement getTitle1() {
        return title1;
    }

    public SelenideElement getTitle2() {
        return title2;
    }

    public SelenideElement getTitle3() {
        return title3;
    }

    public SelenideElement getTitle4() {
        return title4;
    }

    public SelenideElement getTitle5() {
        return title5;
    }

    public SelenideElement getTitle6() {
        return title6;
    }

    public SelenideElement getTutoral() {
        return tutoral;
    }
}
