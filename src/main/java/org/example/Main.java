package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*

//        driver
webDriver loginDriver;
//        by locators
by userNameLocator = by.id("user name");
//        elements
webElement userNameLocator = loginDriver
//        constructor
public loginpage(webDriver Driver) { loginDriver = driver}
//        method


        // Create driver object
        WebDriver myBrowser = new ChromeDriver();



        // Navigate to URL
        myBrowser.get("https://www.saucedemo.com/");

        // Maximize window
        myBrowser.manage().window().maximize();

        myBrowser.findElement(By.id("user-name")).sendKeys("standerd_user");
        myBrowser.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        myBrowser.findElement(By.id("password")).sendKeys("secret_sauce");
        myBrowser.findElement(By.id("login-button")).click();



//implicit wait (يستني وقت معين)
        myBrowser.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        myBrowser.findElement(By.cssSelector("span[class='tittle']"));

        myBrowser.close(); // for tap
        myBrowser.quit();  // for browser

//explicit wait (يستني وقت لغايه لما حاجه تحصل)
        WebDriverWait explicitWait = new WebDriverWait(myBrowser,Duration.ofSeconds(5));
        explicitWait.until(ExpectedConditions.visibilityOf(myBrowser.findElement(By.className("title"))));

        myBrowser.quit();


//fluent wait   (يستني وقت لغايه لما حاجه تحصل و يتشك كل وقت معين )


         */



//        WebDriver myBrowser = new ChromeDriver();
//        myBrowser.get("https://opensource-demo.orangehrmlive.com/");
//        myBrowser.manage().window().maximize();
//
//        myBrowser.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        myBrowser.findElement(By.name("username")).sendKeys("Admin");
//        myBrowser.findElement(By.cssSelector("input[name='password']")).sendKeys("admin123");
//        myBrowser.findElement(By.className("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button")).click();




        String username = "Admin";
        String password = "admin123";
        String url = "https://opensource-demo.orangehrmlive.com/";


        //create driver object
        WebDriver myBrowser = new ChromeDriver();

        //Navigate to url
        myBrowser.get(url);

        //maximize window
        myBrowser.manage().window().maximize();

        //implicit wait
        myBrowser.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        myBrowser.findElement(By.name("username")).sendKeys(username);
        myBrowser.findElement(By.cssSelector("input[name='password']")).sendKeys(password);
        myBrowser.findElement(By.className("orangehrm-login-button")).click();

//        // Switch to the alert
//        Alert alert = myBrowser.switchTo().alert();
//
//        // Accept it
//       // alert.accept();
//
//        // Or dismiss it
//        alert.dismiss();



        myBrowser.findElement(By.className("oxd-userdropdown-tab")).click();
        myBrowser.findElement(By.linkText("Logout")).click();




        //close the browser
        //myBrowser.quit();





    }
}