package webpages.sales_toolbox.brochures;


import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class Brochures {

    private String url = "http://peruagent.com/?p=salestoolboxbrochures";

    private SelenideElement left_btn = $(".slick-prev");
    private SelenideElement right_btn = $(".slick-next");

    private SelenideElement dot1_btn = $("#slick-slide00 > button");
    private SelenideElement brochure1_image = $("#slider > div > div > div:nth-child(5) > a > img");
    private SelenideElement dot2_btn = $("#slick-slide01 > button");
    private SelenideElement brochure2_image = $("#slider > div > div > div:nth-child(6) > a > img");
    private SelenideElement dot3_btn = $("#slick-slide02 > button");
    private SelenideElement brochure3_image = $("#slider > div > div > div:nth-child(7) > a > img");
    private SelenideElement dot4_btn = $("#slick-slide03 > button");
    private SelenideElement brochure4_image = $("#slider > div > div > div:nth-child(8) > a > img");
    private SelenideElement dot5_btn = $("#slick-slide04 > button");
    private SelenideElement brochure5_image = $("#slider > div > div > div:nth-child(9) > a > img");
    private SelenideElement dot6_btn = $("#slick-slide05 > button");
    private SelenideElement brochure6_image = $("#slider > div > div > div:nth-child(10) > a > img");
    private SelenideElement dot7_btn = $("#slick-slide06 > button");
    private SelenideElement brochure7_image = $("#slider > div > div > div:nth-child(11) > a > img");

    private SelenideElement fancybox = $("body > div.fancybox-overlay.fancybox-overlay-fixed");
    private SelenideElement fancyboxClose_btn = $("body > div.fancybox-overlay.fancybox-overlay-fixed > div > div > a");
    private SelenideElement download = $("a[href][download]");

    //getters
    public String getUrl() {
        return url;
    }

    public SelenideElement getLeft_btn() {
        return left_btn;
    }

    public SelenideElement getRight_btn() {
        return right_btn;
    }

    public SelenideElement getDot1_btn() {
        return dot1_btn;
    }

    public SelenideElement getBrochure1_image() {
        return brochure1_image;
    }

    public SelenideElement getDot2_btn() {
        return dot2_btn;
    }

    public SelenideElement getBrochure2_image() {
        return brochure2_image;
    }

    public SelenideElement getDot3_btn() {
        return dot3_btn;
    }

    public SelenideElement getBrochure3_image() {
        return brochure3_image;
    }

    public SelenideElement getDot4_btn() {
        return dot4_btn;
    }

    public SelenideElement getBrochure4_image() {
        return brochure4_image;
    }

    public SelenideElement getDot5_btn() {
        return dot5_btn;
    }

    public SelenideElement getBrochure5_image() {
        return brochure5_image;
    }

    public SelenideElement getDot6_btn() {
        return dot6_btn;
    }

    public SelenideElement getBrochure6_image() {
        return brochure6_image;
    }

    public SelenideElement getDot7_btn() {
        return dot7_btn;
    }

    public SelenideElement getBrochure7_image() {
        return brochure7_image;
    }

    public SelenideElement getFancybox() {
        return fancybox;
    }

    public SelenideElement getFancyboxClose_btn() {
        return fancyboxClose_btn;
    }

    public SelenideElement getDownload() {
        return download;
    }
}
