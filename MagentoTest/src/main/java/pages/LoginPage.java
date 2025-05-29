package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    By emailField = By.id("email");
    By passFieled = By.id("pass");
    By useBtn = By.id("send2");
    By errorMessage = By.xpath("//*[@id=\"maincontent\"]/div[2]/div[2]/div/div/div");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterEmail(String email) {
        this.driver.findElement(this.emailField).sendKeys(new CharSequence[]{email});
    }

    public void enterPass(String pass) {
        this.driver.findElement(this.passFieled).sendKeys(new CharSequence[]{pass});
    }

    public void clikBtn() {
        this.driver.findElement(this.useBtn).click();
    }

    public void logintomgento(String email, String pass) {
        this.enterEmail(email);
        this.enterPass(pass);
        this.clikBtn();
    }

    public String getErrorMessage() {
        return this.driver.findElement(this.errorMessage).getText();
    }
}
