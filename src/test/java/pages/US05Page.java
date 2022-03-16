package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class US05Page {
    //TC17

    @FindBy(xpath = "//button[@class='btn btn-success close-modal btn-block']")
    public WebElement contShopButton;

    @FindBy(xpath = " //i[@class='fa fa-times']']")
    public WebElement xButton;

    @FindBy(xpath = " //b[.='Cart is empty!']")
    public WebElement cartIsEmptyTextE;


    //TC18

    //a[normalize-space()='Women']
    @FindBy(xpath = "//a[normalize-space()='Women']")
    public WebElement categoryWomenElement;

    @FindBy(xpath = "//div[@id='Women']//a[contains(text(),'Dress')]")
    public WebElement womenDressElement;

    @FindBy(xpath = "//h2[@class='title text-center']")
    public WebElement womenDressText;

    @FindBy(xpath = "//a[normalize-space()='Men']")
    public WebElement categoryMenElement;

    @FindBy(xpath = "//a[normalize-space()='Jeans']")
    public WebElement brandsJeansElement;

    @FindBy(xpath = " //h2[@class='title text-center']")
    public WebElement menJeansTextElement;

    //TC19

    @FindBy(xpath = "//a[@href='/brand_products/Polo']")
    public WebElement brandsPoloElement;

    @FindBy(xpath = "//h2[@class='title text-center']")
    public WebElement brandsProductsTextElement;

    @FindBy(xpath = "//a[@href='/brand_products/H&M']")
    public WebElement brandsHmElement;




}
