package org.example;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;


public class SearchPageTest extends AbstractTest{


    @Test
    @Epic("epic2") @Feature("Поиск по сайту")
    void SearchIn() {
        driver.get("https://vc.ru/");
        SearchPage page = new SearchPage(driver);
        page.SearchIn();
        Assertions.assertTrue(driver.getTitle().equals("vc.ru — бизнес, технологии, идеи, модели роста, стартапы"));


    }


}
