Feature: Update profile
  As a user
  I want to update my profile
  to validate my personal info

  Background: Open browser and login
    Given user opens browser and enters page
    When user enters the credencials and clicks on login button
      | user           | password       |
      | mateoTester00x | mateoTester00x |

  Scenario: Update profile
    And user clicks on personal information, updates info and clicks on save
      | name  | lastname | birthdate  |
      | Mateo | Castillo | 15/05/1996 |
    Then the user should see the changes in his profile

