package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
    @FindBy(xpath = "//div//a[@href='/events']")
    WebElement events;

    public NavigateBar(WebDriver driver){
        super(driver);

    }
    void clickPopular(){
        popular.click();

    }
    void clickNewest(){

        newest.click();
    }
    void clickCompany(){

        company.click();
    }
    void clickVacancies(){

        vacancies.click();
    }
    void clickEvents(){

        events.click();
    }




}
