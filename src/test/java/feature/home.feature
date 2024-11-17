@test
Feature: StoriAI

@Test
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

