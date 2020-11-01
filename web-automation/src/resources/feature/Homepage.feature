Feature: Homepage
  I want to test that homepage is opening.

  Scenario: Open Homepage
    Given User has the homepage url.
    When User navigate to homepage url.
    Then Homepage is populated.
    And Homepage title is "Selenium Easy - Best Demo website to practice Selenium Webdriver Online".
    And Pop-up is populated.
