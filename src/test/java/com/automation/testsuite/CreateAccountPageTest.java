package com.automation.testsuite;

import com.automation.pages.CreateAccountPage;
import com.automation.pages.HomePage;
import com.automation.pages.MyAccountPage;
import com.automation.pages.SignInPage;
import com.automation.testbase.TestBase;
import com.google.common.base.Verify;
import org.junit.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountPageTest extends TestBase {

    HomePage homePage;
    SignInPage signInPage;
    MyAccountPage myAccountPage;
    CreateAccountPage createAccountPage;



    @BeforeMethod
    public void inIt() {
        homePage = new HomePage();
        signInPage = new SignInPage();
        myAccountPage = new MyAccountPage();
        createAccountPage = new CreateAccountPage();

    }

@Test(groups = {"sanity","smoke","regression"})
public void verifyThatUserShouldCreateAccountSuccessfully() {
//    Click on Sign in Link
    homePage.clickSignInLink();

//    Enter email address & Click on "Create an account" button
    signInPage.clickCreateAccount("ron12345@gmail.com");

//    Fill all mandetory fields
    createAccountPage.clickTitle();
    createAccountPage.enterFirstname("Ron");
    createAccountPage.enterLastName("Jira");
    createAccountPage.enterPassword("r123456");
    createAccountPage.enterAddress("105 london street");
    createAccountPage.enterCity("london");
    createAccountPage.selectState("Louisiana");
    createAccountPage.enterPostCode("11111");
    createAccountPage.enterPhoneNumber("07123456789");

//    Click on "Register" button
    createAccountPage.clickRegisterBtn();

//    Verify message "My Account"
    String expectedMessage = "MY ACCOUNT";
    String actualMessage = myAccountPage.verifyMyAccountText();
    Assert.assertEquals(expectedMessage, actualMessage);
}



}
