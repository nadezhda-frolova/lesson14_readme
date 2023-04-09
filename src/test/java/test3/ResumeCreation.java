package test3;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ResumeCreation {
    @Test
    void resumeCreation(){
        open("https://kazan.hh.ru/");
        //data-qa="bloko-header-1"
        $("[data-qa=signup]").shouldHave(text("Создать резюме")).click();
        $("[data-qa=bloko-header-1]").shouldHave(text("Регистрация соискателя"));
    }
}
