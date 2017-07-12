package webpages.destination_discovery.introduction;


import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class Introduction {

    private String url = "http://peruagent.com/?chapterID=68";

    private SelenideElement title = $(".title-chapter");

    private SelenideElement welcomeToPeru_link = $x(".//a[text()='Welcome to Peru']");
    private SelenideElement sellingPeru1_link = $("div.container.menu-offset > ul > li:nth-child(2) > a");  //need change the names
    private SelenideElement sellingPeru2_link = $("div.container.menu-offset > ul > li:nth-child(3) > a");
    private SelenideElement peruOfToday_link = $x(".//a[text()='Peru of Today']");

    private SelenideElement welcomeToPeru_txt = $x(".//h1[text()='Welcome to Peru']");
    private SelenideElement sellingPeru1_txt = $("#\\33 > div.jumbotron > div > h1");
    private SelenideElement sellingPeru2_txt = $("#\\34 > div.jumbotron > div > h1");
    private SelenideElement peruOfToday_txt = $x(".//h1[text()='Peru of Today']");

    //getters
    public SelenideElement getTitle() {
        return title;
    }

    public SelenideElement getWelcomeToPeru_link() {
        return welcomeToPeru_link;
    }

    public SelenideElement getSellingPeru1_link() {
        return sellingPeru1_link;
    }

    public SelenideElement getSellingPeru2_link() {
        return sellingPeru2_link;
    }

    public SelenideElement getPeruOfToday_link() {
        return peruOfToday_link;
    }

    public SelenideElement getWelcomeToPeru_txt() {
        return welcomeToPeru_txt;
    }

    public SelenideElement getSellingPeru1_txt() {
        return sellingPeru1_txt;
    }

    public SelenideElement getSellingPeru2_txt() {
        return sellingPeru2_txt;
    }

    public SelenideElement getPeruOfToday_txt() {
        return peruOfToday_txt;
    }

    public String getUrl() {
        return url;
    }
}
