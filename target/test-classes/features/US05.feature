
@murat

Feature: US02 Sepet Guncelleme

  Background:Tekrar methodları

    Given Launch browser
    Then Navigate to url automation
    And Verify that home page is visible successfully

  Scenario: TC17: Remove Products From Cart

   And Add products to cart
   Then Click 'Cart' button
   And Verify that cart page is displayed
   Then Click 'X' button corresponding to particular product
   And Verify that product is removed from the cart

