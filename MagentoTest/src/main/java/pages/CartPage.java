package pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
    WebDriver driver;
    By cartLink = By.cssSelector("a.action.showcart");
    By cartItems = By.cssSelector("tr.item-info");
    By proceedToCheckoutButton = By.id("top-cart-btn-checkout");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void viewCart() {
        this.driver.findElement(this.cartLink).click();
    }

    public boolean isItemInCart() {
        List<WebElement> items = this.driver.findElements(this.cartItems);
        return items.size() > 0;
    }

    public void clickProceedToCheckout() {
        this.driver.findElement(this.proceedToCheckoutButton).click();
    }
}
