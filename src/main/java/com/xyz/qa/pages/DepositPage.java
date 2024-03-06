/*
 * This class represents the deposit page in the XYZ application.
 * It contains methods to interact with elements on the deposit page, such as the deposit amount input field,
 * deposit button, and deposit status message.
 */

package com.xyz.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.xyz.qa.base.TestBase;

public class DepositPage extends TestBase {

    // Page Factory - Object Repository:
    @FindBy(xpath="//input[@placeholder='amount']")
    WebElement depositAmountInput;
    
    @FindBy(xpath="//button[@type='submit']")
    WebElement depositButton;
    
    @FindBy(xpath="//span[@class='error ng-binding']")
    WebElement depositStatusMessage;
    

    // Initializing the Page Objects:
    public DepositPage(){
        PageFactory.initElements(driver, this);
    }
    
    // Method to enter deposit amount
    public void enterDepositAmount(String amount) {
        depositAmountInput.sendKeys(amount);
    }
    
    // Method to click the deposit button
    public void clickDepositButton() {
        depositButton.click();
    }
    
    // Method to get the deposit status message
    public String getDepositStatusMessage() {
        return depositStatusMessage.getText();
    }  
}
