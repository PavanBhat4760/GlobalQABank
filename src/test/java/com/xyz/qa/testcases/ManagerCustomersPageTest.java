package com.xyz.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.xyz.qa.base.TestBase;
import com.xyz.qa.pages.ManagerCustomersPage;

public class ManagerCustomersPageTest extends TestBase {
    ManagerCustomersPage customersPage;
    
    public ManagerCustomersPageTest() {
        super();
    }
    
    @BeforeMethod
    public void setUp() {
        initialization();
        customersPage = new ManagerCustomersPage(); 
    }
    
    @Test
    public void verifyCustomerDetailsAndDelete() {
        // Click on Bank Manager Login
        customersPage.clickBankManagerLoginButton();
        
        // Click on Customers
        customersPage.clickCustomersButton();
        
        // Search for customer by name
        customersPage.searchCustomer("Neville");
        
        // Verify customer details
        String firstName = customersPage.getFirstName();
        String lastName = customersPage.getLastName();
        String postCode = customersPage.getPostCode();
        String accountNumber = customersPage.getAccountNumber();
        
        Assert.assertEquals(firstName, "Neville");
        Assert.assertEquals(lastName, "Longbottom");
        Assert.assertEquals(postCode, "E89898");
        Assert.assertEquals(accountNumber, "1013 1014 1015");
        
        // Click on Delete
        customersPage.clickDeleteButton();
    }
    
   // @AfterMethod
   // public void tearDown() {
    //    driver.quit();
   // }
}
