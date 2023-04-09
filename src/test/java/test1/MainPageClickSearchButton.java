package test1;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPageClickSearchButton {
    @Test

            void mainPageClickSearchButton(){
        open("https://kazan.hh.ru/");
        $("[data-qa=search-button]").click();
        $("[data-qa=bloko-header-3]").shouldHave(text("Найдено"));

    }
}
