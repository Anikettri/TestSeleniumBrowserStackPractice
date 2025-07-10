package tests;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductPage;
import utils.WaitUtils;

import java.util.List;

public class ProductTest extends BasePage {
    @Test
    public void testProductDetailsPriceSorting(){
        HomePage homePage = new HomePage(driver);
        ProductPage productPage = new ProductPage(driver);
        homePage.setInputSearchBox("iphone 15");
        homePage.searchEnteredValue();
        WaitUtils.waitForPageLoad(driver);
        productPage.sortBy("Price: Low to High");
        WaitUtils.waitForPageLoad(driver);
        List<Double> productPricesDetails = productPage.getProductPrice();
        for (Double productPricesDetail : productPricesDetails) {
            System.out.println("Product Price Details : " + productPricesDetail);
        }
        WaitUtils.waitForPageLoad(driver);
        System.out.println("------------------------------------->"+productPricesDetails.size());
        Assert.assertTrue(productPage.isSortedAscending(productPricesDetails));
    }
}
