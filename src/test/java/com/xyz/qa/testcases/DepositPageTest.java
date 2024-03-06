/*
 * This class contains test cases for the DepositPage functionalities.
 * It includes methods for:
 *   - Setting up the test environment before each test method execution
 *   - Depositing an amount and verifying the transaction
 */

package com.xyz.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.xyz.qa.base.TestBase;
import com.xyz.qa.pages.CustomerAccountPage;
import com.xyz.qa.pages.DepositPage;
import com.xyz.qa.pages.LoginPage;

public class DepositPageTest extends TestBase {
    LoginPage loginPage;
    CustomerAccountPage accountPage;
    DepositPage depositPage;
    
    public DepositPageTest() {
        super();
    }
    
    // Setting up the test environment before each test method execution
    @BeforeMethod
    public void setUp() {
        initialization();
        loginPage = new LoginPage(); 
        accountPage = loginPage.loginAsCustomer("Harry Potter"); 
    }
    
    // Depositing an amount and verifying the transaction
    @Test(priority=3)
    public void depositAmountAndVerifyTransaction() {
        // Click on deposit button
        depositPage = accountPage.clickDepositButton();
        
        // Enter deposit amount
        depositPage.enterDepositAmount("1000"); 
        
        // Click on deposit button
        depositPage.clickDepositButton();
        
        // Verify deposit status message
        String depositStatusMessage = depositPage.getDepositStatusMessage();
        Assert.assertEquals(depositStatusMessage, "Deposit Successful");
    }
    
    // Closing the browser after each test method execution
  //  @AfterMethod
  //  public void tearDown() {
  //      driver.quit();
  //  }
}
