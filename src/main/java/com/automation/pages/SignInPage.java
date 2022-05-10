package com.automation.pages;


import com.automation.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class SignInPage extends Utility {

    public SignInPage() {
        PageFactory.initElements(driver, this);
    }

    //Email address,
    @FindBy(xpath = "//input[@id='email']")
    WebElement eamiladdress;
    public void enterEmail(String email){
        sendTextToElement(eamiladdress,email);
    }

    // Password,
            @FindBy(xpath = "//input[@id='passwd']")
            WebElement passwordfield;
    public void enterPassword(String password){
        sendTextToElement(passwordfield,password);
    }

    // Sign In Button,
    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/p[2]/button[1]/span[1]")
    WebElement signin;
    public void clickSignIn(){
        clickOnElement(signin);
    }

    // error message
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]")
    WebElement error;
    public String errorMessage(String text){
        return getTextFromElement(error);
    }


    // Create an account button and
            @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/button[1]/span[1]")
            WebElement createAccount;
    @FindBy(xpath = "//input[@id='email_create']")
    WebElement emailcreat;

    public void clickCreateAccount(String text){
        sendTextToElement(emailcreat,text);
        clickOnElement(createAccount);
    }


    //"AUTHENTICATION" text,

    @FindBy(xpath = "//h1[contains(text(),'Authentication')]")
    WebElement autentication;
    public String verifyAutenticationText(){
        return getTextFromElement(autentication);
    }

    // "CREATE AN ACCOUNT" text
            @FindBy(xpath = "//h3[contains(text(),'Create an account')]")
            WebElement getCreateAccount;
    public String verifyCreateAccountText(){
        return getTextFromElement(getCreateAccount);
    }

//    // Locators and create appropriate methods for it.
//





}
