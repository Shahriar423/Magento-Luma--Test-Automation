package pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {
    WebDriver driver;
    By sizeOptions = By.cssSelector("div.swatch-option.text");
    By colorOptions = By.cssSelector("div.swatch-option.color");
    By addToCartButton = By.id("product-addtocart-button");
    By successMessage = By.cssSelector("div.message-success");

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectFirstSize() {
        List<WebElement> sizes = this.driver.findElements(this.sizeOptions);
        if (!sizes.isEmpty()) {
            ((WebElement)sizes.get(0)).click();
        }

    }

    public void selectFirstColor() {
        List<WebElement> colors = this.driver.findElements(this.colorOptions);
        if (!colors.isEmpty()) {
            ((WebElement)colors.get(0)).click();
        }

    }

    public void clickAddToCart() {
        this.driver.findElement(this.addToCartButton).click();
    }

    public void addToCart() {
        this.selectFirstSize();
        this.selectFirstColor();
        this.clickAddToCart();
    }

    public boolean isSuccessMessageDisplayed() {
        List<WebElement> messages = this.driver.findElements(this.successMessage);
        return messages.size() > 0 && ((WebElement)messages.get(0)).isDisplayed();
    }
}
