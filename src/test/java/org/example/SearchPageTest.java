package org.example;
import io.qameta.allure.Epic;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;


public class SearchPageTest extends AbstractTest{


    @Test
    @Epic("epic2")
    void SearchIn() {
        driver.get("https://vc.ru/");
        SearchPage page = new SearchPage(driver);
        page.SearchIn();


    }


}
