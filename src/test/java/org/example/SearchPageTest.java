package org.example;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;


public class SearchPageTest extends AbstractTest{


    @Test
    void SearchIn() {
        driver.get("https://vc.ru/");
        SearchPage page = new SearchPage(driver);
        page.SearchIn();


    }


}
