package test3;

import helpers.TestBase;
import org.junit.jupiter.api.Test;
import pages.MainPage;
import pages.ResultsPage;

import static io.qameta.allure.Allure.step;

public class ResumeCreation extends TestBase {
    MainPage mainPage = new MainPage();
    ResultsPage resultsPage = new ResultsPage();

    @Test
    void resumeCreation() {
        step("текст", () ->
                mainPage.createResume());
        step("текст", () ->
                resultsPage.registrationPageOpened());
    }
}
