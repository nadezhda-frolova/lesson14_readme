package test2;

import helpers.TestBase;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class QaVacancy extends TestBase {
    @Test

    void VacancySearch(){
        $("#a11y-search-input").setValue("QA").pressEnter();
        $("[data-qa=wizard-search-name]").shouldHave(text("QA"));
    }
}
