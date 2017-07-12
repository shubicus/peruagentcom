package tests.sales_toolbox.brochures;

import com.automation.remarks.testng.VideoListener;
import com.automation.remarks.video.annotations.Video;
import com.testautomationguru.utility.PDFUtil;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import config.ConfigurationExtentReport;
import utils.ScreenshotListenerForNonSelenideAssertion;

import java.io.IOException;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static config.ConfigurationExtentReport.extent;

@Listeners({VideoListener.class, ScreenshotListenerForNonSelenideAssertion.class})
public class Brochures {

    private webpages.sales_toolbox.brochures.Brochures brochures = new webpages.sales_toolbox.brochures.Brochures();
    private PDFUtil pdfUtil = new PDFUtil();
    private String pathToPDFs = "/src/test/resources/pdf/images/brochures/";

    private String expectedPDF1 = System.getProperty("user.dir") + pathToPDFs + "30%20Experiences%20Brochure.pdf";
    private String expectedPDF2 = System.getProperty("user.dir") + pathToPDFs + "Fascinanting%20Peru%20-%20Arequipa-Cusco-Puno.pdf";
    private String expectedPDF3 = System.getProperty("user.dir") + pathToPDFs + "Fascinanting%20Peru%20-%20Lima-Paracas.pdf";
    private String expectedPDF4 = System.getProperty("user.dir") + pathToPDFs + "Fascinanting%20Peru%20-%20Madre%20de%20Dios-Iquitos.pdf";
    private String expectedPDF5 = System.getProperty("user.dir") + pathToPDFs + "Lima%20Brochure.pdf";
    private String expectedPDF6 = System.getProperty("user.dir") + pathToPDFs + "Meetings%20Peru%20-%20MICE%20Guide.pdf";
    private String expectedPDF7 = System.getProperty("user.dir") + pathToPDFs + "Tourism%20Brochure.pdf";

    @BeforeClass
    public void openIntroductionPage() {
        getWebDriver().navigate().to(brochures.getUrl());
    }


    @AfterMethod
    public void recordTestsToExtentReport(ITestResult result) throws IOException {
        ConfigurationExtentReport.getResult(result);
    }


    @Video
    @Test(description = "This TC#025 verifies that PDFs file are actual.")
    public void testPDFs() throws IOException {
        ConfigurationExtentReport.test = extent.createTest("testPDFs", "This TC#025 verifies that PDFs file are actual.");

        int pageCountActual1 = pdfUtil.getPageCount(expectedPDF1);
        int pageCountExpected1 = 20;
        brochures.getDot1_btn().click();
        brochures.getBrochure1_image().click();
        String actualPDF1 = brochures.getDownload().download().getPath();
        Assert.assertTrue(pdfUtil.compare(expectedPDF1, actualPDF1));
        Assert.assertEquals(pageCountActual1, pageCountExpected1);

        brochures.getFancyboxClose_btn().click();
        int pageCountActual2 = pdfUtil.getPageCount(expectedPDF1);
        int pageCountExpected2 = 20;
        brochures.getDot2_btn().click();
        brochures.getBrochure2_image().click();
        String actualPDF2 = brochures.getDownload().download().getPath();
        Assert.assertTrue(pdfUtil.compare(expectedPDF2, actualPDF2));
        Assert.assertEquals(pageCountActual2, pageCountExpected2);

        brochures.getFancyboxClose_btn().click();
        int pageCountActual3 = pdfUtil.getPageCount(expectedPDF3);
        int pageCountExpected3 = 16;
        brochures.getDot3_btn().click();
        brochures.getBrochure3_image().click();
        String actualPDF3 = brochures.getDownload().download().getPath();
        Assert.assertTrue(pdfUtil.compare(expectedPDF3, actualPDF3));
        Assert.assertEquals(pageCountActual3, pageCountExpected3);

        brochures.getFancyboxClose_btn().click();
        int pageCountActual4 = pdfUtil.getPageCount(expectedPDF4);
        int pageCountExpected4 = 16;
        brochures.getDot4_btn().click();
        brochures.getBrochure4_image().click();
        String actualPDF4 = brochures.getDownload().download().getPath();
        Assert.assertTrue(pdfUtil.compare(expectedPDF4, actualPDF4));
        Assert.assertEquals(pageCountActual4, pageCountExpected4);

        brochures.getFancyboxClose_btn().click();
        int pageCountActual5 = pdfUtil.getPageCount(expectedPDF5);
        int pageCountExpected5 = 2;
        brochures.getDot5_btn().click();
        brochures.getBrochure5_image().click();
        String actualPDF5 = brochures.getDownload().download().getPath();
        Assert.assertTrue(pdfUtil.compare(expectedPDF5, actualPDF5));
        Assert.assertEquals(pageCountActual5, pageCountExpected5);

        brochures.getFancyboxClose_btn().click();
        int pageCountActual6 = pdfUtil.getPageCount(expectedPDF6);
        int pageCountExpected6 = 39;
        brochures.getDot6_btn().click();
        brochures.getBrochure6_image().click();
        String actualPDF6 = brochures.getDownload().download().getPath();
        Assert.assertTrue(pdfUtil.compare(expectedPDF6, actualPDF6));
        Assert.assertEquals(pageCountActual6, pageCountExpected6);

        brochures.getFancyboxClose_btn().click();
        int pageCountActual7 = pdfUtil.getPageCount(expectedPDF7);
        int pageCountExpected7 = 32;
        brochures.getDot7_btn().click();
        brochures.getBrochure7_image().click();
        String actualPDF7 = brochures.getDownload().download().getPath();
        Assert.assertTrue(pdfUtil.compare(expectedPDF7, actualPDF7));
        Assert.assertEquals(pageCountActual7, pageCountExpected7);
    }

}
