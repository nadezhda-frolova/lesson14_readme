package test4;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginButtonExists {
    @Test
    void loginButtonExists(){
        $("[data-qa=login]").shouldHave(text("Войти"));
    }
}
