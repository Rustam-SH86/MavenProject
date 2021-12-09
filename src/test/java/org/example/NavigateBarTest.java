package org.example;

import org.junit.jupiter.api.Test;

public class NavigateBarTest extends AbstractTest{

    @Test
    void clickNavigateBar (){
        driver.get("https://vc.ru");
        NavigateBar bar = new NavigateBar(driver);
        bar.clickNavigateBar();

    }





}
