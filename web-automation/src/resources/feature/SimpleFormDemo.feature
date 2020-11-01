Feature: Simple Form Demo
  I want to use this template for my feature file

  Scenario Outline: Single Input Field
    Given User has the homepage url.
    When User navigate to homepage url.
    And User clicks on Input Form naviagtion tab.
    And User clicks on Simple Form Demo dropdown item.
    And User fills the message text field with <message>.
    And User clicks on Show Message button.
    Then Your message shows to <message>.

    Examples: 
      | message                     |
      | "Hello how are you?"        |
      | "Hey! I am here"            |
      | "Good morning :)"           |
      | "What happen? you look sad" |
      | "What is your number ?"     |

  Scenario Outline: Two Input Fields
    Given User has the homepage url.
    When User navigate to homepage url.
    And User clicks on Input Form naviagtion tab.
    And User clicks on Simple Form Demo dropdown item.
    And User fills the a text field with <a>.
    And User fills the b text field with <b>.
    And User clicks on Get Total button.
    Then Total shows to <total>.

    Examples: 
      | a      | b     | total  |
      |     10 |    20 |     30 |
      |     20 |    30 |     50 |
      |     23 |    34 |     57 |
      |     56 |    56 |    112 |
      |     78 |    12 |     90 |
      |     45 |    30 |     75 |
      |     67 |    23 |     90 |
      |    567 |   123 |    190 |
      |    678 |   000 |    678 |
      |   1000 | 49890 |  50890 |
      |      1 |     3 |      4 |
      | 309809 |    34 | 309843 |
