package com.automation.pages;


import com.automation.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class WomenCategoryPage extends Utility {


    public WomenCategoryPage() {
        PageFactory.initElements(driver, this);
    }

//    WOMEN text
    @FindBy(xpath = "//h2[contains(text(),'Women')]")
    WebElement womentext;
    public String verifyWomenText(){
        return getTextFromElement(womentext);
    }

//    TOPS
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/div[2]/ul[1]/li[1]/h5[1]/a[1]")
    WebElement tops;
    public void clickTopsLink(){
        clickOnElement(tops);
    }

//    DRESSES
@FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/div[2]/ul[1]/li[2]/h5[1]/a[1]")
WebElement dresses;
    public void clickdressesLink() {
        clickOnElement(dresses);
    }

//    SortBy drop down,
        @FindBy(xpath = "//select[@id='selectProductSort']")
        WebElement sortBy;

        public void selectSortBy (String text){
        selectByVisibleTextFromDropDown(sortBy,text);
        }

//        Click on the product "product"
//@FindBy(partialLinkText = "Blouse")
//    WebElement product;
//        public void clickProduct(String text){
//            sendTextToElement(product,text);
//            clickOnElement(product);
//        }

//        Change quantity "qty"
    @FindBy(xpath = "//input[@id='quantity_wanted']")
    WebElement qty;
        public void enterQty(String text){
            clearValue(By.xpath("//input[@id='quantity_wanted']"));
            sendTextToElement(qty,text);
        }


//        Select size "size"
@FindBy(xpath = "//select[@id='group_1']")
WebElement size;
    public void enterSize (String text){
        selectByVisibleTextFromDropDown(size,text);
    }

//        Select colour "colour"
//@FindBy(name = "White")

//
//WebElement colour;
//    public void selectColour(String text){
//           clickOnElement(colour);
//    }

//        Click on Add To Cart Button
    @FindBy(xpath = "//span[contains(text(),'Add to cart')]")
WebElement addtocart;
    public void clickaddTocart(){
        clickOnElement(addtocart);
    }


//        Vetify the message "Product successfully added to your shopping cart"
    @FindBy(xpath = "//body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[4]/div[1]/div[1]/h2[1]")
    WebElement successfullyadded;
    public String verifySuccessfullyAdded(){
        return getTextFromElement(successfullyadded);
    }

//        Click on X button and close the popup
@FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[4]/div[1]/div[1]/span[1]")
WebElement bTm;
    public void clickXBtn(){
        clickOnElement(bTm);
    }

//    @FindBy(partialLinkText = "Blouse")

    public void clickProduct(String text){
        clickOnElement(By.partialLinkText(text));
    }

    public void selectColour(String text){
        clickOnElement(By.name(text));
    }

}
