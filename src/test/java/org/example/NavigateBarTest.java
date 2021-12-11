package org.example;

import io.qameta.allure.Epic;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class NavigateBarTest extends AbstractTest{

    NavigateBar bar = new NavigateBar(driver);

    @Test
    @Epic("epic1")
    void clickPopular (){
        driver.get("https://vc.ru");
        new WebDriverWait(driver, Duration.ofSeconds(5));
        bar.clickPopular();

    }
    @Test
    @Epic("epic2")

    void clickNewest(){
        driver.get("https://vc.ru");
        bar.clickNewest();


    }
    @Test
    @Epic("epic3")
    void clickCompany(){
        driver.get("https://vc.ru");
        bar.clickCompany();
    }
    @Test
    @Epic("epic4")
    void clickVacancies(){
        driver.get("https://vc.ru");
        bar.clickVacancies();
    }
    @Test
    @Epic("epic5")
            void clickEvents(){
        driver.get("https://vc.ru");
        bar.clickEvents();





}}
