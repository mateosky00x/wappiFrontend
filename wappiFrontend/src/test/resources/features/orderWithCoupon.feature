Feature: Ordering a product with coupon
  As a user
  I want to order a product with coupon
  To validate product order and coupon

  Background: Open browser and login
    Given user opens browser and enters page
    When user enters the credencials and clicks on login button
      | user           | password       |
      | mateoTester00x | mateoTester00x |
    Scenario: Ordering a product with coupon
      And user clicks on get coupon, copies coupon and closes coupon pop up, enter on order a product, selects product, pastes code and confirms order
      Then The user should see the confirmation message and close message Tu pedido ha sido confirmado, te mantendremos informado ante nuevas novedades