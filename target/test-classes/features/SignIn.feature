Feature: TEK Retail Application SignIn feature

  Background: 
    Given User is on retail website
    When User click on sign in option

  Scenario: Verify user can sign in into Retail Application
    And User enter email 'maya.alieva@tekschool.us' and password 'Alijon@02'
    And User click on login button
    Then User should be logged in into Account

  Scenario Outline: Verify user can sign in into Retail Application
    And User enter email '<maya.alieva@tekschool.us>' and password '<Alijon@02>'
    And User click on login button
    Then User should be logged in into Account

    Examples: 
      | email                      | password    |
      | eclipse.testing1@gmail.com | Tek123!@#$$ |
      | transformers@tekschool.us  | Tek123!@#$  |
      | phantom.test@gmail.com     | Tek123!@#$  |

  Scenario: Verify user can create an account into Retail Website
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name | email                    | password  | confirmPassword |
      | Maya | maya.alieva@tekschool.us | Alijon@02 | Alijon@02       |
    And User click on SignUp button
    Then User should be logged into account page
