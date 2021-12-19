package org.example;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Assertions;



public class LoginPageTest extends AbstractTest {



  @Test
  @Epic("epic_3") @Feature("Вход зарегистрированного пользователя")
  void LoginIn() {
    driver.get("https://vc.ru/");
    LoginPage page = new LoginPage(driver);
    page.LoginIn();
    Assertions.assertTrue(driver.getTitle().equals("vc.ru — бизнес, технологии, идеи, модели роста, стартапы"));


  }


}




