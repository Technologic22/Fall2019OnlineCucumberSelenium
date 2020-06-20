Feature: Login
    # Agile story (to comment use # hashtag)
  As user, I want to be able to log in with username and password
    #Test Method=Test Case=Scenario:
    # Test+DataProvider = Scenario Outline + Examples table

  Scenario: Login as sales manager and verify that title is Dashboard
   # we can use a * instead of below phrases

    Given user is on the login page
    When user logs in as a sales manager
    Then user should verify that title is a Dashboard