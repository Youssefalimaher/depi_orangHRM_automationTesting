package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.Duration;

public class login {
    //driver
    WebDriver loginDriver;

    //Locators
    By userNameLocator = By.name("username");
    By passwordLocator = By.cssSelector("input[name='password']");
    By loginButtonLocator = By.className("orangehrm-login-button");
    By orangHRMLogo = By.className("orangehrm-login-branding");

    //constructor
    public login (WebDriver driver) {
        loginDriver = driver;
    }

    //Actions
    public void typeUserName(String username){
        loginDriver.findElement(userNameLocator).sendKeys(username);
    }

    public void typePassword(String password){
        loginDriver.findElement(passwordLocator).sendKeys(password);
    }

    public homepage  clickLogin() {
        loginDriver.findElement(loginButtonLocator).click();
        return new homepage(loginDriver);
    }

    public WebElement orangHRMLogo(){
        return loginDriver.findElement(orangHRMLogo);
    }

    /*

    public WebElement waitLogo() {
        WebDriverWait explicitWait = new WebDriverWait(loginDriver, Duration.ofSeconds(5));
        return explicitWait.until(ExpectedConditions.visibilityOf(orangHRMLogo()));
    }

    public WebElement waitLogo1() {
        try {
            WebDriverWait explicitWait = new WebDriverWait(loginDriver, Duration.ofSeconds(50));
            return explicitWait.until(ExpectedConditions.visibilityOf(orangHRMLogo()));
        } catch (TimeoutException e) {
            System.out.println("mal72tsh: " + orangHRMLogo());
            throw e;
        }
    }

*/


    public void takeScreenshot(String fileName) {
        try {
            TakesScreenshot ts = (TakesScreenshot) loginDriver;
            File screenshotFile = ts.getScreenshotAs(OutputType.FILE);
            Files.copy(screenshotFile.toPath(), new File("loginScreenshot.png").toPath());
        } catch (IOException e) {
            System.out.println("Screenshot failed: " + e.getMessage());
        }
    }


}
