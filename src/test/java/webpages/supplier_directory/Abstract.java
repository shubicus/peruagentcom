package webpages.supplier_directory;


import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class Abstract {

    private SelenideElement loadPage = $("body > div.pg-loading-screen.pg-loading > div > div > div > div");

    private SelenideElement closeFilterWindow_btn = $("#sidr > div > a");  //to close filter window


    private ElementsCollection cards = $$(".left-list a[target]");  //quantity   72Hotels, 98TourOperators, ??CruiseRiver  //todo ??CruiseRiver
    private ElementsCollection nameOfOperatorInCards = $$(".left-list .property-name-item");  //quantity,  name in card
    private ElementsCollection tourTypesInCards = $$(".left-list .property-info-item");  //quantity,  tour types, #phone

    //iframe (body)
    private SelenideElement nameOfOperatorInBody = $(".inner-header-output");
    private SelenideElement categoryDestinations = $(".contact-output");  //phone, website
    private SelenideElement link = $(".contact-output p a[href][target='_blank']");


    //getters
    public SelenideElement getCloseFilterWindow_btn() {
        return closeFilterWindow_btn;
    }

    public ElementsCollection getCards() {
        return cards;
    }

    public ElementsCollection getNameOfOperatorInCards() {
        return nameOfOperatorInCards;
    }

    public ElementsCollection getTourTypesInCards() {
        return tourTypesInCards;
    }

    public SelenideElement getNameOfOperatorInBody() {
        return nameOfOperatorInBody;
    }

    public SelenideElement getCategoryDestinations() {
        return categoryDestinations;
    }

    public SelenideElement getLink() {
        return link;
    }

    public SelenideElement getLoadPage() {
        return loadPage;
    }
}
