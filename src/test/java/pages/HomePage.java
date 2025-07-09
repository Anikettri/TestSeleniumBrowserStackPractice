package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;
    @FindBy(css="input[id=\"twotabsearchtextbox\"]")
    WebElement inputSearchBox;

    @FindBy(css="input[id=\"nav-search-submit-button\"]")
    WebElement searchSubmitButton;

    public HomePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    public void setInputSearchBox(String inputValue){
        inputSearchBox.clear();
        inputSearchBox.sendKeys(inputValue);
    }
    public void searchEnteredValue(){
        searchSubmitButton.click();
    }
}
