package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
    WebDriver driver = new ChromeDriver();



    WebElement yourAccount =driver.findElement(By.xpath("//span[text()='Sign in']"));
    WebElement userName = driver.findElement(By.xpath("//input[@id='user-identifier-input']"));
    WebElement passWord = driver.findElement(By.xpath("//input[@id='password-input']"));
    WebElement enter =driver.findElement(By.xpath("//div//button[@id='submit-button']"));





    public void Login(String login, String pass){
        yourAccount.click();
        userName.sendKeys(login);
        passWord.sendKeys(pass);
        enter.click();





    }


}
