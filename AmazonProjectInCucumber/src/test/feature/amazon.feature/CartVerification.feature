Feature: CartVerification

  Scenario Outline: Add The Product In Cart By Search
    Given User Launched the Amazon Loging Page in Browser
    When user logined by Entering "<mobileNumber>" and "<password>"
    And the user entered "<productName>" in search box
    And the user select the "<product>"
    And the user add the selected product into cart
    Then verify the "<product>" in cart

    Examples: 
      | mobileNumber | password   | productName    | product                       |
      |   6385806677 | mirzab@123 | nivia football | Nivia Storm Football - Size 5 |
