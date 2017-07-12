package webpages.supplier_directory.tour_operators;


import com.codeborne.selenide.SelenideElement;
import webpages.supplier_directory.Abstract;

import static com.codeborne.selenide.Selenide.$;

public class TourOperators extends Abstract{

    private String url = "http://travpro.yourworldapps.nl/directory/peru_dir/?category=tour-operator&country=United-States-of-America&firstOpen=true&device=pc";

    private SelenideElement filterOnType_txt = $("#tour div.center-title");  //text


    //getters
    public String getUrl() {
        return url;
    }

    public SelenideElement getFilterOnType_txt() {
        return filterOnType_txt;
    }
}
