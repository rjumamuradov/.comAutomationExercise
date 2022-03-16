package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.US02Page;
import pages.US03HomePage;
import pages.US05Page;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class US05StepDefinitions {

    US03HomePage us03HomePage = new US03HomePage();
    US05Page uS05Page = new US05Page();
    US02Page us02Page = new US02Page();
    Actions actions = new Actions(Driver.getDriver());

    //Tc 17
    @Given("Click {string} button")
    public void click_button(String string) {
        uS05Page.contShopButton.click();
        us03HomePage.cartButton.click();
    }

    @Then("Click {string} button corresponding to particular product")
    public void click_button_corresponding_to_particular_product(String string) {

        uS05Page.xButton.click();

    }

    @Then("Verify that product is removed from the cart")
    public void verify_that_product_is_removed_from_the_cart() {
        Assert.assertTrue(uS05Page.cartIsEmptyTextE.isDisplayed());

    }

    //TC18

    @Then("Click on {string} category")
    public void clickOnWomenCategory() {
        uS05Page.categoryWomenElement.click();
    }

    @And("Click on any category link under {string} category, for example: Dress")
    public void clickOnAnyCategoryLinkUnderWomenCategoryForExampleDress() {
        uS05Page.womenDressElement.click();
    }

    @Then("Verify that category page is displayed and confirm text {string}")
    public void verifyThatCategoryPageIsDisplayedAndConfirmTextWOMENTOPSPRODUCTS() {
        Assert.assertTrue(uS05Page.womenDressText.isDisplayed());
    }

    @And("On left side bar, click on any sub-category link of {string} category")
    public void onLeftSideBarClickOnAnySubCategoryLinkOfMenCategory() {
        uS05Page.categoryMenElement.click();
        uS05Page.brandsJeansElement.click();

    }

    @Then("Verify that user is navigated to that category page")
    public void verifyThatUserIsNavigatedToThatCategoryPage() {
        Assert.assertTrue(uS05Page.menJeansTextElement.isDisplayed());

    }

    //TC19



    @And("Verify that Brands are visible on left side bar")
    public void verifyThatBrandsAreVisibleOnLeftSideBar() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
       Assert.assertTrue( us02Page.brandsTextElement.isDisplayed());
    }

    @Then("Click on any brand name")
    public void clickOnAnyBrandName() {
        uS05Page.brandsPoloElement.click();

    }

    @And("Verify that user is navigated to brand page and brand products are displayed")
    public void verifyThatUserIsNavigatedToBrandPageAndBrandProductsAreDisplayed() {
        Assert.assertTrue(uS05Page.brandsPoloElement.isDisplayed());
        Assert.assertTrue(uS05Page.brandsProductsTextElement.isDisplayed());
    }

    @Then("On left side bar, click on any other brand link")
    public void onLeftSideBarClickOnAnyOtherBrandLink() {
        uS05Page.brandsHmElement.click();

    }

    @And("Verify that user is navigated to that brand page and can see products")
    public void verifyThatUserIsNavigatedToThatBrandPageAndCanSeeProducts() {
        Assert.assertTrue(uS05Page.brandsHmElement.isDisplayed());
        Assert.assertTrue(uS05Page.brandsProductsTextElement.isDisplayed());
    }
    //TC20


    @Then("Verify all the products related to search are visible")
    public void verifyAllTheProductsRelatedToSearchAreVisible() throws IOException {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.getScreenshot("verifiedProductsAreVisible");

    }


    @And("Add those products to cart")
    public void addThoseProductsToCart() {

    }
}
