package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class NavigateBar extends AbstractPage{
    @FindBy(xpath = "//div//p[text()='Популярное']")
    WebElement popular;
    @FindBy(xpath = "//div//p[text()='Свежее']")
    WebElement newest;
    @FindBy(xpath = "//div//a[@href='/companies']")
    WebElement company;

    @FindBy(xpath = "(//div//a[@href='/job'])[1]")
    WebElement vacancies;
    @FindBy(xpath = "//div//p[text()='Мероприятия']")
    WebElement events;

    public NavigateBar(WebDriver driver){
        super(driver);

    }
    void clickNavigateBar(){
        Actions clickNavigateBar = new Actions(getDriver());
        clickNavigateBar.click(popular).click(newest).click(company).click(vacancies).click(events);



    }



}
