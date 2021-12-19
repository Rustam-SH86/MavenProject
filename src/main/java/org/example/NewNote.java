package org.example;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class NewNote extends AbstractPage{


    @FindBy(xpath = "//div[text()[contains(.,'Новая запись')]]")
    private WebElement newNote;
    @FindBy(xpath = "(//span[text()='Войти'])[3]")
    private WebElement enter;
    @FindBy(xpath = "//button[@data-gtm='Login — Mail — Click']")
    private WebElement email;
    @FindBy(xpath = "//input[@name='login']")
    private WebElement login;
    @FindBy(xpath = "//input[@name='password']")
    private WebElement password;
    @FindBy(xpath = "/html/body/div[7]/div[2]/div[1]/div/div/div[2]/div/div/div[3]/div/div[1]/div/textarea")
    private WebElement heading;
    @FindBy(xpath = "(//div//span[text()[contains(.,'Опубликовать')]])[2]")
    private WebElement publish;


    public NewNote(WebDriver driver){
        super(driver);

    }

    void createNote() {

        newNote.click();

        enter.click(); email.click(); login.sendKeys("rust-shafik@yandex.ru"); password.sendKeys("2204", Keys.ENTER);

        heading.sendKeys("Новая заметка",Keys.ENTER); publish.click();







    }







}
