Feature: add a new contact

@android  @web
  Scenario: Add a new contact
    Given I am on add user page
    When I click to add a contact
    And I complete the details
    Then I can save a new contact


