Feature: User - First name
  Scenario: User - First name alphanumeric and special characters
    Given I navigate to "registration" page
    And I type first name "Abc123$"
    And I type last name "Abcd"
    And I type group code "SSS"
    And I type email "email@gmail.com" on "registration" page
    And I type password "12345" on "registration" page
    And I type confirm password "12345"
    And I click Register me button
    Then message "You have been Registered." appears

  Scenario: User - First name -Field is required
    Given I navigate to "registration" page
    And I type first name ""
    And I type last name "Abcd"
    And I type group code "SSS"
    And I type email "email@gmail.com" on "registration" page
    And I type password "12345" on "registration" page
    And I type confirm password "12345"
    And I click Register me button
    Then message "This field is required" appears


Scenario Outline: User -First Name 1
  Given I navigate to "registration" page
  And I type first name "<FirstName>"
  And I type last name "<LastName>"
  And I type group code "<GroupCode>"
  And I type email "<Email>" on "registration" page
  And I type password "<Password>" on "registration" page
  And I type confirm password "<ConfirmPass>"
  And I click Register me button
  Then message "<Message>" appears
  Examples:

    |  FirstName|LastName | GroupCode| Email      |Password |ConfirmPass | Message |
    |abc123*    |asd      |qwe       |asd@asd.com |12345    |12345       |You have been Registered.|
    |           |asd      |qwe       |asd@asd.com |12345    |12345       |This field is required|
    |a          |asd      |qwe       |asd@asd.com |12345    |12345       |You have been Registered.|
    |a          |asd      |qwe       |asd@asd.com |12345    |12345       |You have been Registered.|
    |a          |asd      |qwe       |asd@asd.com |12345    |12345       |You have been Registered.|




