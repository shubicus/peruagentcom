package tests.sales_toolbox.presentation;

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

import static com.codeborne.selenide.Selenide.refresh;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static config.ConfigurationExtentReport.extent;

@Listeners({VideoListener.class, ScreenshotListenerForNonSelenideAssertion.class})
public class Presentation {


    private webpages.sales_toolbox.presentation.Presentation presentation = new webpages.sales_toolbox.presentation.Presentation();
    private PDFUtil pdfUtil = new PDFUtil();
    private String pathToPDFs = "/src/test/resources/pdf/pdfs/peru/";

    private String expectedPDF = System.getProperty("user.dir") + pathToPDFs + "peru_presentacion.pdf";

    @BeforeClass
    public void openPresentationPage() {
        getWebDriver().navigate().to(presentation.getUrl());
    }

    @AfterMethod
    public void recordTestsToExtentReport(ITestResult result) throws IOException {
        ConfigurationExtentReport.getResult(result);
    }

    @Video
    @Test(description = "This TC#027 verifies that the PDF file is actual.")
    public void testPresentationPDF() throws IOException {
        ConfigurationExtentReport.test = extent.createTest("testPresentationPDF", "This TC#027 verifies that PDF file is actual.");


        refresh();  //for videos recorder

        int pageCountActual = pdfUtil.getPageCount(expectedPDF);
        int pageCountExpected = 29;
        String actualPDF = presentation.getDownload().download().getPath();
        Assert.assertTrue(pdfUtil.compare(expectedPDF, actualPDF));
        Assert.assertEquals(pageCountActual, pageCountExpected);

    }


}
