import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;


public class Main {

   /*public static void main(String[] args) {


         System.setProperty("webdriver.chrome.driver", "/Users/rustamsafikov/Downloads/chromedriver");
        //WebDriverManager.chromedriver().setup();
        //WebDriver driver = new ChromeDriver();
        //ChromeOptions chromeOptions = new ChromeOptions();
        //chromeOptions.addArguments("incognito");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(5));

        driver.get("https://vc.ru/");
        WebElement enter = driver.findElement(By.xpath("//div[@class='site-header-user-login']"));
        enter.click();
        WebElement email= driver.findElement(By.xpath("//div//button[@class='v-button v-button--default v-button--size-default auth-social__button auth-social__button--email auth-social__button--with-label']"));
        email.click();
        WebElement TabEnter = driver.findElement(By.xpath("//div//button[@class='t-link-inline']"));
        TabEnter.click();
        WebElement ViaEmail = driver.findElement(By.xpath("//div//button[@data-gtm='Login — Mail — Click']"));
        ViaEmail.click();
        WebElement Login = driver.findElement(By.name("login"));
        Login.sendKeys("Rust-shafik@yandex.ru");
        WebElement Password = driver.findElement(By.name("password"));
        Password.sendKeys("2204");
        WebElement Voiti = driver.findElement(By.xpath("//div//button[@data-gtm='Login Mail — Login — Click']"));
        Voiti.click();

        //Дальше не тестится

        WebElement search=driver.findElement(By.xpath("//html/body/div[2]/div[3]/div/div[2]/div/div/label/input"));
        search.click();
        search.sendKeys("McDonald's", Keys.ENTER); //строка поиска


        //Блог тестов для кнопки Создать запись и в нем создать Заголовок и текст
        WebElement NewNote = driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/a"));
        NewNote.click();
        WebElement title = driver.findElement(By.xpath("/html/body/div[7]/div[2]/div[1]/div/div/div[2]/div/div/div[3]/div/div[1]/div/textarea"));
        title.click();
        title.sendKeys("My new blog");
        WebElement text = driver.findElement(By.xpath("/html/body/div[7]/div[2]/div[1]/div/div/div[2]/div/div/div[3]/div/div[2]/div/div[1]/div[1]/div[3]/div"));
        title.click();
        text.sendKeys("My first word");
        WebElement cross = driver.findElement(By.xpath("/html/body/div[7]/div[2]/div[1]/div/div/div[1]/div[2]"));
        cross.click();

        driver.quit();//не закрывает тест
        Actions builder = new Actions(driver);








    }*/}


