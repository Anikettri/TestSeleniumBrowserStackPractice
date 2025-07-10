package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class ProductPage {
    WebDriver driver;
    @FindBy(css="select[id=\"s-result-sort-select\"]")
    WebElement productSorting;

    @FindBy(css="div[data-cy=\"title-recipe\"]>a>h2>span")
    List<WebElement> productNameDetails;

    @FindBy(css="a[aria-describedby=\"price-link\"]>span>span>span[class=\"a-price-whole\"]")
    List<WebElement> productPriceDetails;

    public ProductPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public void sortBy(String option){
        Select select = new Select(productSorting);
        select.selectByVisibleText(option);
    }
    public List<String> getProductTitles(){
        List<String> productTitles = new ArrayList<>();
        for(WebElement productName : productNameDetails){
            productTitles.add(productName.getText());
        }
        return productTitles;
    }
    public List<Double> getProductPrice(){
        WebDriverWait myWait = new WebDriverWait(driver,Duration.ofSeconds(15));
        myWait.until(ExpectedConditions.visibilityOfAllElements(productPriceDetails));
        List<Double> productPrices = new ArrayList<>();
        for(WebElement productPrice : productPriceDetails){
            productPrices.add(Double.parseDouble(productPrice.getText().replace(",","")));
        }
        return productPrices;
    }
    public boolean isSortedAscending(List<Double> prices){
        for(int i=0;i<prices.size()-1;i++){
            if(prices.get(i)>prices.get(i+1)){
                return false;
            }
        }
        return true;
    }


}
