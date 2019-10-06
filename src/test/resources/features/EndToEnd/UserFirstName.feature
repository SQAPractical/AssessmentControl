Feature: User - First name
  
  Scenario: User - First name - Alphanumeric and special characters
    Given I navigate to "registration" page
    And I type first name "Sofia123$"
    And I type last name "Abc"
    And I type group code "Abc"
    And I type email "email@gmail.com" on "registration" page
    And I type password "12345" on "registration" page
    And I type Confirm password "12345"
    And I click on Register me button
    Then message "You have been Registered." appears

  Scenario: User - First name - Field is required
    Given I navigate to "registration" page
    And I type first name ""
    And I type last name "Abc"
    And I type group code "Abc"
    And I type email "email@gmail.com" on "registration" page
    And I type password "12345" on "registration" page
    And I type Confirm password "12345"
    And I click on Register me button
    Then message "This field is required" appears


  Scenario Outline: User - First Name 1
    Given I navigate to "registration" page
    And I type first name "<FirstName>"
    And I type last name "<LastName>"
    And I type group code "<GroupCode>"
    And I type email "<Email>" on "registration" page
    And I type password "<Password>" on "registration" page
    And I type Confirm password "<ConfirmPass>"
    And I click on Register me button
    Then message "<Message>" appears
    Examples:
      |  FirstName |  LastName | GroupCode | Email  | Password | ConfirmPass | Message |
      |  abc@1234* | df        | qwe       | fghg@gh| 12345    | 12345       |You have been Registered.|
      |            | df        | qwe       | fghg@gh| 12345    | 12345       |This field is required   |
      |     w      | df        | qwe       | fghg@gh| 12345    | 12345       |You have been Registered.|




