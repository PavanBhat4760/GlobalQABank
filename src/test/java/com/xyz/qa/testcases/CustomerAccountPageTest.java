/*
 * This class contains test cases for the CustomerAccountPage functionalities.
 * It includes methods for:
 *   - Setting up the test environment before each test method execution
 *   - Verifying customer account details such as header name and customer name
 *   - Clicking on deposit and withdraw buttons
 */

package com.xyz.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.xyz.qa.base.TestBase;
import com.xyz.qa.pages.CustomerAccountPage;
import com.xyz.qa.pages.LoginPage;

public class CustomerAccountPageTest extends TestBase {
    LoginPage loginPage;
    CustomerAccountPage accountPage;
    
    public CustomerAccountPageTest() {
        super();
    }
    
    // Setting up the test environment before each test method execution
    @BeforeMethod
    public void setUp() {
        initialization();
        loginPage = new LoginPage();
        accountPage = loginPage.loginAsCustomer("Harry Potter");
    }
    
    // Verifying customer account details such as header name and customer name
    @Test(priority=2)
    public void verifyCustomerAccountDetails() {
        String headerName = accountPage.getHeaderName();
        Assert.assertEquals(headerName, "XYZ Bank");

        String customerName = accountPage.getCustomerName();
        Assert.assertEquals(customerName, "Harry Potter");
        
        accountPage.clickDepositButton();
        accountPage.clickWithdrawButton();
    }
    
    // Closing the browser after each test method execution
    //@AfterMethod
    //public void tearDown() {
    //    driver.quit();
    //}
}
