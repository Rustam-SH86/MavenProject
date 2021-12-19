package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class AbstractTest {
    static WebDriver driver;
    @BeforeAll
    static  void setDriver(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options= new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");
        //options.setHeadless(true);
        driver= new ChromeDriver(options);
        options.setPageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    }

   @AfterAll
    public static void stopAndExit(){
        if(driver != null)
            driver.quit();
    }




}
