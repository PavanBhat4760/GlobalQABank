/*
 * This class represents the customer account page in the XYZ application.
 * It contains methods to interact with elements on the customer account page, such as header name, customer name,
 * and buttons to navigate to transaction, deposit, and withdrawal pages.
 */

package com.xyz.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.xyz.qa.base.TestBase;

public class CustomerAccountPage extends TestBase {

    // Page Factory - Object Repository:
    @FindBy(xpath="//strong[@class='mainHeading']")
    WebElement headerName;

    @FindBy(xpath="//span[@class='fontBig ng-binding']")
    WebElement customerName;

    @FindBy(xpath="//button[normalize-space()='Transactions']")
    WebElement transactionButton;

    @FindBy(xpath="//button[normalize-space()='Deposit']")
    WebElement depositButton;
    
    @FindBy(xpath="//button[normalize-space()='Withdrawl']")
    WebElement withdrawalButton;

    // Initializing the Page Objects:
    public CustomerAccountPage(){
        PageFactory.initElements(driver, this);
    }

    // Method to get the header name
    public String getHeaderName() {
        return headerName.getText();
    }

    // Method to get the customer name
    public String getCustomerName() {
        return customerName.getText();
    }

    // Method to click on the transaction button and return to the transaction page
    public TransactionPage clickTransactionButton(){
        transactionButton.click();
        return new TransactionPage();
    }
    
    // Method to click on the deposit button and return to the deposit page
    public DepositPage clickDepositButton(){
        depositButton.click();
        return new DepositPage();
    }

    // Method to click on the withdrawal button and return to the withdrawal page
    public WithdrawPage clickWithdrawButton(){
        withdrawalButton.click();
        return new WithdrawPage();
    }
}
