/*
 * This class represents the page for adding a customer by the bank manager in the XYZ application.
 * It contains methods to interact with elements on the page, such as the bank manager login button,
 * add customer button, input fields for first name, last name, and post code, and the add customer button.
 */

package com.xyz.qa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.xyz.qa.base.TestBase;

public class ManagerAddCustomerPage extends TestBase {
    
    // Page Factory - Object Repository:
    @FindBy(xpath = "//button[normalize-space()='Bank Manager Login']")
    WebElement bankManagerLoginButton;
    
    @FindBy(xpath = "//button[normalize-space()='Add Customer']")
    WebElement addCustomerButton;

    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement firstNameInput;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement lastNameInput;

    @FindBy(xpath = "//input[@placeholder='Post Code']")
    WebElement postCodeInput;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement submitButton;

    // Initializing the Page Objects:
    public ManagerAddCustomerPage() {
        PageFactory.initElements(driver, this);
    }
    
    // Method to click the bank manager login button
    public void clickBankManagerLoginButton() {
        bankManagerLoginButton.click();
    }
    
    // Method to click the add customer button
    public void clickAddCustomerButton() {
        addCustomerButton.click();
    }
    
    // Method to enter the first name in the input field
    public void enterFirstName(String firstName) {
        firstNameInput.sendKeys(firstName);
    }

    // Method to enter the last name in the input field
    public void enterLastName(String lastName) {
        lastNameInput.sendKeys(lastName);
    }

    // Method to enter the post code in the input field
    public void enterPostCode(String postCode) {
        postCodeInput.sendKeys(postCode);
    }

    // Method to click the submit button to add the customer
    public void clickSubmitButton() {
        submitButton.click();
    }

    // Method to get the text of the alert message
    public String getAlertMessageText() {
        Alert alert = driver.switchTo().alert();
        return alert.getText();
    }

    // Method to accept the alert message
    public void acceptAlert() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
}
