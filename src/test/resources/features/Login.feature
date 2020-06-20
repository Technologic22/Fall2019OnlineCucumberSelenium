Feature: Login
  As user, I want to be able to log in with username and password
#  Agile story (to comment use # hashtag)

#  Test Method=Test Case=Scenario:
#  Test+DataProvider = Scenario Outline + Examples table
#  we can use a * instead of below phrases

  Scenario: Login as sales manager and verify that title is Dashboard
    Given user is on the login page
    When user logs in as a sales manager
    Then user should verify that the title is a Dashboard