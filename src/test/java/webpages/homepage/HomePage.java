package webpages.homepage;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    private String url = "http://peruagent.com/?p=home";

    private String title = "Prom Peru Agent Sales Companion";

    private SelenideElement twitter_link = $("#social > a:nth-child(2)");
    private SelenideElement facebook_link = $("#social > a:nth-child(3)");
    private SelenideElement flikr_link = $("#social > a:nth-child(4)");
    private SelenideElement youtube_link = $("#social > a:nth-child(5)");
    private SelenideElement instagram_link = $("#social > a:nth-child(6)");

    private SelenideElement logo_img = $("body > div.logo > img");

    private SelenideElement login_btn_img = $("#loginOpen");  //circle

    private SelenideElement destinationDiscovery_btn_img = $("#des-btn > img");  //circle
    private SelenideElement introduction_btn_img = $("#des > li:nth-child(1) > a > img");
    private SelenideElement peruEssentials_btn_img = $("#des > li:nth-child(2) > a > img");
    private SelenideElement discoverPeru_btn_img = $("#des > li:nth-child(3) > a > img");
    private SelenideElement activePeru_btn_img = $("#des > li:nth-child(4) > a > img");
    private SelenideElement peruTargetMarkets_btn_img = $("#des > li:nth-child(5) > a > img");
    private SelenideElement fastFacts_btn_img = $("#fastFact > a > img");


    private SelenideElement supplierDirectory_btn_img = $("#supplier-btn > img");  //circle
    private SelenideElement tourOperators_btn_img = $("#supplier > li:nth-child(1) > a > img");
    private SelenideElement hotelsAccommodation_btn_img = $("#supplier > li:nth-child(2) > a > img");
    private SelenideElement cruisesRiverCruises_btn_img = $("#supplier > li:nth-child(3) > a > img");


    private SelenideElement salesToolbox_btn_img = $("#sales-btn > img");  //circle
    private SelenideElement brochures_btn_img = $("#sales > li:nth-child(1) > a > img");
    private SelenideElement videos_btn_img = $("#sales > li:nth-child(2) > a > img");
    private SelenideElement explorePeru_btn_img = $("#sales > li:nth-child(3) > a > img");
    private SelenideElement officialWebsite_btn_img = $("#sales > li:nth-child(4) > a > img");
    private SelenideElement Presentation_btn_img = $("#sales > li:nth-child(5) > a > img");

    private SelenideElement appStore_link_btn = $("#appStore > a:nth-child(2)");
    private SelenideElement googlePlay_link_btn = $("#appStore > a:nth-child(3)");

    private SelenideElement support_btn = $("#launcher");  // it is iframe !!!


    //getters
    public SelenideElement getLogo_img() {
        return logo_img;
    }

    public SelenideElement getLogin_btn_img() {
        return login_btn_img;
    }

    public SelenideElement getDestinationDiscovery_btn_img() {
        return destinationDiscovery_btn_img;
    }

    public SelenideElement getIntroduction_btn_img() {
        return introduction_btn_img;
    }

    public SelenideElement getPeruEssentials_btn_img() {
        return peruEssentials_btn_img;
    }

    public SelenideElement getDiscoverPeru_btn_img() {
        return discoverPeru_btn_img;
    }

    public SelenideElement getActivePeru_btn_img() {
        return activePeru_btn_img;
    }

    public SelenideElement getPeruTargetMarkets_btn_img() {
        return peruTargetMarkets_btn_img;
    }

    public SelenideElement getSupplierDirectory_btn_img() {
        return supplierDirectory_btn_img;
    }

    public SelenideElement getTourOperators_btn_img() {
        return tourOperators_btn_img;
    }

    public SelenideElement getHotelsAccommodation_btn_img() {
        return hotelsAccommodation_btn_img;
    }

    public SelenideElement getCruisesRiverCruises_btn_img() {
        return cruisesRiverCruises_btn_img;
    }

    public SelenideElement getSalesToolbox_btn_img() {
        return salesToolbox_btn_img;
    }

    public SelenideElement getBrochures_btn_img() {
        return brochures_btn_img;
    }

    public SelenideElement getVideos_btn_img() {
        return videos_btn_img;
    }

    public SelenideElement getExplorePeru_btn_img() {
        return explorePeru_btn_img;
    }

    public SelenideElement getOfficialWebsite_btn_img() {
        return officialWebsite_btn_img;
    }

    public SelenideElement getPresentation_btn_img() {
        return Presentation_btn_img;
    }

    public SelenideElement getTwitter_link() {
        return twitter_link;
    }

    public SelenideElement getFacebook_link() {
        return facebook_link;
    }

    public SelenideElement getFlikr_link() {
        return flikr_link;
    }

    public SelenideElement getYoutube_link() {
        return youtube_link;
    }

    public SelenideElement getInstagram_link() {
        return instagram_link;
    }

    public SelenideElement getAppStore_link_btn() {
        return appStore_link_btn;
    }

    public SelenideElement getGooglePlay_link_btn() {
        return googlePlay_link_btn;
    }

    public SelenideElement getSupport_btn() {
        return support_btn;
    }

    public SelenideElement getFastFacts_btn_img() {
        return fastFacts_btn_img;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }
}
