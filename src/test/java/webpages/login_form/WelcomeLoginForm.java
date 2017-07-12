package webpages.login_form;


import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class WelcomeLoginForm {

    private SelenideElement welcomeForm = $(".modal-body.ng-scope");

    private SelenideElement hideWelcomeForm_btn = $(".modal-body.ng-scope .close");
    private SelenideElement no_btn = $(".login-right [ng-click='no()']");
    private SelenideElement yes_btn = $(".login-right [ng-click='yes()']");

    private SelenideElement privacyPolicy_btn = $(".login-right a:nth-child(2)");  //.login-right [onclick='urlOverlay('http://travpromobile.com/privacy_policy.html');']
    private SelenideElement termsOfUse_btn = $(".login-right a:nth-child(3)");  //.login-right [onclick='urlOverlay('http://travpromobile.com/terms_of_use.html')']


    //getters
    public SelenideElement getWelcomeForm() {
        return welcomeForm;
    }

    public SelenideElement getHideWelcomeForm_btn() {
        return hideWelcomeForm_btn;
    }

    public SelenideElement getNo_btn() {
        return no_btn;
    }

    public SelenideElement getYes_btn() {
        return yes_btn;
    }

    public SelenideElement getPrivacyPolicy_btn() {
        return privacyPolicy_btn;
    }

    public SelenideElement getTermsOfUse_btn() {
        return termsOfUse_btn;
    }
}
