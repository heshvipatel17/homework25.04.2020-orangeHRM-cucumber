package com.demo.orangehrm.pages;

import com.cucumber.listener.Reporter;
import com.demo.orangehrm.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends Utility {

    private static final Logger log = LogManager.getLogger(AccountPage.class.getName());

    @FindBy(css = "a.panelTrigger")
    WebElement _welcomeTxt;

//    @FindBy(xpath = "//a[@id='welcome']")
//    WebElement _welcomeTxt;

    @FindBy(xpath = "//a[contains(text(),'Logout')]")
    WebElement _logoutLink;

    @FindBy(xpath = "//td[2]//div[1]//a[1]//img[1]")
    WebElement _leaveSheetLink;

    public String getWelcomeText() {
    //    waitUntilElementToBeClickable(_welcomeTxt, 20);
        Reporter.addStepLog(" Verify text is displayed " + _welcomeTxt.toString());
        log.info(" Verify text is displayed " + _welcomeTxt.toString());
        return getTextFromElement(_welcomeTxt);
    }


//    public void verifyTextWelcomeAdmin(String welText) {
//        Reporter.addStepLog(" Verify text: " + welText + " is displayed " + _welcomeAdmin.toString() );
//        verifyText(_welcomeAdmin, welText);
//        log.info(" Verify text: " + welText + " is displayed " + _welcomeAdmin.toString());
//    }

    public void clickOnWelcomeAdmin() {
    //    waitUntilElementToBeClickable(_welcomeTxt, 20);
        Reporter.addStepLog(" Click on welcome admin button " + _welcomeTxt.toString());
        clickOnElement(_welcomeTxt);
        log.info(" Click on welcome admin button " + _welcomeTxt.toString());
    }

    public void clickOnLogoutLink() {
        waitUntilElementToBeClickable(_logoutLink, 20);
        Reporter.addStepLog(" Click on logout link " + _logoutLink.toString());
        clickOnElement(_logoutLink);
        log.info(" Click on logout link " + _logoutLink.toString());
    }
    public void clickOnlEaveSheetLink(){
        waitUntilElementToBeClickable(_leaveSheetLink, 20);
        Reporter.addStepLog(" Clicking on leave sheet"+ _leaveSheetLink.toString());
        clickOnElement(_leaveSheetLink);
        log.info("Clicking on leave sheet"+ _leaveSheetLink.toString());
    }

}
