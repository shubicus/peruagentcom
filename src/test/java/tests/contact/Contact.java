package tests.contact;


import com.automation.remarks.testng.VideoListener;
import com.automation.remarks.video.annotations.Video;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import config.ConfigurationExtentReport;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static config.ConfigurationExtentReport.extent;

@Listeners(VideoListener.class)
public class Contact {

    private webpages.contact.Contact contact = new webpages.contact.Contact();
    private String pathToScreenshots = "/src/test/resources/contact_screenshots/";


    @BeforeClass
    public void openIntroductionPage() {
        getWebDriver().navigate().to(contact.getUrl());
    }


    @AfterMethod
    public void recordTestsToExtentReport(ITestResult result) throws IOException {
        ConfigurationExtentReport.getResult(result);
    }


    @Video
    @Test(description = "This TC#042 verifies that on click contact button user gets correct contact-card at the ContactPage.")
    public void testContact() throws IOException {
        ConfigurationExtentReport.test = extent.createTest("testContact", "This TC#042 verifies that on click contact button user gets correct contact-card at the ContactPage.");

        contact.getIncomingTourismCoordinator_btn().click();
        Selenide.sleep(2000);
        BufferedImage actualIncomingTourismCoordinator = ImageIO.read(new File(contact.getContact().screenshot().getPath()));
        BufferedImage expectedIncomingTourismCoordinator = ImageIO.read(new File(System.getProperty("user.dir") + pathToScreenshots + "IncomingTourismCoordinator.png"));
        ImageDiff diffIncomingTourismCoordinator = new ImageDiffer().makeDiff(expectedIncomingTourismCoordinator, actualIncomingTourismCoordinator);
        Assert.assertFalse(diffIncomingTourismCoordinator.hasDiff());
        contact.getEmail().shouldHave(Condition.attribute("href", contact.getIncomingTourismCoordinator_email()));

        contact.getCanada_btn().click();
        Selenide.sleep(2000);
        BufferedImage actualCanada = ImageIO.read(new File(contact.getContact().screenshot().getPath()));
        BufferedImage expectedCanada = ImageIO.read(new File(System.getProperty("user.dir") + pathToScreenshots + "Canada.png"));
        ImageDiff diffCanada = new ImageDiffer().makeDiff(expectedCanada, actualCanada);
        Assert.assertFalse(diffCanada.hasDiff());
        contact.getEmail().shouldHave(Condition.attribute("href", contact.getCanada_email()));

        contact.getUnitedStates_btn().click();
        Selenide.sleep(2000);
        BufferedImage actualUnitedStates = ImageIO.read(new File(contact.getContact().screenshot().getPath()));
        BufferedImage expectedUnitedStates = ImageIO.read(new File(System.getProperty("user.dir") + pathToScreenshots + "UnitedStates.png"));
        ImageDiff diffUnitedStates = new ImageDiffer().makeDiff(expectedUnitedStates, actualUnitedStates);
        Assert.assertFalse(diffUnitedStates.hasDiff());
        contact.getEmail().shouldHave(Condition.attribute("href", contact.getUnitedStates_email()));

    }
}
