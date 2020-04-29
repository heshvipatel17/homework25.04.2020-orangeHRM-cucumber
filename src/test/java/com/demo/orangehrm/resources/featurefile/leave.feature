Feature: Orangehrm Leave Test
  As a user I want to navigate to login page successfully

  Scenario: user should navigate to employee leave page successfully
    Given I am on home page
    When I enter username "Admin"
    And I enter password "admin123"
    And I click on login button
    And I click on leave list
    Then verify employee "Show Leave with Status" text

    Scenario: user should search employee successfully
      Given I am on home page
      When I enter username "Admin"
      And I enter password "admin123"
      And I click on login button
      And I click on leave list
      And I enter employee name "Linda Anderson"
      And I click on search button
      Then verify serach result of employee name "Linda Anderson"

