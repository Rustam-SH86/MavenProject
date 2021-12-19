package org.example;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends AbstractPage{
   @FindBy(xpath = "(//span[text()='Войти'])[1]")
   private WebElement Enter;
   @FindBy(xpath = "(//span[text()='Войти'])[3]")
   private WebElement enter;
   @FindBy(xpath = "//button[@data-gtm='Login — Mail — Click']")
   private WebElement email;
   @FindBy(xpath = "//input[@name='login']")
   private WebElement login;
   @FindBy(xpath = "//input[@name='password']")
   private WebElement password;
   @FindBy(xpath = "(//div[@class='navigation-user-profile__toggle'])[1]")
   private WebElement navigate;
   @FindBy(xpath = "(//div//span[@class='item__text'])[6]")
   private WebElement exit;

   public LoginPage(WebDriver driver){
      super(driver);

   }


   public void LoginIn() {
   Enter.click();enter.click();email.click();
  login.sendKeys("rust-shafik@yandex.ru");
  password.sendKeys("2204", Keys.ENTER);
  navigate.click(); exit.click();

  /*
  Actions loginIn = new Actions(getDriver());

  loginIn.click(Enter).click(enter).click(email).
              sendKeys(this.login,"rust-shafik@yandex.ru").click(password).
              sendKeys(this.password,"2204").build().perform();
  */









   }



   }




