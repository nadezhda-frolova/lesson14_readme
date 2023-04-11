package test5;

import helpers.TestBase;
import org.junit.jupiter.api.Test;
import pages.MainPage;
import pages.ResultsPage;

import static io.qameta.allure.Allure.step;

public class HelpOfExpertPageOpens extends TestBase {
    MainPage mainPage = new MainPage();
    ResultsPage resultsPage = new ResultsPage();

    @Test
    void helpOfExpertPageOpens() {
        step("текст", () ->
                mainPage.helpOfExpertPageButton());
        step("текст", () ->
                resultsPage.helpOfExpertsPageOpened());
    }
}
