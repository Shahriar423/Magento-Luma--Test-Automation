package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupPage {
    WebDriver driver;
    By firstName = By.id("firstname");
    By lastName = By.id("lastname");
    By emailName = By.id("email_address");
    By password = By.id("password");
    By confPass = By.id("password-confirmation");
    By submitBtn = By.xpath("//button[@class='action submit primary']");

    public SignupPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterFirstname(String firstname) {
        this.driver.findElement(this.firstName).sendKeys(new CharSequence[]{firstname});
    }

    public void enterLastname(String lastname) {
        this.driver.findElement(this.lastName).sendKeys(new CharSequence[]{lastname});
    }

    public void enterEmail(String email_address) {
        this.driver.findElement(this.emailName).sendKeys(new CharSequence[]{email_address});
    }

    public void enterPass(String pass) {
        this.driver.findElement(this.password).sendKeys(new CharSequence[]{pass});
    }

    public void enterconfPass(String confpass) {
        this.driver.findElement(this.confPass).sendKeys(new CharSequence[]{confpass});
    }

    public void clickSubmit() {
        this.driver.findElement(this.submitBtn).click();
    }

    public void signuptoMagento(String firstname, String lastname, String email, String pass, String confpass) {
        this.enterFirstname(firstname);
        this.enterLastname(lastname);
        this.enterEmail(email);
        this.enterPass(pass);
        this.enterconfPass(confpass);
        this.clickSubmit();
    }
}
