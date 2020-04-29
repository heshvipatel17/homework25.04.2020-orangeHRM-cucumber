package com.demo.orangehrm.pages;

import com.cucumber.listener.Reporter;
import com.demo.orangehrm.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy(css = "input#txtUsername")
    WebElement _usernameField;

    @FindBy(css = "input#txtPassword")
    WebElement _passwordField;

    @FindBy(css = "input.button")
    WebElement _loginBtn;

    @FindBy(xpath = "//div[@id='logInPanelHeading']")
    WebElement _loginPanelText;

    public void clickAndSendTextToUsernameField(String userName) {
        Reporter.addStepLog(" Enter email:" + userName + " into the field " + _usernameField.toString());
        sendTextToElement(_usernameField, userName);
        log.info(" Enter email:" + userName + " into the field " + _usernameField.toString());
    }

    public void clickAndSendTextToPasswordField(String passwd) {
        Reporter.addStepLog(" Enter password:" + passwd + " into the field " + _passwordField.toString());
        sendTextToElement(_passwordField, passwd);
        log.info(" Enter password:" + passwd + " into the field " + _passwordField.toString());
    }

    public void clickOnLoginBtn() {
        Reporter.addStepLog(" Click on login button " + _loginBtn.toString());
        clickOnElement(_loginBtn);
        log.info(" Click on login button " + _loginBtn.toString());
    }
    public String getLoginPanelText() {
        Reporter.addStepLog(" Verify login panel text " + _loginPanelText.toString());
        log.info(" Verify login panel text " + _loginPanelText.toString());
        return getTextFromElement(_loginPanelText);
    }

}
