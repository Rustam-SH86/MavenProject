package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;


public class LoginPageTest {
    ChromeDriver driver;
   // private static Logger logger = LoggerFactory.getLogger(LoginPageTest.class);

    @Test
     void registration (){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.bbc.com/");
        driver.quit();

    }



}



