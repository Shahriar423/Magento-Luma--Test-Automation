package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {
    public LoginTest() {
    }

    @Test
    public void validLoginTest() {
        LoginPage loginPage = new LoginPage(this.driver);
        loginPage.logintomgento("shimul@gmail.com", "Bangladesh12");
        String welcomMessage = this.driver.findElement(By.className("logged-in")).getText();
        Assert.assertTrue(welcomMessage.contains("Welcome"), "Login failed: Welcome message not found!");
        System.out.println("Login test succesfully execute");
    }
}
