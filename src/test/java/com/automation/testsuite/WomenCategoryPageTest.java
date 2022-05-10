package com.automation.testsuite;

import com.automation.pages.HomePage;
import com.automation.pages.MyAccountPage;
import com.automation.pages.SignInPage;
import com.automation.pages.WomenCategoryPage;
import com.automation.testbase.TestBase;
import com.google.common.base.Verify;
import org.junit.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;

public class WomenCategoryPageTest extends TestBase {

    HomePage homePage;
    WomenCategoryPage womenCategoryPage;


    @BeforeMethod
    public void inIt() {
        homePage = new HomePage();
        womenCategoryPage = new WomenCategoryPage();
    }

@Test(groups = {"sanity", "smoke", "regression"})
public void verifyUserShouldNavigateToWomenCategoryPageSuccessfully() {

//    Click on WOMEN tab
    homePage.clickWomenLink();

//    Verify "WOMWN" text
    String expectedMessage = "WOMEN";
    String actualMessage = womenCategoryPage.verifyWomenText();
    Assert.assertEquals(expectedMessage, actualMessage);
}

@Test(dataProvider = "product",dataProviderClass = TestData.class,groups = {"sanity", "smoke", "regression"})
    public void verifyUserShouldAddProductToTheCartSuccessfully(String product, String qty, String size, String colour)  {
//        Click on WOMEN tab
        homePage.clickWomenLink();
//        Click on the product "product"
        womenCategoryPage.clickProduct(product);

//        Change quantity "qty"
        womenCategoryPage.enterQty(qty);

//        Select size "size"
        womenCategoryPage.enterSize(size);

//        Select colour "colour"
        womenCategoryPage.selectColour(colour);

//        Click on Add To Cart Button
    womenCategoryPage.clickaddTocart();

//        Vetify the message "Product successfully added to your shopping cart"
    String expectedMessage = "Product successfully added to your shopping cart";
    String actualMessage = womenCategoryPage.verifySuccessfullyAdded();
    Assert.assertEquals(expectedMessage, actualMessage);


//        Click on X button and close the popup
    womenCategoryPage.clickXBtn();

    }

}
