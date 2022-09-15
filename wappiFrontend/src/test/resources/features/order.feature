Feature: Ordering a product
  As a user
  I want to order a product
  To validate product order

  Background: Open browser and login
    Given user opens browser and enters page
    When user enters the credencials and clicks on login button
      | user           | password       |
      | mateoTester00x | mateoTester00x |
  Scenario: Ordering a product
    And user clicks on order a product and confirms product
    Then The user should see the confirmation message and close message Tu pedido ha sido confirmado, te mantendremos informado ante nuevas novedades
