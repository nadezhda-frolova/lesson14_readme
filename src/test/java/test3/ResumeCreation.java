package test3;

import helpers.TestBase;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ResumeCreation extends TestBase {
    @Test
    void resumeCreation(){
        $("[data-qa=signup]").shouldHave(text("Создать резюме")).click();
        $("[data-qa=bloko-header-1]").shouldHave(text("Регистрация соискателя"));
    }
}
