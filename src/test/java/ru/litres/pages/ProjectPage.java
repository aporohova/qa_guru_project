package ru.litres.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ProjectPage {
    SelenideElement
            search = $(".SearchForm-module__input_1E6az"),
            searchResult = $(".SearchTitle-module__title_YEbWG"),
            login = $(".Login-module__wrapper_1YKv5"),
            loginVK = $(".AuthorizationPopup-module__socials__link_name_2dk_w"),
            loginPhone = $(byText("Номер телефона")),
            phoneInput = $(".PhoneCodes__numberInput_2Tejv"),
            nextButton = $(byText("Продолжить")),
            errorText = $(".PhoneCodes__errorText_sKvhD"),
            moreButton = $(".LowerMenu-module__more_3FAKy"),
            companyButton = $(withText("Компания")),
            vacancyButton = $(withText("Вакансии")),
            section = $(".accordion"),
            partnerOzon = $(".Partners-module__logo__ozon_2I1FN");

    public ProjectPage openPage(){
        open ("https://www.litres.ru/");

        return this;
    }

    public ProjectPage searchInput(String value){
        search.click();
        search.setValue(value).pressEnter();

        return this;
    }

    public ProjectPage searchResult(String value){
        searchResult.shouldHave(Condition.text(value));

        return this;
    }

    public ProjectPage loginOption(){
        login.click();

        return this;
    }

    public ProjectPage VKlogin(String value){
        loginVK.shouldHave(Condition.text(value));

        return this;
    }

    public ProjectPage phoneLogin (String value){
        loginPhone.click();
        phoneInput.setValue(value);
        nextButton.click();

        return this;
    }

    public ProjectPage checkError(String value){
        errorText.shouldHave(Condition.text(value));

        return this;
    }

    public ProjectPage moreMenu(){
        moreButton.click();

        return this;
    }

    public ProjectPage selectCompany(){
        companyButton.click();

        return this;
    }

    public ProjectPage selectVacancy(){
        vacancyButton.click();

        return this;
    }

    public ProjectPage checkITVacancy(String value){
        section.shouldHave(Condition.text(value));

        return this;
    }

    public ProjectPage selectPartner(){
        partnerOzon.click();

        return this;
    }

    public ProjectPage switchTo(String value){
        Selenide.switchTo().window(1).getCurrentUrl().equals(value);

        return this;
    }


}
