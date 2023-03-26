package com.example.testproject.N11Pages;

import com.example.testproject.N11Methods.Methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class N11LoginPage extends Methods {

    public N11LoginPage(WebDriver driver) {
        super(driver);
    
    }

    public By inputEposta = By.id("email");
    public By inputPassword = By.id("password");
    public By loginButton = By.id("loginButton");

    EmailBox eMailBox;
    PasswordBox passwordBox;
    LoginApple loginApple;
    LoginQuick loginQuick;
    LoginFacebook loginFacebook;

    public void getN11LoginPage() {
        driver.get("https://www.n11.com/login");
    }

    public N11LoginPage clickLoginButtonLoginPage(){
        click(loginButton);
        return this;
    }

    public boolean isOnLoginPage(){
        List<WebElement> webElements = driver.findElements(By.xpath("//h2[contains(text(),'Giriş Yap')]"));
        return !webElements.isEmpty();
    }

    public EmailBox eMailBox(){
        return this.eMailBox;
    }

    public PasswordBox passwordBox(){
        return this.passwordBox;
    }

    public LoginApple loginApple(){
        return this.loginApple;
    }

    public LoginQuick loginQuick(){
        return this.loginQuick;
    }

    public LoginFacebook loginFacebook(){
        return this.loginFacebook;
    }

    public void getN11MainPage() {
    }
}