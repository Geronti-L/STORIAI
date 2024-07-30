@test
Feature: kkk
  @test1
  Scenario: kkk
    Given I type to a page
    When I turn  search field to red
#    Then I wait 5 seconds
    When I click search button
#    Then I wait 5 seconds

    When I refresh browser
#    Then I go back to page

#   Then I quit chrom



  @test2
  Scenario: kkk1
    Given I type to a page
    When I turn search field to green
    Then I wait 5 seconds
    When I click search button
    Then I wait 5 seconds
    When I turn  search field to red
    Then I reload browser
    When I go back
    Then I wait 3 seconds




