package test4;

import helpers.TestBase;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginButtonExists extends TestBase {
    @Test
    void loginButtonExists(){
        $("[data-qa=login]").shouldHave(text("Войти"));
    }
}
