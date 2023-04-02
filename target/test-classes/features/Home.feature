Feature: Retail Home Page

  Scenario: Verify Shop by Department sidebar
    Given User is on retail website
    When User click on All section
    Then below options are present in Shop by Department sidebar
      | Electronics | Computers | Smart Home | Sports | Automative |

  Scenario Outline: Verify department sidebar options
    Given User is on retail website
    When User click on All section
    And User on <department>
    Then below options are present in department
      | <optionOne> | <optionTwo> |

    Examples: 
      | department    | optionOne                      | optionTwo                |
      | 'Electronics' | TV & Video                     | Video Games              |
      | 'Computers'   | Accessories                    | Networking               |
      | 'Smart Home'  | Smart Home Lightning           | Plugs and Outlets        |
      | 'Sports'      | Athletic Clothing              | Exercise & Fitness       |
      | 'Automative'  | Automative Parts & Accessories | MotorCycle & Powersports |

  Scenario: Verify User can add an item to cart
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'maya.alieva@tekchool.us' and password 'Alijon@02'
    And User click on login button
    And User should be logged in into Account
    And User change the category to 'Under Armour Mens Playoff 2.0 Golf Polo'
    And User search for an item 'X-PRO 125cc Vader Adult Motorcycle Gas Motorcycle Dirt Motorcycle Street Bike,Big 12" Wheels!'
    And User click on Search icon
    And User click on item
    And User select quantity '2'
    And User click add to Cart button
    Then the cart icon quantity should change to '2'

  Scenario: Verify User can place an order without Shipping address and payment Method on file
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'maya.alieva@tekschool.us' and password 'Alijon@02'
    And User click on login button
    And User should be logged in into Account
    And User change the category to 'Under Armour Mens Playoff 2.0 Golf Polo'
    And User search for an item 'X-PRO 125cc Vader Adult Motorcycle Gas Motorcycle Dirt Motorcycle Street Bike,Big 12" Wheels!'
    And User click on Search icon
    And User click on item
    And User select quantity '2'
    And User click add to Cart button
    Then the cart icon quantity should change to '2'
    And User click on Cart option
    And User click on Proceed to Checkout button
    And User click Add a new address link for shipping address
    And User fill new address form with below information
      | country       | fullName    | phoneNumber | streetAddress         |   city   | state   | zipCode |
      | United States | Maya Alieva |  8322740670 | 4415 Amaranth Meadow  | Houston  | Texas   |   77053 |
    And User click Add Your Address button
    And User click Add a credit card or Debit Card for Payment method
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard  | expirationMonth | expirationYear | securityCode |
      | 5553232104473547 | Maya Alieva |              07 |           2023 |          963 |
    And User click on Add your card button
    And User click on Place Your Order
    Then a message should be displayed 'Order Placed, Thanks'

  Scenario: Verify User can place an order with Shipping address and payment Method on file
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'maya.alieva@tekschool.us' and password 'Alijon@02'
    And User click on login button
    And User should be logged in into Account
    And User change the category to 'Mens Playoff'
    And User search for an item 'Motorcycle'
    And User click on Search icon
    And User click on item
    And User select quantity '2'
    And User click add to Cart button
    Then the cart icon quantity should change to '2'
    And User click on Cart option
    And User click on Proceed to Checkout button
    And User click on Place Your Order
    Then a message should be displayed 'Order Placed, Thanks'
