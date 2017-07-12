package webpages.sales_toolbox.videos;


import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class Videos {

    private String url = "http://peruagent.com/?p=salestoolboxwatch";
    private ElementsCollection dots = $$("#slider > ul li");
    private ElementsCollection images = $$("#slider > div > div .slick-slide[aria-describedby]");

    private SelenideElement fancybox = $("body > div.fancybox-overlay.fancybox-overlay-fixed");
    private SelenideElement fancyboxClose_btn = $("body > div.fancybox-overlay.fancybox-overlay-fixed > div > div > a");
    private SelenideElement download = $("a[href][download]");


    //getters
    public String getUrl() {
        return url;
    }

    public ElementsCollection getDots() {
        return dots;
    }

    public SelenideElement getDownload() {
        return download;
    }

    public ElementsCollection getImages() {
        return images;
    }

    public SelenideElement getFancybox() {
        return fancybox;
    }

    public SelenideElement getFancyboxClose_btn() {
        return fancyboxClose_btn;
    }
}
