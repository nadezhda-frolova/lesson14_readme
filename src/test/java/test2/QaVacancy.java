package test2;

import helpers.TestBase;
import org.junit.jupiter.api.Test;
import pages.MainPage;
import pages.ResultsPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class QaVacancy extends TestBase {
    MainPage mainPage = new MainPage();
    ResultsPage resultsPage = new ResultsPage();

    @Test
    void VacancySearch() {
        step("текст", () ->
               mainPage.setValueQA());
        step("текст", () ->
                resultsPage.qaVacanciesFound());
    }
}

