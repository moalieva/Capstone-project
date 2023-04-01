Feature: TEK Retail Application SignIn feature

  Background: 
    Given User is on retail website
    When User click on sign in option

  Scenario: Verify user can sign in into Retail Application
    And User enter email 'eclipse.testing1@gmail.com' and password 'Tek123!@#$$'
    And User click on login button
    Then User should be logged in into Account

  Scenario Outline: Verify user can sign in into Retail Application
    And User enter email '<email>' and password '<password>'
    And User click on login button
    Then User should be logged in into Account

    Examples: 
      | email                     | password   |
      | eclipse.testing1@gmail.com | Tek123!@#$$ |
      | transformers@tekschool.us | Tek123!@#$ |
      | phantom.test@gmail.com    | Tek123!@#$ |

  Scenario: Verify user can create an account into Retail Website
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name   | email               | password     | confirmPassword |
      | Ursula | ursula.test@tek.com | Tek12345!@#$ | Tek12345!@#$    |
    And User click on SignUp button
    Then User should be logged into account page
