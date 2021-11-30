package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class LoginPageTest {
    ChromeDriver driver;
   // private static Logger logger = LoggerFactory.getLogger(LoginPageTest.class);
  @BeforeAll
  public void setupRER() {
      WebDriverManager.chromedriver().setup();
      driver = new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));}
    @BeforeEach
      public void start() {
          System.out.println("Start testing");
  }



  @Test
      void LoginIn() {

          driver.get("https://account.bbc.com/signin?realm=%2F&clientId=Account&context=homepage&ptrt=https%3A%2F%2Fwww.bbc.com%2F&userOrigin=HOMEPAGE_GNL&isCasso=false&action=sign-in&redirectUri=https%3A%2F%2Fsession.bbc.com%2Fsession%2Fcallback%3Frealm%3D%2F&service=IdSignInService&nonce=dNnmSVuC-IXpQxUKyF-ovQdJNAyzzuXiRfAc");
          LoginPage page = new LoginPage(driver);
          page.LoginIn("rust-shafik@yandex.ru", "rustam2204");
          new WebDriverWait(driver, Duration.ofSeconds(10));







  }
  @AfterAll
    void stop(){

      System.out.println("Test stopped");
      driver.quit();
  }


  }




