package pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {
    WebDriver driver;
    By emailField = By.id("customer-email");
    By firstNameField = By.name("firstname");
    By lastNameField = By.name("lastname");
    By streetAddressField = By.name("street[0]");
    By cityField = By.name("city");
    By stateDropdown = By.name("region_id");
    By zipCodeField = By.name("postcode");
    By countryDropdown = By.name("country_id");
    By phoneField = By.name("telephone");
    By shippingMethod = By.cssSelector("input[value='flatrate_flatrate']");
    By nextButton = By.cssSelector("button.button.action.continue");
    By placeOrderButton = By.cssSelector("button.action.primary.checkout");
    By successMessage = By.cssSelector("span.base");
    By errorMessage = By.cssSelector("div.message-error");

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterShippingDetails(String email, String firstName, String lastName, String street, String city, String state, String zip, String country, String phone) {
        this.driver.findElement(this.emailField).sendKeys(new CharSequence[]{email});
        this.driver.findElement(this.firstNameField).sendKeys(new CharSequence[]{firstName});
        this.driver.findElement(this.lastNameField).sendKeys(new CharSequence[]{lastName});
        this.driver.findElement(this.streetAddressField).sendKeys(new CharSequence[]{street});
        this.driver.findElement(this.cityField).sendKeys(new CharSequence[]{city});
        this.driver.findElement(this.stateDropdown).sendKeys(new CharSequence[]{state});
        this.driver.findElement(this.zipCodeField).sendKeys(new CharSequence[]{zip});
        this.driver.findElement(this.countryDropdown).sendKeys(new CharSequence[]{country});
        this.driver.findElement(this.phoneField).sendKeys(new CharSequence[]{phone});
        this.driver.findElement(this.shippingMethod).click();
    }

    public void clickNext() {
        this.driver.findElement(this.nextButton).click();
    }

    public void placeOrder() {
        this.driver.findElement(this.placeOrderButton).click();
    }

    public boolean isOrderSuccessMessageDisplayed() {
        List<WebElement> messages = this.driver.findElements(this.successMessage);
        return messages.size() > 0 && ((WebElement)messages.get(0)).isDisplayed();
    }

    public boolean isErrorMessageDisplayed() {
        List<WebElement> messages = this.driver.findElements(this.errorMessage);
        return messages.size() > 0 && ((WebElement)messages.get(0)).isDisplayed();
    }
}
