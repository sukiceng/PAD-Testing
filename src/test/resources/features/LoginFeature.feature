Feature: Admin Login

  Scenario: Login as Admin with valid credentials
    Given user is on home page
    When user enters "jakubowski.dock@example.org" as email
    And user enters "password" as password
    And user clicks submit button
    Then user is redirected to dashboard page
    And dashboard page URL should be "https://syauqi.codecrab.my.id/dashboard"

    Scenario: Login as admin with invalid
