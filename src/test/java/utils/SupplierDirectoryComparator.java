package utils;


import com.codeborne.selenide.Selenide;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.testng.Assert;
import webpages.supplier_directory.Abstract;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class SupplierDirectoryComparator {

    private static Abstract anAbstract = new Abstract();
    private static OkHttpClient.Builder b = new OkHttpClient.Builder();
    private static Request request;


    public static void compareResponse(int quantityOfCards) throws IOException {

        b.connectTimeout(30, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                .writeTimeout(3, TimeUnit.SECONDS);
        OkHttpClient client = b.build();

        client.readTimeoutMillis();

        for (int i = 0; i < quantityOfCards; i++) {

            anAbstract.getCards().get(i).scrollTo().click();
            getWebDriver().switchTo().frame($(".center-list #iframe-quick"));
            String externalURL = anAbstract.getLink().getAttribute("href");
            System.out.print(externalURL);

            request = new Request.Builder().url(externalURL).build();
            Response response = client.newCall(request).execute();
            Assert.assertEquals(response.code(), 200);
            System.out.println(" => " + response.code());
            response.close();

            getWebDriver().switchTo().parentFrame();
        }
    }

    public static void compareInfoCardBody(int quantityOfCards) {

        for (int i = 0; i < quantityOfCards; i++) {

            anAbstract.getCards().get(i).scrollTo().click();
            String nameCard = anAbstract.getNameOfOperatorInCards().get(i).getText().toUpperCase().trim();
            Selenide.sleep(500);
            getWebDriver().switchTo().frame($(".center-list #iframe-quick"));
            String nameBody = anAbstract.getNameOfOperatorInBody().getText().toUpperCase().trim();
            System.out.println(nameCard + "|" + nameBody);
            Assert.assertEquals(nameCard, nameBody);

            getWebDriver().switchTo().parentFrame();
        }

    }
}
