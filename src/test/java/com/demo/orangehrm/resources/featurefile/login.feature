Feature: Orangehrm Login Test
  As a user I want to navigate to login page successfully

  Scenario: user should navigate to login page successfully
    Given I am on home page
    When I enter username "Admin"
    And I enter password "admin123"
    And I click on login button
    Then I should see the "Welcome Admin" text

    Scenario: verify text when user logout
      Given I am on home page
      When I enter username "Admin"
      And I enter password "admin123"
      And I click on login button
      And I click on welcome admin button
      And I click on logout button
      Then verify "LOGIN Panel" text

