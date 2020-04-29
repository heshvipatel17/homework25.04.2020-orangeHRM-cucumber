package com.demo.orangehrm.cucumber.stepdefs;

import com.demo.orangehrm.pages.LeaveListPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class LeaveSteps {

    @And("^I click on leave list$")
    public void iClickOnLeaveList() {
        new LeaveListPage().clickOnLeaveListLink();
    }

    @Then("^verify employee \"([^\"]*)\" text$")
    public void verifyEmployeeText(String leaveStatusTxt) {
        Assert.assertEquals(new LeaveListPage().getShowLeaveWithStatusText(),leaveStatusTxt);

    }

    @And("^I enter employee name \"([^\"]*)\"$")
    public void iEnterEmployeeName(String employeeName){
        new LeaveListPage().enterEmployeeName("Linda Anderson");

    }

    @And("^I click on search button$")
    public void iClickOnSearchButton() {
        new LeaveListPage().clickOnSearchButton();
    }

    @Then("^verify serach result of employee name \"([^\"]*)\"$")
    public void verifySerachResultOfEmployeeName(String empName){
        Assert.assertEquals(new LeaveListPage().verifyEmployeeName(),empName);

    }
}