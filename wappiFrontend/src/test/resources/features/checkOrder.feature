Feature: Check order
  As a user
  I want to check an order
  To validate that the product order is correct

  Background: Open browser and login
    Given user opens browser and enters page
    When user enters the credencials and clicks on login button
      | user           | password       |
      | mateoTester00x | mateoTester00x |
    And user clicks on order a product and confirms product

  Scenario: check order
    When user clicks on close order, enters my orders tab
    Then the user can compare the product info with the order
