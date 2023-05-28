package ru.litres.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;
import ru.litres.helpers.Attach;

import java.util.HashMap;
import java.util.Map;

public class TestBase {
    @BeforeAll
    static void beforeAll () {
        //Configuration.browser = "chrome";
        Configuration.pageLoadStrategy = "eager";

        //Configuration.pageLoadTimeout = 60;
        DesiredCapabilities capabilities = new DesiredCapabilities();
        Map<String, Object> prop = new HashMap<>();
        prop.put("enableVNC", true);
        prop.put("enableVideo", true);

        capabilities.setCapability("selenoid:options", prop);

        Configuration.browserCapabilities = capabilities;



        SelenideLogger.addListener("allure",new AllureSelenide());
    }


    @AfterEach
    void addAttachments(){
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
    }
}

