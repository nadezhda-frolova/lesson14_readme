package tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import config.WebDriver;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import pages.MainPage;
import pages.ResultsPage;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class TestBase {

    @BeforeEach
    void openPage() {
        step("Открыть главную страницу 'ХедХантер Казань'", () ->
                open("https://kazan.hh.ru/"));
    }

    @BeforeAll
    static void driverConfigure() {
        WebDriver.configure();
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
        closeWebDriver();
    }

    MainPage mainPage = new MainPage();
    ResultsPage resultsPage = new ResultsPage();
}

