Feature: login
  As a user
  I want to update my profile
  To validate updating user data

  Scenario: Open browser and login
    Given user opens browser and enters page
    When user enters the credencials and clicks on login button
      | user           | password       |
      | mateoTester00x | mateoTester00x |
    Then The user should see the home page Inicio
