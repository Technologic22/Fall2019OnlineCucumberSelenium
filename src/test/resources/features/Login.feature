@login
Feature: Login
  As user, I want to be able to log in with username and password
#  Agile story (to comment use # hashtag)

#  Test Method=Test Case=Scenario:
#  Test+DataProvider = Scenario Outline + Examples table
#  we can use a * instead of below phrases

  Background: open login page
    Given user is on the login page

  @sales_manager
  Scenario: Login as sales manager and verify that title is Dashboard
    When user logs in as a sales manager
    Then user should verify that the title is a Dashboard

    @store_manager
    Scenario: Login as store manager and verify that title is Dashboard
      When user logs in as a store manager
      Then user should verify that the title is a Dashboard

      @driver @dashboard
      Scenario: Login as driver and verify that title is a Dashboard
        When user logs in as a driver
        Then user should verify that the title is a Dashboard

      @login_with_params
      Scenario: Login with parameters
        When user enters "salesmanager115" username and "UserUser123" password
        Then user should verify that the title is a Dashboard