package com.demo.orangehrm.pages;

/* By Jitendra Patel */

import com.cucumber.listener.Reporter;
import com.demo.orangehrm.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeaveListPage extends Utility {

    private static final Logger log = LogManager.getLogger(LeaveListPage.class.getName());

    @FindBy(xpath = "//span[contains(text(),'Leave List')]")
    WebElement _leaveListLink;

    @FindBy(xpath = "//label[contains(text(),'Show Leave with Status')]")
    WebElement _showLeaveWithStatusText;

    @FindBy(xpath = "//input[@id='leaveList_txtEmployee_empName']")
    WebElement _searchEmployeeField;

    @FindBy(xpath = "//input[@id='btnSearch']")
    WebElement _searchButton;

    @FindBy(xpath = "//a[contains(text(),'Linda Anderson')]")
    WebElement _employeeName;

    public void clickOnLeaveListLink(){
     //   waitUntilElementToBeClickable(_leaveListLink, 20);
        Reporter.addStepLog(" clicking on leave list link"+_leaveListLink.toString());
        clickOnElement(_leaveListLink);
        log.info(" clicking on leave list link"+_leaveListLink.toString());
    }

    public String getShowLeaveWithStatusText(){
        Reporter.addStepLog("Get text from Employee leave page " + _showLeaveWithStatusText.toString());
        log.info("Get text from Employee leave page " + _showLeaveWithStatusText.toString());
        return getTextFromElement(_showLeaveWithStatusText);

    }
    public void enterEmployeeName(String empName){
        Reporter.addStepLog(" Enter employee name in leave list" + _searchEmployeeField.toString());
        sendTextToElement(_searchEmployeeField, empName);
        log.info(" Enter employee name in leave list" + _searchEmployeeField.toString());
    }
    public void clickOnSearchButton(){
        Reporter.addStepLog(" Clicking on search button" + _searchButton.toString());
        clickOnElement(_searchButton);
        log.info(" Clicking on search button" + _searchButton.toString());
    }
    public String verifyEmployeeName(){
        Reporter.addStepLog(" Verify employee name text " + _employeeName.toString());
        log.info(" Verify employee name text " + _employeeName.toString());
        return getTextFromElement(_employeeName);
    }
}