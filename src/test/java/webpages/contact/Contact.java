package webpages.contact;


import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class Contact {

    private String url = "http://peruagent.com/?p=contact";

    private SelenideElement incomingTourismCoordinator_btn = $("body > div.container a:nth-child(1)");
    private SelenideElement canada_btn = $("body > div.container a:nth-child(2)");
    private SelenideElement unitedStates_btn = $("body > div.container a:nth-child(3)");

    private SelenideElement contact = $("#contact");
    private SelenideElement email = $("#email");

    private String incomingTourismCoordinator_email = "mailto:ehakim@promperu.gob.pe";
    private String canada_email = "mailto:jcamargo@promperu.gob.pe";
    private String unitedStates_email = "mailto:mipanaque@promperu.gob.pe";


    //getters
    public String getUrl() {
        return url;
    }

    public SelenideElement getIncomingTourismCoordinator_btn() {
        return incomingTourismCoordinator_btn;
    }

    public SelenideElement getCanada_btn() {
        return canada_btn;
    }

    public SelenideElement getUnitedStates_btn() {
        return unitedStates_btn;
    }

    public SelenideElement getContact() {
        return contact;
    }

    public SelenideElement getEmail() {
        return email;
    }

    public String getIncomingTourismCoordinator_email() {
        return incomingTourismCoordinator_email;
    }

    public String getCanada_email() {
        return canada_email;
    }

    public String getUnitedStates_email() {
        return unitedStates_email;
    }
}
