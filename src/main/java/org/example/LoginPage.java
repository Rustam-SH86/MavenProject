package org.example;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class LoginPage extends AbstractPage{

   @FindBy(xpath = "//span[text()='Войти']")
   private WebElement Enter;
   @FindBy(xpath = "//button//span[text()='Войти']")
   private WebElement enter;
   @FindBy(xpath = "//button[@data-gtm='Login — Mail — Click']")
   private WebElement email;
   @FindBy(xpath = "//input[@name='login']")
   private WebElement login;
   @FindBy(xpath = "//input[@name='password']")
   private WebElement password;

   public LoginPage(WebDriver driver){
      super(driver);

   }




   public void LoginIn() {
   Enter.click();enter.click();email.click();
   login.sendKeys("rust-shafik@yandex.ru");
   password.sendKeys("2204", Keys.ENTER);


   }



   }




