package com.automation.pages;

import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage extends Utility {

    public MyAccountPage() {
        PageFactory.initElements(driver, this);
    }

    //    Verify that Sign out link is displayed
    @FindBy(xpath = "//header/div[2]/div[1]/div[1]/nav[1]/div[2]/a[1]")
    WebElement signout;
    public String verifySignOut(){
        return getTextFromElement(signout);
    }
    //    Click on Sign out Link
    public void clickSignOut(){
        clickOnElement(signout);
    }

    //    Verify message "My Account"
    @FindBy(xpath = "//h1[contains(text(),'My account')]")
    WebElement myacc;
    public String verifyMyAccountText(){
        return getTextFromElement(myacc);
    }




}
