package webpages.supplier_directory.cruises_river;


import com.codeborne.selenide.SelenideElement;
import webpages.supplier_directory.Abstract;

import static com.codeborne.selenide.Selenide.$;

public class CruisesRiver extends Abstract {

    private String url = "http://travpro.yourworldapps.nl/directory/peru_dir/?category=&country=&tourType[]=rivercruise&tourType=cruise&firstOpen=true&device=pc";
//    private String url = "http://travpro.yourworldapps.nl/directory/peru_dir/?category=&country=&tourType[]=cruise";

    private SelenideElement filterOnType_txt = $("#main-cruise div.center-title");  //text

    private SelenideElement riverCruise_filter_btn = $("#t_rivercruise");
    private SelenideElement cruise_filter_btn = $("#t_cruise");


    //getters
    public String getUrl() {
        return url;
    }

    public SelenideElement getRiverCruise_filter_btn() {
        return riverCruise_filter_btn;
    }

    public SelenideElement getCruise_filter_btn() {
        return cruise_filter_btn;
    }

    public SelenideElement getFilterOnType_txt() {
        return filterOnType_txt;
    }
}
