/*
 * This class contains test cases for the LoginPage functionalities.
 * It includes methods for:
 *   - Setting up the test environment before each test method execution
 *   - Testing the title of the login page
 *   - Performing customer login
 *   - Logging in with customer credentials and performing further verifications
 */

package com.xyz.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.xyz.qa.base.TestBase;
import com.xyz.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
    LoginPage loginPage;
    
    public LoginPageTest() {
        super();
    }
    
    // Setting up the test environment before each test method execution
    @BeforeMethod
    public void setUp() {
        initialization();
        loginPage = new LoginPage(); 
    }
    
    // Testing the title of the login page
    @Test
    public void loginPageTitleTest() {
        String title = loginPage.loginPageTitle();
        Assert.assertEquals(title, "XYZ Bank");
    }
    
    // Performing customer login
    @Test
    public void customerLoginTest() {
        loginPage.customerLogin();
        // You can add assertions or further verifications here to ensure successful customer login
    }
    
    // Logging in with customer credentials and performing further verifications
    @Test(priority=1)
    public void loginTest() {
        loginPage.customerLogin();
        loginPage.selectCustomer("Harry Potter");
        loginPage.clickLoginButton();
        // You can add assertions or further verifications here to ensure successful login
    }
    
    // Closing the browser after each test method execution
   // @AfterMethod
   // public void tearDown() {
   //     driver.quit();
   // }
}
