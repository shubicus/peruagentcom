package get_content;


import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import webpages.sales_toolbox.videos.Videos;

import java.io.FileNotFoundException;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static get_content.Configs.browserConfigs;
import static get_content.Configs.quiteDriver;

/**
 * Run this Class if you need to refresh the videos for VideoPage.
 */
public class GetVideos {


    private static Videos videos = new Videos();


    public static void main(String[] args) throws FileNotFoundException {

        browserConfigs();

        Configuration.reportsFolder = System.getProperty("user.dir") + "/src/test/resources/videos";

        getWebDriver().navigate().to(videos.getUrl());

        System.out.println("start to 36");

        for (int i = 0; i < 36; i++) {

            videos.getDots().get(i).click();
            Selenide.sleep(1000);
            videos.getImages().get(i).click();
            System.out.println(videos.getDownload().download().getPath());
            videos.getFancyboxClose_btn().click();
            System.out.println(i);
        }

        System.out.println("end");

        quiteDriver();

    }


}
