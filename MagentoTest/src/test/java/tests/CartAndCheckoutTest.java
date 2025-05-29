package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.CartPage;
import pages.CheckoutPage;
import pages.ProductPage;
import pages.SearchPage;

public class CartAndCheckoutTest extends BaseTest {
    public CartAndCheckoutTest() {
    }

    @Test
    public void testAddToCart() {
        SoftAssert softAssert = new SoftAssert();
        SearchPage searchPage = new SearchPage(this.driver);
        searchPage.searchProduct("Jacket");
        softAssert.assertTrue(searchPage.isProductFound(), "No products found for search query");
        this.driver.findElement(By.cssSelector(".product-item-info a.product-item-link")).click();
        ProductPage productPage = new ProductPage(this.driver);
        productPage.addToCart();
        softAssert.assertTrue(productPage.isSuccessMessageDisplayed(), "Success message not displayed after adding to cart");
        CartPage cartPage = new CartPage(this.driver);
        cartPage.viewCart();
        softAssert.assertTrue(cartPage.isItemInCart(), "Item not found in cart");
        System.out.println("Add to cart test executed");
        softAssert.assertAll();
    }

    public void testCheckout() {
        SoftAssert softAssert = new SoftAssert();
        SearchPage searchPage = new SearchPage(this.driver);
        searchPage.searchProduct("Jacket");
        softAssert.assertTrue(searchPage.isProductFound(), "No products found for search query");
        this.driver.findElement(By.cssSelector(".product-item-info a.product-item-link")).click();
        ProductPage productPage = new ProductPage(this.driver);
        productPage.addToCart();
        softAssert.assertTrue(productPage.isSuccessMessageDisplayed(), "Success message not displayed after adding to cart");
        CartPage cartPage = new CartPage(this.driver);
        cartPage.viewCart();
        cartPage.clickProceedToCheckout();
        CheckoutPage checkoutPage = new CheckoutPage(this.driver);
        checkoutPage.enterShippingDetails("guest@example.com", "John", "Doe", "123 Main St", "New York", "New York", "10001", "United States", "1234567890");
        checkoutPage.clickNext();
        checkoutPage.placeOrder();
        softAssert.assertTrue(checkoutPage.isOrderSuccessMessageDisplayed(), "Order confirmation message not displayed");
        System.out.println("Checkout test executed");
        softAssert.assertAll();
    }
}
