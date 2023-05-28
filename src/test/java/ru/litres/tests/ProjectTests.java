package ru.litres.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import ru.litres.pages.ProjectPage;
import static io.qameta.allure.Allure.step;


public class ProjectTests extends TestBase{
    ProjectPage projectPage = new ProjectPage();

    @Test
    @Tag("smoke") @Tag("search")
    @DisplayName("Проверка работы поиска")
    void searchTest (){
        step("Открыть главную страницу", () ->{
            projectPage.openPage();
        });
        step("Ввести в поле поиска значение", () ->{
            projectPage.searchInput("Война и мир");
        });
        step("Проверить результат поиска", () ->{
            projectPage.searchResult("Результаты поиска «Война и мир");
        });
    }

    @Test
    @Tag("smoke") @Tag("loginVK")
    @DisplayName("Возможность логина через vk")
    void loginTest(){
        step("Открыть главную страницу", () ->{
            projectPage.openPage();
        });
        step("Нажать кнопку 'Войти'", () ->{
            projectPage.loginOption();
        });
        step("Проверить возможность логина через VK", ()->{
            projectPage.VKlogin("VK ID");
        });
    }

    @Test
    @Tag("smoke") @Tag("loginPhone")
    @DisplayName("Логин по номеру телефона с не валидным значением")
    void loginWithNumber(){
        step("Открыть главную страницу", () ->{
            projectPage.openPage();
        });
        step("Нажать кнопку 'Войти'", () ->{
            projectPage.loginOption();
        });
        step("Ввести не валидный номер телефона и нажать продолжить", () ->{
            projectPage.phoneLogin("99");
        });
        step("Проверить ошибку при вводе невалидного номера", () ->{
            projectPage.checkError("Номер введён не полностью");
        });
    }

    @Test
    @Tag("smoke")
    @DisplayName("Проверка наличия вакансий в ИТ")
    void vacancyTest(){
        step("Открыть главную страницу", () ->{
            projectPage.openPage();
        });
        step("Выбрать раздел 'Еще' в меню", () ->{
            projectPage.moreMenu();
        });
        step("Перейти в раздел 'Компания'", () ->{
            projectPage.selectCompany();
        });
        step("Перейти в раздел 'Вакансии'", () ->{
            projectPage.selectVacancy();
        });
        step("Проверить наличие вакансий в ИТ сфере", () ->{
            projectPage.checkITVacancy("Информационные технологии");
        });
    }

    @Test
    @Tag("smoke") @Tag("redirectOzon")
    @DisplayName("Проверка открытия новой вкладки для партнера Ozon")
    void redirectTest() {
        step("Открыть главную страницу", () -> {
            projectPage.openPage();
        });
        step("Выбрать партнера 'Ozon'", () -> {
            projectPage.selectPartner();
        });
        step("Проверить редирект на страницу партнера", () -> {
            projectPage.switchTo("https://www.ozon.ru/");
        });
    }
}
