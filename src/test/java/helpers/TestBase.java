package helpers;

import com.codeborne.selenide.logevents.SelenideLogger;
import config.WebDriver;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class TestBase {


    @BeforeAll
    static void driverConfigure() {
        WebDriver.configure();
    }

    @BeforeAll
    static void openPage() {
        step("Открыть главную страницу 'ХедХантерКазань'", () ->
                open("https://kazan.hh.ru/"));
    }
    @BeforeEach

    void addListener() {
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @AfterEach
    void addAttachments() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
    }
}

