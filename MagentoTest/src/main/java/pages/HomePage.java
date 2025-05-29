package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    By loginLink = By.linkText("Sign In");
    By creatlink = By.linkText("Create an Account");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clikCreatacc() {
        this.driver.findElement(this.creatlink).click();
    }

    public void clickLoginLink() {
        this.driver.findElement(this.loginLink).click();
    }
}
