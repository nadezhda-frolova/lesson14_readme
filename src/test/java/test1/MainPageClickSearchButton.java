package test1;

import helpers.TestBase;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPageClickSearchButton extends TestBase {
    @Test
    void mainPageClickSearchButton() {
        $("[data-qa=search-button]").click();
        $("[data-qa=bloko-header-3]").shouldHave(text("Найдено"));

    }
}
