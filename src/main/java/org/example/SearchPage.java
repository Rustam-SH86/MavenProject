package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
    private WebDriver driver;
    private WebElement search;



    public SearchPage(WebDriver driver){
        this.driver=driver;
        search = driver.findElement(By.xpath("//div//input[@id='orb-search-q']"));



    }

    void searchSomething(WebElement driver, WebElement search){

        search.click();
        search.sendKeys("Hello");

    }


}
