package com.example.testproject.N11Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.Assertion;

import com.example.testproject.N11Pages.LoginApple;
import com.example.testproject.N11Pages.LoginFacebook;
import com.example.testproject.N11Pages.LoginQuick;
import com.example.testproject.N11Pages.N11LoginPage;
import com.example.testproject.N11Pages.N11MainPage;

public class N11BaseTest {
    public WebDriver driver;

    @BeforeTest
    public void setUp(){
        ChromeOptions options = new ChromeOptions();
        System.setProperty("webdriver.chrome.driver", "/Users/sn.senol/Desktop/chromedriver");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void LoginPageSetup(){
        N11LoginPage n11MainPage = new N11LoginPage(driver);
        N11LoginPage n11LoginPage = new N11LoginPage(driver);
        LoginApple loginApple = new LoginApple(driver);
        LoginQuick loginQuick = new LoginQuick(driver);
        LoginFacebook loginFacebook = new LoginFacebook(driver);

        n11MainPage.getN11MainPage();
        Assertion.assertTrue(n11MainPage.isOnMainPage());

        n11MainPage.clickLoginButtonMainPage();
        Assertion.assertTrue(n11LoginPage().isOnLoginPage());
    }

    @AfterTest
    public void driverQuit(){
        driver.quit();
    }

}
