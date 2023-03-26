package com.example.testproject.N11Pages;

import com.example.testproject.N11Methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class N11MainPage extends Methods {

    By loginButton = By.xpath("//a[@title='Giriş Yap']");
    By logoImg = By.xpath("//img[@alt='hayat sana gelir']");

    public N11MainPage(WebDriver driver) {
        super(driver);
    }

    public void getN11MainPage(){
        driver.get("https://www.n11.com");
    }

    public boolean isOnMainPage() {
        return isDisplayed(logoImg);
    }

    public void clickLoginButtonMainPage() {
        click(loginButton);

    }
}