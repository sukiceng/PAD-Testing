Feature: Add New User
  Scenario: Admin adds a new user
    Given Admin is logged in
    When Admin navigates to the user management page
    And Admin clicks on the 'Add New' button
    And Admin enters user details
    And Admin submits the form
    Then The new user should be added successfully
