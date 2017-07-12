package webpages.sales_toolbox.presentation;


import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class Presentation {

    private String url = "http://peruagent.com/?p=toolboxpresentation";

    private SelenideElement fancybox = $("body > div.fancybox-overlay.fancybox-overlay-fixed");
    private SelenideElement fancyboxClose_btn = $("body > div.fancybox-overlay.fancybox-overlay-fixed > div > div > a");
    private SelenideElement download = $("a[href][download]");


    //getters
    public String getUrl() {
        return url;
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
