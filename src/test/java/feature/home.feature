@test
Feature: kkk
  @test1
  Scenario: kkk
    Given I type to a page
    When I turn  search field to red
    Then I wait 5 seconds
    When I click search button
    Then I wait 5 seconds

    When I refresh browser
#    Then I go back to page

#   Then I quit chrome



  @test2
  Scenario: kkk1
    Given I type to a page
    When I turn search field to green
    Then I wait 5 seconds
    When I click search button
    Then I wait 5 seconds



    Then I quit chrome