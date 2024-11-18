@TestAll
Feature: StoriAI

@Test1
Scenario: StoriAI log in/out feature(Happy Path)
  Given I navigate to "develop.storiai.com/login"
#  Then I wait 3 seconds
  Then the website should have title as  "STORI AI"
#  Then I wait 3 seconds
  And log in page should be present
#  Then I wait 3 seconds
  When I type username as "test@test.com"
  And I type password as "ABC123"
#  Then I wait 3 seconds
  And I accept the alert
  When I click Sign in button

Then I wait 3 seconds
  Then I Should land on home page
#  Then I wait 3 seconds
  When I click log out I should get logged out

  @Test2
  Scenario Outline: LogIn with incorrect credentials
    Given I navigate to "develop.storiai.com/login"
    Then the website should have title as  "STORI AI"
    And log in page should be present
    When I type username as <userName>
    And I type password as <password>
    And I accept the alert
    When I click Sign in button
    Then I wait 5 seconds
    Then I should see an error message as "Invalid login attempt."
    Examples:
      | userName        | password |
      | "test@test.com" | "ABC12"  |
      |    ""           |    ""    |
      |"kjk"            |"kjkjkghh"|
      |"kjkkjkjk"       |""        |
      |"some test"      |"sometest"|
      |"one more test"  |"lklk"   |




