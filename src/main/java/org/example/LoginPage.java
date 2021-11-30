package org.example;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

    private WebDriver driver;
    private WebElement loginInput;
    private WebElement passwordInput;
    private WebElement enter;
    private WebElement search;


    public LoginPage(WebDriver driver){
        this.driver = driver;
        loginInput = driver.findElement(By.xpath("//input[@type='email']"));
        passwordInput = driver.findElement(By.xpath("//input[@type='password']"));
        enter = driver.findElement(By.xpath("//div//button[@class='button button--full-width']"));



    }
    /*public LoginPage(WebDriver driver, WebElement loginInput, WebElement passwordInput, WebElement enter){
        this.driver = driver;
        this.loginInput = loginInput;
        this.passwordInput = passwordInput;
        this.enter = enter;

    }*/


    public void LoginIn (String login, String password){
        this.loginInput.click();
        this.loginInput.sendKeys("rust-shafik@yandex.ru");
        this.passwordInput.click();
        this.passwordInput.sendKeys("rustam2204");
        this.enter.click();


    }


    }

