package com.xyz.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.xyz.qa.base.TestBase;
import com.xyz.qa.pages.ManagerAddCustomerPage;

public class ManagerAddCustomerPageTest extends TestBase {
    ManagerAddCustomerPage addCustomerPage;
    
    public ManagerAddCustomerPageTest() {
        super();
    }
    
    @BeforeMethod
    public void setUp() {
        initialization();
        addCustomerPage = new ManagerAddCustomerPage(); 
    }
    
    @Test
    public void verifyAddCustomerAlertMessage() {
        // Click on Bank Manager Login
        addCustomerPage.clickBankManagerLoginButton();
        
        // Click on Add Customer
        addCustomerPage.clickAddCustomerButton();
        
        // Enter customer details
        addCustomerPage.enterFirstName("John");
        addCustomerPage.enterLastName("Doe");
        addCustomerPage.enterPostCode("12345");
        
        // Click on Add Customer button
        addCustomerPage.clickSubmitButton();
        
        // Get the alert message text
        String alertMessage = addCustomerPage.getAlertMessageText();
        
        // Assert the alert message text
        Assert.assertTrue(alertMessage.contains("Customer added successfully"));

        
        // Click OK on the alert
        addCustomerPage.acceptAlert();
    }
    
  //  @AfterMethod
   // public void tearDown() {
   //     driver.quit();
   // }
}
