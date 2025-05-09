package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;


public class homepage {

    //driver
    WebDriver homepageDriver;

    //Locators
    By dashboardTitleLocator = By.className("oxd-text--h6");
    By userdropdownLocator = By.className("oxd-userdropdown-tab");
    By logoutLocator = By.linkText("Logout");

    //constructor
    public homepage(WebDriver driver) {
        homepageDriver = driver;
    }

    //action
    public WebElement findDashboard() {

        List<WebElement> products = homepageDriver.findElements(dashboardTitleLocator);
        return products.get(0);
    }

    public login logOut(){
        homepageDriver.findElement(userdropdownLocator).click();
        homepageDriver.findElement(logoutLocator).click();
        return new login(homepageDriver);
    }



}
