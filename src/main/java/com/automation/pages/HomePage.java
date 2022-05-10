package com.automation.pages;


import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends Utility {


    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    //WOMEN
    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/a[1]")
    WebElement womenLink;
    public void clickWomenLink(){
        clickOnElement(womenLink);
    }

    // DRESSES
    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]")
    WebElement dressLink;
    public void clickDresseslink(){
        clickOnElement(dressLink);
    }
    // T-SHIRTS
    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[3]/a[1]")
    WebElement tShirtLink;
    public void clickTShirtLink(){
        clickOnElement(tShirtLink);
    }
    // Sign in Links
    @FindBy(xpath = "//a[contains(text(),'Sign in')]")
    WebElement singinLink;
    public void clickSignInLink(){
        clickOnElement(singinLink);
    }
    public String verifySignInLink(){
        return getTextFromElement(singinLink);
    }



    // and logo locatores and create appropriate methods for it


}
