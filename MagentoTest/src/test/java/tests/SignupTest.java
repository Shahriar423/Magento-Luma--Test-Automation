package tests;

import base.BaseTest;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SignupPage;

public class SignupTest extends BaseTest {
    public SignupTest() {
    }

    @Test
    public void ValidSignupTest() {
        SignupPage signuppage = new SignupPage(this.driver);
        signuppage.signuptoMagento("Shahriar", "shimul", "shimul5@gmail.com", "Shimul@12", "Shimul@12");
        WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(10L));
        WebElement message = (WebElement)wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.message-success")));
        String ThankyouMessage = this.driver.findElement(By.cssSelector("div.message-success")).getText();
        System.out.println("Actual message: " + ThankyouMessage);
        Assert.assertTrue(ThankyouMessage.contains("Thank you for registering"), "Signup failed: Success message not found!");
    }
}
