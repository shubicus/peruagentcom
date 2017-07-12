package get_content;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.ChromeDriverManager;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;


public class Configs {

    public static void browserConfigs() {
        ChromeDriverManager.getInstance().setup();
        Configuration.browser = "chrome";
        Configuration.timeout = 10000;
//        Configuration.browserSize = "1366x768";

        open("http://peruagent.com/");
        $("body > div.logo > img").shouldBe(visible);
        $("body > div.modal.fade.ng-isolate-scope.login-window.in > div > div > div > button").click();  //close the Login propose
    }


    public static void quiteDriver() {
        if (getWebDriver() != null) {
            getWebDriver().quit();
        }
    }
}
