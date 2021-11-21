import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;


public class Main {
    public static void main(String [] args) {

       // System.setProperty("webdriver.chrome.driver", "/Users/rustamsafikov/Downloads/chromedriver");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //ChromeOptions chromeOptions = new ChromeOptions();
        //chromeOptions.addArguments("incognito");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       //WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(5));





        driver.get("https://crm.geekbrains.space/user/login");
        driver.findElement(By.name("_username")).sendKeys("Applanatest1");
        driver.findElement(By.id("prependedInput2")).sendKeys("Student2020!");
        WebElement checkBox = driver.findElement(By.id("remember_me"));
        checkBox.click();
        WebElement enter = driver.findElement(By.name("_submit"));
        enter.click();

        WebElement proekti = driver.findElement(By.xpath("//*[@id=\"oroplatform-header\"]/div[1]/div/ul/li[3]/a"));
        proekti.click();
        WebElement spisok = driver.findElement(By.xpath("//div[@class='tab-pane active'] //ul['extra-list']//li['first']//a[@href='/project/my']"));
        spisok.click();
        WebElement moiProekti=driver.findElement(By.xpath("//div[@class='pull-left btn-group icons-holder']//a['/project/create/']"));
        moiProekti.click();
        WebElement CreateProject= driver.findElement(By.xpath("//div[@class='pull-left btn-group icons-holder']//a[@href='/project/create/']"));
        CreateProject.click();

        // "Эти элементы уже не запускаются Nomination это-Наименование,organization-организация,последний элемент-вкладка Адреса офисов
        WebElement Nomination = driver.findElement(By.xpath("//*[@id=\"crm_project-uid-6197f2438d5fd\"]/div[2]/div[3]/div/div[1]/div[2]/fieldset/div[1]/div[1]/div[2]"));
        Nomination.click();
        Nomination.sendKeys("Mobile");

        driver.findElement(By.xpath("//div//a[@href='#scroll-2-1050']")).click();
        WebElement organization = driver.findElement(By.xpath("//*[@id=\"s2id_crm_project_company-uid-61987ea3c3e81\"]/a/span[1]"));
        organization.click();

        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[3]/form/div[2]/div[2]/div/div/ul/li[2]/a")).click();

        driver.quit(); //не закрывает драйвер/








    }
}
