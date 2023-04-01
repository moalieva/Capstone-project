Feature: Retail Account Page

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'eclipse.testing1@gmail.com' and password 'Tek123!@#$$'
    And User click on login button
    And User should be logged in into Account
    When User click on Account option

  Scenario: Verify User can update Profile Information
    When User click on Account option
    And User update Name 'Jasmine' and phone '6820082824'
    And User click on Update button
    Then User profile information should be updated

  @regression
  Scenario: Verify User can Update password
    And User enter below information
      | previousPassword           | newPassword  | confirmPassword |
      | eclipse.testing1@gmail.com | Tek123!@#$$# | Tek123!@#$$#    |
    And User click on Change Password button
    Then a message should be displayed 'Password Updated Successfully'

  Scenario: Verify User can add a payment method
    When User click on Account option
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard | expirationYear | expirationMonth | securityCode |
      | 5559394422229898 | Jasmine    |           2025 |              03 |          312 |
    And User click on Add your card button
    Then a message should be displayed'Payment Method added sucessfully'

  Scenario: Verify User can edit Debit or Credit card
    When User click on Account option
    And User click on Edit option of card section
    And User edit information with below data
      | cardNumber       | nameOnCard | expirationYear | expirationMonth | securityCode |
      | 5559394422229800 | Jasmine    |           2024 |              04 |          888 |
    And user click on Update Your Card button
    Then a message should be displayed 'Payment Method updated Successfully'

  Scenario: Verify User can remove Debit or Credit card
    When User click on Account option
    And User click on remove option of card section
    Then payment details should be removed

  Scenario: Verify User can add an Address
    When User click on Account option
    And User click on Add address option
    And User fill new address form with below information
      | country       | fullName    | phoneNumber | streetAddress | apt | city      | state    | zipCode |
      | United States | Jasmine Joy |  6820082824 | 721 Main      | 411 | Arlington | Virginia |   22204 |
    And User click Add Your Address button
    Then a message should be displayed 'Address Added Successfully'

  Scenario: Verify User can edit an Address added on account
    When User click on Account option
    And User click on edit address option
    And User edit address form with below information
      | country  | fullName    | phoneNumber | streetAddress | apt | city        | state       | zipCode |
      | Mongolia | Jasmine Joy |  6820082824 |           991 | 501 | Ulaanbaatar | Ulaanbaatar |   11000 |
    And User click update Your Address button
    Then a message should be displayed 'Address Updated Successfully'

  Scenario: Verify User can remove Address from Account
    When User click on Account option
    And User click on remove option of Address section
    Then Address details should be removed
