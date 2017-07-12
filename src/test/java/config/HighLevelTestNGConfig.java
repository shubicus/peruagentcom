package config;

import com.codeborne.selenide.testng.GlobalTextReport;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static config.ConfigurationExtentReport.endExtentReporting;
import static config.ConfigurationExtentReport.startExtentReporting;
import static config.ConfigurationSelenide.configurationSelenide;
import static config.ConfigurationSelenide.quitDriver;

@Test
@Listeners(GlobalTextReport.class)
public class HighLevelTestNGConfig {

    @BeforeTest
    public void setUp() {
        configurationSelenide();
        startExtentReporting();
    }

    @AfterTest
    public void tearDown() {
        endExtentReporting();
        quitDriver();
    }

}
