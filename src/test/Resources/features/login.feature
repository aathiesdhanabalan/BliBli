@LoginFeature @Sanity
  Feature: LoginFeature

    Background:
      User navigate to facebook
      Given I am on Facebook login page

      @Test
      Scenario: Verify login fails with incorrect credentials
        When I enter username as "Tom"
        And I enter password ad "jerry@12"
        Then Login should fail
        And This is a test

