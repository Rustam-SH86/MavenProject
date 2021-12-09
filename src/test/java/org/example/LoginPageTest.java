package org.example;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;



public class LoginPageTest extends AbstractTest {



  @Test
  void LoginIn() {
    driver.get("https://vc.ru/");
    LoginPage page = new LoginPage(driver);
    page.LoginIn();


  }


}




