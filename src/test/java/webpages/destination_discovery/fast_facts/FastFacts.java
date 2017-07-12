package webpages.destination_discovery.fast_facts;


import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class FastFacts {

    private String url = "http://peruagent.com/?p=fastfacts";

    private SelenideElement titleOfPage_txt = $("h1");

    private SelenideElement titleMap_btn = $x("//div[text()='Map ▸']");
    private String enlargeMapImage_link = "http://peruagent.com/images/fastfacts/peru_regional%20_map_enlarge.png";
    private SelenideElement titleGetting_btn = $x("//div[text()='Getting There ▸']");
    private String enlargeGetting_link = "http://peruagent.com/images/fastfacts/getting_to_peru.jpg";
    private SelenideElement titlePeruDelivers_btn = $x("//div[text()='Peru Delivers ▸']");
    private String enlargePeruDelivers_link = "http://peruagent.com/images/fastfacts/10reasons.jpg";
    private SelenideElement titleFunFacts_btn = $x("//div[text()='Fun Facts ▸']");
    private String enlargeFunFacts_link = "http://peruagent.com/images/fastfacts/peru_fun_facts_final.jpg";
    private SelenideElement titleFestivals_btn = $x("//div[text()='Festivals & Events ▸']");
    private String enlargeFestivals_link = "http://www.peru.travel/what-to-do/festivities-and-events.aspx#page1";
    private SelenideElement titleContact_btn = $x("//div[text()='Contact us ▸']");
    private String enlargeContact_link = "http://peruagent.com/?p=contact";               //redirect !!!
    private SelenideElement titleNews_btn = $x("//div[text()='News ▸']");
    private String enlargeNews_link = "http://www.peru.travel/en-us/about-peru/news.aspx#page1";
    private SelenideElement titleFAQ_btn = $x("//div[text()='FAQ ▸']");
    private String enlargeFAQ_link = "http://peruagent.com/?p=faq";                       //redirect !!!
    private SelenideElement titleAwards_btn = $x("//div[text()='Awards ▸']");
    private String enlargeAwards_link = "http://peruagent.com/images/fastfacts/awards_peru.png";

    private SelenideElement fancybox = $(".fancybox-overlay.fancybox-overlay-fixed");
    private SelenideElement fancyboxClose = $(".fancybox-item.fancybox-close");

    private SelenideElement SrcAttribute = $x("/html/body/div[12]/div/div/div[1]/div/*");  //to get src attribute from WebElement


    //getters
    public SelenideElement getTitleOfPage_txt() {
        return titleOfPage_txt;
    }

    public SelenideElement getTitleMap_btn() {
        return titleMap_btn;
    }

    public SelenideElement getTitleGetting_btn() {
        return titleGetting_btn;
    }

    public SelenideElement getTitlePeruDelivers_btn() {
        return titlePeruDelivers_btn;
    }

    public SelenideElement getTitleFunFacts_btn() {
        return titleFunFacts_btn;
    }

    public SelenideElement getTitleFestivals_btn() {
        return titleFestivals_btn;
    }

    public SelenideElement getTitleContact_btn() {
        return titleContact_btn;
    }

    public SelenideElement getTitleNews_btn() {
        return titleNews_btn;
    }

    public SelenideElement getTitleFAQ_btn() {
        return titleFAQ_btn;
    }

    public SelenideElement getTitleAwards_btn() {
        return titleAwards_btn;
    }

    public SelenideElement getFancybox() {
        return fancybox;
    }

    public SelenideElement getFancyboxClose() {
        return fancyboxClose;
    }

    public String getEnlargeMapImage_link() {
        return enlargeMapImage_link;
    }

    public String getEnlargeGetting_link() {
        return enlargeGetting_link;
    }

    public String getEnlargePeruDelivers_link() {
        return enlargePeruDelivers_link;
    }

    public String getEnlargeFunFacts_link() {
        return enlargeFunFacts_link;
    }

    public String getEnlargeFestivals_link() {
        return enlargeFestivals_link;
    }

    public String getEnlargeContact_link() {
        return enlargeContact_link;
    }

    public String getEnlargeNews_link() {
        return enlargeNews_link;
    }

    public String getEnlargeFAQ_link() {
        return enlargeFAQ_link;
    }

    public String getEnlargeAwards_link() {
        return enlargeAwards_link;
    }

    public SelenideElement getSrcAttribute() {
        return SrcAttribute;
    }

    public String getUrl() {
        return url;
    }
}
