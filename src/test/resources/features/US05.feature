
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

    Scenario: TC18: View Category Products
    Then Click on 'Women' category
    And Click on any category link under 'Women' category, for example: Dress
    Then Verify that category page is displayed and confirm text 'WOMEN - TOPS PRODUCTS'
    And On left side bar, click on any sub-category link of 'Men' category
    Then Verify that user is navigated to that category page

      Scenario: TC19: View & Cart Brand Products

    Then Click on the 'Products' button
      And Verify that Brands are visible on left side bar
     Then Click on any brand name
      And  Verify that user is navigated to brand page and brand products are displayed
      Then On left side bar, click on any other brand link
     And Verify that user is navigated to that brand page and can see products

        Scenario:TC20: Search Products and Verify Cart After Login

          Then Click on the 'Products' button
        And Verify user is navigated to ALL PRODUCTS page successfully
        Then Enter product name in search input and click search button
        And Verify 'SEARCHED PRODUCTS' is visible
       Then Verify all the products related to search are visible
        And  Add those products to cart
          Then  Click 'Cart' button and verify that products are visible in cart
        And  Click 'Signup / Login' button and submit login details
        Then  Again, go to Cart page
        And Verify that those products are visible in cart after login as well


