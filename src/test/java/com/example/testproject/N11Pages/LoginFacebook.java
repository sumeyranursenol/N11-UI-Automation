package com.example.testproject.N11Pages;
import org.openqa.selenium.WebDriver;

import com.example.testproject.N11Methods.Methods;

import org.openqa.selenium.By;

public class LoginFacebook extends Methods {

     public By loginWithFacebook = By.xpath("//div[contains(text(),'Facebook ile Giriş Yap')]");

     public LoginFacebook(WebDriver driver){
        super(driver);
     }

    public LoginFacebook clickLoginWithFacebookButton(){
        click(loginWithFacebook);
        return this;
    }
}