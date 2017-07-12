package webpages.supplier_directory.hotels_accommodation;


import com.codeborne.selenide.SelenideElement;
import webpages.supplier_directory.Abstract;

import static com.codeborne.selenide.Selenide.$;

public class HotelsAccommodation extends Abstract {

    private String url = "http://travpro.yourworldapps.nl/directory/peru_dir/?category=Hotel-Resort&country=&firstOpen=true&device=pc";

    private SelenideElement filterOnType_txt = $("#hotel div.center-title");  //text


    //getters
    public String getUrl() {
        return url;
    }

    public SelenideElement getFilterOnType_txt() {
        return filterOnType_txt;
    }
}
