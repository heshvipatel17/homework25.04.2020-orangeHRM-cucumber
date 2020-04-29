package com.demo.orangehrm.cucumber.stepdefs;/* By Jitendra Patel */

import com.demo.orangehrm.pages.AccountPage;
import com.demo.orangehrm.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MyStepdefs {

    @Given("^I am on home page$")
    public void iAmOnHomePage() {
    }

    @When("^I enter username \"([^\"]*)\"$")
    public void iEnterUsername(String userName) {
        new HomePage().clickAndSendTextToUsernameField(userName);

    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password) {
        new HomePage().clickAndSendTextToPasswordField(password);

    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        new HomePage().clickOnLoginBtn();
    }

    @Then("^I should see the \"([^\"]*)\" text$")
    public void iShouldSeeTheText(String welcomeTxt) {
        Assert.assertEquals(new AccountPage().getWelcomeText(), welcomeTxt);

    }

    @And("^I click on welcome admin button$")
    public void iClickOnWelcomeAdminButton() {
        new AccountPage().clickOnWelcomeAdmin();
    }

    @And("^I click on logout button$")
    public void iClickOnLogoutButton() {
        new AccountPage().clickOnLogoutLink();
    }

    @Then("^verify \"([^\"]*)\" text$")
    public void verifyText(String loginPanelTxt) {
        Assert.assertEquals(new HomePage().getLoginPanelText(),loginPanelTxt);

    }
}
