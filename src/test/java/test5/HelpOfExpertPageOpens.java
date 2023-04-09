package test5;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class HelpOfExpertPageOpens {
    @Test
    void helpOfExpertPageOpens(){
        open("https://kazan.hh.ru/");
        $("[data-qa=mainmenu_expertresume]").click();
        $(".Hk5ajsi___promo-button-container").shouldHave(text("Какие задачи поможет решить эксперт?"));
    }
}
