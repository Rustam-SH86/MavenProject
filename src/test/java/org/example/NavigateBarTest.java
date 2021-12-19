package org.example;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NavigateBarTest extends AbstractTest{

    NavigateBar bar = new NavigateBar(driver);

    @Test @Epic("epic1") @Feature("Популярное")
    void clickPopular (){
        driver.get("https://vc.ru");
        Assertions.assertTrue(driver.getTitle().equals("vc.ru — бизнес, технологии, идеи, модели роста, стартапы"));
        bar.clickPopular();




    }
    @Test @Epic("epic1") @Feature("Свежее")
    void clickNewest(){
        driver.get("https://vc.ru");
        Assertions.assertTrue(driver.getTitle().equals("vc.ru — бизнес, технологии, идеи, модели роста, стартапы"));
        bar.clickNewest();
    }

    @Test @Epic("epic1") @Feature("Компании")
    void clickCompany(){
        driver.get("https://vc.ru");
        bar.clickCompany();
        Assertions.assertTrue(driver.getTitle().equals("vc.ru — бизнес, технологии, идеи, модели роста, стартапы"));
    }

    @Test @Epic("epic1") @Feature("Вакансии")
    void clickVacancies(){
        driver.get("https://vc.ru");
        bar.clickVacancies();
        Assertions.assertTrue(driver.getTitle().equals("vc.ru — бизнес, технологии, идеи, модели роста, стартапы"));
    }

    @Test @Epic("epic1") @Feature("Мероприятия")
            void clickEvents(){
        driver.get("https://vc.ru");
        bar.clickEvents();
        Assertions.assertTrue(driver.getTitle().equals("vc.ru — бизнес, технологии, идеи, модели роста, стартапы"));

    }





}
