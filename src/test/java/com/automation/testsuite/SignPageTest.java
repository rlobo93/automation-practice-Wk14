package com.automation.testsuite;


import com.automation.pages.HomePage;
import com.automation.pages.MyAccountPage;
import com.automation.pages.SignInPage;
import com.automation.testbase.TestBase;
import com.google.common.base.Verify;
import org.junit.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;


public class SignPageTest extends TestBase {
    HomePage homePage;
    SignInPage signInPage;
    MyAccountPage myAccountPage;



    @BeforeMethod
    public void inIt() {
        homePage = new HomePage();
        signInPage = new SignInPage();
        myAccountPage = new MyAccountPage();
    }

    @Test(groups ={"sanity", "regression"})
    public void userShouldNavigateToSignInPageSuccessFully() {
//        Click on Sign In link
        homePage.clickSignInLink();
//        verify that "AUTHENTICATION" message is displayed
        String expectedMessage = "AUTHENTICATION";
        String actualMessage = signInPage.verifyAutenticationText();
        Assert.assertEquals(expectedMessage, actualMessage);

    }
@Test(dataProvider = "login", dataProviderClass = TestData.class, groups ={"sanity","smoke", "regression"} )
    public void verifyTheErrorMessageWithInValidCredentials(String username, String password, String message) {
//        Click on sign in link
        homePage.clickSignInLink();
//        Enter "username"
        signInPage.enterEmail(username);
//        Enter "password"
        signInPage.enterPassword(password);
//        Click on Sign in Button
        signInPage.clickSignIn();
//        Verify the Error message "message"
    String actualMessage = signInPage.errorMessage(message);
      String expectedMessage = message;
         Assert.assertEquals(expectedMessage, actualMessage);

    }
@Test(groups ={"sanity", "smoke", "regression"})
public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials() {
//    Click on sign link
    homePage.clickSignInLink();
//    Enter EmailId
    signInPage.enterEmail("rl12@gamil.com");

//    Enter Password
    signInPage.enterPassword("123456");

//    Click on Sign Button
    signInPage.clickSignIn();

//    Verify that Sign out link is displayed
    String expectedMessage = "Sign out";
    String actualMessage = myAccountPage.verifySignOut();
    Assert.assertEquals(expectedMessage, actualMessage);

}
@Test(groups ={"sanity", "smoke", "regression"})
public void verifyThatUserShouldLogOutSuccessFully() {
//    Click on sign link
    homePage.clickSignInLink();
//    Enter EmailId
    signInPage.enterEmail("rl12@gamil.com");

//    Enter Password
    signInPage.enterPassword("123456");

//    Click on Sign Button
    signInPage.clickSignIn();

//    Click on Sign out Link
    myAccountPage.clickSignOut();

//    Verify that Sign In Link displayed
    String expectedMessage = "Sign in";
    String actualMessage = homePage.verifySignInLink();
    Assert.assertEquals(expectedMessage, actualMessage);

}






}
