$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/demo/orangehrm/resources/featurefile/leave.feature");
formatter.feature({
  "line": 1,
  "name": "Orangehrm Leave Test",
  "description": "As a user I want to navigate to login page successfully",
  "id": "orangehrm-leave-test",
  "keyword": "Feature"
});
formatter.uri("src/test/java/com/demo/orangehrm/resources/featurefile/login.feature");
formatter.feature({
  "line": 1,
  "name": "Orangehrm Login Test",
  "description": "As a user I want to navigate to login page successfully",
  "id": "orangehrm-login-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 13271070000,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 4,
      "value": "#  Scenario: user should navigate to login page successfully"
    },
    {
      "line": 5,
      "value": "#    Given I am on home page"
    },
    {
      "line": 6,
      "value": "#    When I enter username \"Admin\""
    },
    {
      "line": 7,
      "value": "#    And I enter password \"admin123\""
    },
    {
      "line": 8,
      "value": "#    And I click on login button"
    },
    {
      "line": 9,
      "value": "#    Then I should see the \"Welcome Admin\" text"
    }
  ],
  "line": 11,
  "name": "verify text when user logout",
  "description": "",
  "id": "orangehrm-login-test;verify-text-when-user-logout",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I enter username \"Admin\"",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I enter password \"admin123\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I click on welcome admin button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I click on logout button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "verify \"LOGIN Panel\" text",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iAmOnHomePage()"
});
formatter.result({
  "duration": 93239800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 18
    }
  ],
  "location": "MyStepdefs.iEnterUsername(String)"
});
formatter.result({
  "duration": 109042300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin123",
      "offset": 18
    }
  ],
  "location": "MyStepdefs.iEnterPassword(String)"
});
formatter.result({
  "duration": 74792400,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnLoginButton()"
});
formatter.result({
  "duration": 4966395900,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnWelcomeAdminButton()"
});
formatter.result({
  "duration": 83592900,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnLogoutButton()"
});
formatter.result({
  "duration": 11561472500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "LOGIN Panel",
      "offset": 8
    }
  ],
  "location": "MyStepdefs.verifyText(String)"
});
formatter.result({
  "duration": 44271300,
  "status": "passed"
});
formatter.after({
  "duration": 637148500,
  "status": "passed"
});
});