package com.automation.pages;


import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CreateAccountPage extends Utility {


    public CreateAccountPage() {
        PageFactory.initElements(driver, this);
    }

    //gender
    @FindBy(xpath = "//input[@id='id_gender1']")
    WebElement title;

    public void clickTitle() {
        clickOnElement(title);
    }

    //first namme
    @FindBy(xpath = "//input[@id='customer_firstname']")
    WebElement name;

    public void enterFirstname(String text) {
        sendTextToElement(name, text);
    }

    //    last name
    @FindBy(xpath = "//input[@id='customer_lastname']")
    WebElement lastname;

    public void enterLastName(String text) {
        sendTextToElement(lastname, text);
    }

    //    password
    @FindBy(xpath = "//input[@id='passwd']")
    WebElement password;

    public void enterPassword(String text) {
        sendTextToElement(password, text);
    }

    //firstname1
    @FindBy(xpath = "//input[@id='firstname']")
    WebElement name1;

    public void enterName1(String text) {
        sendTextToElement(name1, text);
    }

    // lastname1
    @FindBy(xpath = "//input[@id='lastname']")
    WebElement getLastname;

    public void enaterLastname1(String text) {
        sendTextToElement(getLastname, text);
    }

    //address
    @FindBy(xpath = "//input[@id='address1']")
    WebElement address;

    public void enterAddress(String text) {
        sendTextToElement(address, text);
    }

    //city
    @FindBy(xpath = "//input[@id='city']")
    WebElement city;

    public void enterCity(String text) {
        sendTextToElement(city, text);
    }

    // state
    @FindBy(xpath = "//select[@id='id_state']")
    WebElement state;

    public void selectState(String text) {
        selectByVisibleTextFromDropDown(state, text);
    }

    //postcode
    @FindBy(xpath = "//input[@id='postcode']")
    WebElement postcode;
    public void enterPostCode(String text){
        sendTextToElement(postcode,text);
    }

//    country
    @FindBy(xpath ="//select[@id='id_country']")
    WebElement country;
    public void selectCountry(String text){
        selectByVisibleTextFromDropDown(country,text);
    }

    //phone
    @FindBy(xpath = "//input[@id='phone_mobile']")
WebElement phone;
    public void enterPhoneNumber(String text){
        sendTextToElement(phone,text);
    }

//alisref
    @FindBy(xpath = "//input[@id='phone_mobile']")
WebElement alisRef;
    public void enterAliasAddress(String text){
        sendTextToElement(alisRef,text);
    }

    //register btn
    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[4]/button[1]/span[1]")
WebElement reg;
    public void clickRegisterBtn(){
        clickOnElement(reg);
    }



















}
