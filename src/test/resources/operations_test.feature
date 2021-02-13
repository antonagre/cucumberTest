 Feature: add test
  Background:
    Given that the Calculator app is running and in focus
    And there is no current value in the calculator

  Scenario: add two numbers on the Calculator app
    When you add 4 and 5
    Then the value displayed should be 9

  Scenario Outline: check multiplication function on Calculator app
    When sum <number1> and <number2> in the calculator app
    Then the app show <result>

  Examples:
    |number1|number2|result|
    |5|9|14|
    |5|10|15|
    |5|11|16|
    |10|12|22|
    |18|7|25|

  Scenario Outline: check multiplication function on Calculator app
   When multiply <number1> and <number2> in the calculator app
   Then the app show <result>

   Examples:
     |number1|number2|result|
     |5|4|20|
     |5|9|45|
     |5|11|55|
     |10|12|120|
     |18|11|198|

   Scenario Outline: check multiplication function on Calculator app
     When divide <number1> by <number2> in the calculator app
     Then the app show <result>

     Examples:
       |number1|number2|result|
       |20|4|5|
       |45|9|5|
       |55|5|11|
       |120|12|10|
       |198|18|11|

  Scenario Outline: check multiplication function on Calculator app
   When subtract <number1> and <number2> in the calculator app
   Then the app show <result>

   Examples:
     |number1|number2|result|
     |20|4|16|
     |45|20|25|
     |55|9|46|
     |120|12|108|
     |198|18|180|

