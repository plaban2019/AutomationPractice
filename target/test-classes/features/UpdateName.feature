#@UpdateProfile
#Feature: Update Profile
#  As a Logged User of the Site
#  I want to be able to update my name
#
#  @PlaceOrder
#    Scenario: Place a T-shirt Order
#    Given Click the T-shirt link
#    When I scroll Down to Bottom
#    And I hover on the T-shirt Card View
#    And I click Add To Cart
#    Then I am on the "My profile" page on URL "www.mycompany.com/myprofile"
#    And I should see "Welcome to your profile" message
#    And I should see the "Log out" button
##
#  Scenario: Update name
#    When I click on the "Edit Personal Info" button
#    And I fill in "Your name" with "<name>"
#    And I click on the "Save Changes" button
#    Then I should see "Your personal info has been successfully updated" message

#  Scenario Outline: Add new projects
#    When I click on the "Add Project" button
#    And I fill in "Project Name" with "<project>"
#    And I fill in "Duration" with "<duration>"
#    And I fill in "Description" with "<description>"
#    And I click on the "Save Changes" button
#    Then I should see "Your personal info has been successfully updated" message
#    Examples:
#      |  name   | duration   | description   | project|
#      | Plaban1 | 3 months   | QA            |  1     |
#      | plaban  | 1 month    | UI Testing    |   2    |
