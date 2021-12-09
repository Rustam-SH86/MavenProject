package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class AbstractTest {
    static WebDriver driver;
    @BeforeAll
    static  void setDriver(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        ChromeOptions options= new ChromeOptions();
        options.addArguments("--incognito");
        options.setHeadless(true);
        options.setPageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    }
    @AfterAll
    public static void stopAndExit(){
        if(driver != null)
            driver.quit();
    }




}
