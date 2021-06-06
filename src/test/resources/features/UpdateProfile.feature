Feature: Update Profile
  As a Logged User of the Site
  I want to be able to update my name
  @UpdateProfile
  Scenario: Update First Name
    Given I Launch the browser
    When I Click Sign in the site
    Then I Enter EmailId in the Email address text box.
    Then I Enter Password in the Password text box.
    And I Click Sign in Button
    And I click on My Account Link
    And I scroll Down to My Personal info
    And I click on My Personal Info
    And I scroll Down to Email field
    Then I Update the first Name
#    Examples:
#      |  name   |
#      | Plaban1 |
#      | plaban  |
