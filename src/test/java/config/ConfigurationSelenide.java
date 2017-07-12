package config;

import com.automation.remarks.video.enums.RecorderType;
import com.automation.remarks.video.enums.RecordingMode;
import com.automation.remarks.video.enums.VideoSaveMode;
import com.automation.remarks.video.recorder.VideoRecorder;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Screenshots;
import io.github.bonigarcia.wdm.ChromeDriverManager;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;


public class ConfigurationSelenide {


    public static void configurationSelenide() {
        ChromeDriverManager.getInstance().setup();
        Configuration.browser = "chrome";
        Configuration.reportsFolder = "build/reports/screenshots";
        Configuration.timeout = 10000;
//        Configuration.browserSize = "1366x768";

        VideoRecorder.conf()
                .withVideoFolder("build/reports/videos")
                .videoEnabled(true)
                .withRecorderType(RecorderType.FFMPEG)
                .withRecordMode(RecordingMode.ANNOTATED)
                .withVideoSaveMode(VideoSaveMode.ALL);
//                .withScreenSize(1600,1200);
    }

    public static void openURL() {
        open("http://peruagent.com/");
        $("body > div.logo > img").shouldBe(visible);
        $(".modal-body.ng-scope .close").click();  //hide Welcome form
        Screenshots.takeScreenShot("FirstScreenshotHomePage");  //make forced Screenshot first
    }

    public static void closeDriver() {
        if (getWebDriver() != null) {
            getWebDriver().close();
        }
    }

    public static void quitDriver() {
        if (getWebDriver() != null) {
            getWebDriver().quit();
        }
    }

}
