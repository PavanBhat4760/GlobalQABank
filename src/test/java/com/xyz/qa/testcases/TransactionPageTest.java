package com.xyz.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.xyz.qa.base.TestBase;
import com.xyz.qa.pages.CustomerAccountPage;
import com.xyz.qa.pages.WithdrawPage;
import com.xyz.qa.pages.LoginPage;
import com.xyz.qa.pages.DepositPage;
import com.xyz.qa.pages.TransactionPage;

public class TransactionPageTest extends TestBase {
	public static long IMPLICIT_WAIT = 30;
    LoginPage loginPage;
    CustomerAccountPage accountPage;
    WithdrawPage withdrawPage;
    DepositPage depositPage;
    TransactionPage transactionPage;
    
    public TransactionPageTest() {
        super();
    }
    
    @BeforeMethod
    public void setUp() {
        initialization();
        loginPage = new LoginPage(); 
        accountPage = loginPage.loginAsCustomer("Hermoine Granger"); 
    }
    
    @Test(priority=5)
    public void depositWithdrawAndVerifyTransactions() {
        // Deposit
        
        // Go to transactions page
        transactionPage = accountPage.clickTransactionButton();
        
        //filter the date
        transactionPage.setStartDate("01-01-2015 00:00");

        transactionPage.setEndDate("03-01-2015 00:00");
    
        transactionPage.pageClick();
    }
    //@AfterMethod
    //public void tearDown() {
     //   driver.quit();
   // }
}
