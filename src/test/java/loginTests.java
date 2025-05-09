import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.login;
import pages.homepage;
import java.time.Duration;
import java.io.IOException;



public class loginTests {

    WebDriver driver;
    login login;
    homepage homepage;

    @BeforeClass
    public void strart(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        login = new login(driver);
    }


    @Test
    public void Check_login_Using_Valid_Credentials() throws IOException {
        WebDriverWait explicitWait = new WebDriverWait(driver,Duration.ofSeconds(5));
        explicitWait.until(ExpectedConditions.visibilityOf(login.orangHRMLogo()));
        login.typeUserName("Admin");
        login.typePassword("admin123");
        homepage = login.clickLogin();
        Assert.assertTrue(homepage.findDashboard().isDisplayed());
        homepage.logOut();
    }

    @Test
    public void Login_Fails_With_Correct_Username_And_Wrong_Password() throws IOException {
        WebDriverWait explicitWait = new WebDriverWait(driver,Duration.ofSeconds(5));
        explicitWait.until(ExpectedConditions.visibilityOf(login.orangHRMLogo()));
        login.typeUserName("Admin");
        login.typePassword("njhchdcdsd665");
        homepage = login.clickLogin();
    }

    @Test
    public void Check_Login_Fails_When_Invalid_Username_With_A_valid_Password() throws IOException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Assert.assertTrue(login.orangHRMLogo().isDisplayed());
        login.typeUserName("youssef11");
        login.typePassword("admin123");
        homepage = login.clickLogin();
    }

    @Test
    public void Check_Login_Fails_When_Username_Field_Is_Blank_With_A_valid_Password() throws IOException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Assert.assertTrue(login.orangHRMLogo().isDisplayed());
        login.typeUserName("");
        login.typePassword("");
        homepage = login.clickLogin();
    }







    @AfterClass
    public void tearDown() {
        driver.quit();
    }


}
