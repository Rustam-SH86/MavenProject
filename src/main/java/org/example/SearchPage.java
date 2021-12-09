package org.example;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
public class SearchPage extends AbstractPage{

    @FindBy(xpath = "//div//label[@class='v-text-input v-text-input--default v-text-input--icon-l']")
    private WebElement search;

    public SearchPage(WebDriver driver){
      super(driver);



    }
    public void SearchIn(){
        Actions SearchIn = new Actions(getDriver());
        SearchIn.click(search).sendKeys("Планшет", Keys.ENTER).build().perform();
    }






}
