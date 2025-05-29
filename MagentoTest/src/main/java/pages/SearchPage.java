package pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
    WebDriver driver;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchProduct(String productName) {
        WebElement searchBox = this.driver.findElement(By.id("search"));
        searchBox.sendKeys(new CharSequence[]{productName});
        searchBox.sendKeys(new CharSequence[]{Keys.ENTER});
    }

    public boolean isProductFound() {
        List<WebElement> products = this.driver.findElements(By.cssSelector(".product-item-info"));
        return products.size() > 0;
    }

    public boolean isNoResultsMessageDisplayed() {
        List<WebElement> messages = this.driver.findElements(By.cssSelector(".message.notice"));
        return messages.size() > 0 && ((WebElement)messages.get(0)).isDisplayed();
    }
}
