Feature: User - First name
  Scenario: User - First name - Alphanumeric and special characters
    Given I navigate to "registration" page
    And I type first name "Na1a$ha"
    And I type last name "Mashevsky"
    And I type group code "SSS"
    And I type email "email1@gmail.com" on "registration" page
    And I type password "12345" on "registration" page
    And I type confirm password "12345"
    And I click Register Me button
    Then assert the message "You have been Registered." appears
  Scenario: User - First name - Field is required
    Given I navigate to "registration" page
    And I type first name ""
    And I type last name "Mashevsky"
    And I type group code "SSS"
    And I type email "email1@gmail.com" on "registration" page
    And I type password "12345" on "registration" page
    And I type confirm password "12345"
    And I click Register Me button
    Then assert the message "This field is required" appears


Scenario Outline: User - First Name 1 char
  Given I navigate to "registration" page
  And I type first name "<FirstName>"
  And I type last name "<LastName>"
  And I type group code "<GroupCode>"
  And I type email "<Email>" on "registration" page
  And I type password "<Password>" on "registration" page
  And I type confirm password "<ConfirmPass>"
  And I click Register Me button
  Then assert the message "<Message>" appears
  Examples:
    | FirstName | LastName | GroupCode | Email | Password | ConfirmPass | Message |
    | s0f1@     | teacher  | 111       | a@b.c | 12345    | 12345       | You have been Registered.|
    |           | teacher  | 111       | a@b.c | 12345    | 12345       | This field is required|
    | A         | teacher  | 111       | a@b.c | 12345    | 12345       | You have been Registered.|






  