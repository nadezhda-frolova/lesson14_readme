package test4;

import helpers.TestBase;
import org.junit.jupiter.api.Test;
import pages.MainPage;
import pages.ResultsPage;

import static io.qameta.allure.Allure.step;

public class LoginButtonExists extends TestBase {
    ResultsPage resultsPage = new ResultsPage();

    @Test
    void loginButtonExists() {
        step("текст", () ->
                resultsPage.loginButtonExists());
    }
}
