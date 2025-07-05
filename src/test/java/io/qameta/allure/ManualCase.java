package io.qameta.allure;

import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class ManualCase {

    @Test
    void auth(){
        step("Зайти н аэкран авторизации");
        step("Ввести данные авторизации", () -> {
            step("Ввести логин");
            step("Ввести пароль");
        });
        step("Тап по кнопке 'Войти'");
        step("Убедиться, что мы авторизовались");
    }
}
