package org.example;
import io.qameta.allure.Epic;
import org.junit.jupiter.api.*;



public class LoginPageTest extends AbstractTest {



  @Test
  @Epic("epic_1")
  void LoginIn() {
    driver.get("https://vc.ru/");
    LoginPage page = new LoginPage(driver);
    page.LoginIn();


  }


}




