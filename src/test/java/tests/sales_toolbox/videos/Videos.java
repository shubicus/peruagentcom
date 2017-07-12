package tests.sales_toolbox.videos;

import com.automation.remarks.testng.VideoListener;
import com.automation.remarks.video.annotations.Video;
import config.ConfigurationExtentReport;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;
import utils.ScreenshotListenerForNonSelenideAssertion;

import java.io.File;
import java.io.IOException;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static config.ConfigurationExtentReport.extent;
import static utils.CompareVideo.sameContent;

@Listeners({VideoListener.class, ScreenshotListenerForNonSelenideAssertion.class})
public class Videos {

    private webpages.sales_toolbox.videos.Videos videos = new webpages.sales_toolbox.videos.Videos();
    private String pathToVideo = "/src/test/resources/videos/apptool/app/91/video/";

    private String expectedVideo = System.getProperty("user.dir") + pathToVideo;

    @BeforeClass
    public void openIntroductionPage() {
        getWebDriver().navigate().to(videos.getUrl());
    }

    @AfterMethod
    public void recordTestsToExtentReport(ITestResult result) throws IOException {
        ConfigurationExtentReport.getResult(result);
    }

    @DataProvider
    public static Object[][] getName() {
        return new Object[][]{
                {"activeperu.mp4", 0},
                {"discoverperu.mp4", 1},
                {"familyperu.mp4", 2},
                {"hiddentreasures.mp4", 3},
                {"missingsomethingintro.mp4", 4},
                {"modernperu.mp4", 5},
                {"arequipa-visit.mp4", 6},
                {"Cusco_Today.mp4", 7},
                {"welcome_lima.mp4", 8},
                {"ica_southernperu.mp4", 9},
                {"Lambayeque_north.mp4", 10},
                {"amazonas.mp4", 11},
                {"birding.mp4", 12},
                {"inti_raymi_sunfestival.mp4", 13},
                {"bethjenkins_alifetime.mp4", 14},
                {"1305-bethjenkins_culinarycapital.mp4", 15},
                {"1267-bethjenkins_pacerecommend.mp4", 16},
                {"bethjenkins_anytypetraveler.mp4", 17},
                {"bethjenkins_familybond.mp4", 18},
                {"bethjenkins_Infrastructuretourism.mp4", 19},
                {"bethjenkins_mountainhike.mp4", 20},
                {"betsybouche_countryside.mp4", 21},
                {"betsybouche_senseofexploration.mp4", 22},
                {"betsybouche_suprisinglymodern.mp4", 23},
                {"1255-betsybouche_familiesculture.mp4", 24},
                {"1280-cathydorton_stoptime.mp4", 25},
                {"1250-cathydorton_culinarytour.mp4", 26},
                {"1236-cathydorton_seeitall.mp4", 27},
                {"cathydorton_amazonriver.mp4", 28},
                {"cathydorton_culinaryscene.mp4", 29},
                {"cathydorton_lima.mp4", 30},
                {"cathydorton_phenomenalculture.mp4", 31},
                {"pattycotti_walkthestreets.mp4", 32},
                {"sandystaples_foreveryone.mp4", 33},
                {"sandystaples_greatforfamilies.mp4", 34},
                {"sandystaples_returnvisit.mp4", 35},

        };
    }

    @Video
    @Test(dataProvider = "getName", description = "This TC#028 verifies that the Video files are actual.")
    public void testVideos(String name, Integer number) throws IOException {
        ConfigurationExtentReport.test = extent.createTest("testVideos", "This TC#028 verifies that Video files are actual.");

        videos.getDots().get(number).click();
        videos.getImages().get(number).waitUntil(attribute("class", "slick-slide slick-current slick-active slick-center"), 5000).click();
        videos.getFancybox().shouldBe(visible);
        File file1 = new File(videos.getDownload().download().getPath());
        File file2 = new File(expectedVideo + name);
        videos.getFancyboxClose_btn().click();
        videos.getFancybox().shouldNotBe(visible);
        Assert.assertTrue(sameContent(file1.toPath(), file2.toPath()));
    }

}
