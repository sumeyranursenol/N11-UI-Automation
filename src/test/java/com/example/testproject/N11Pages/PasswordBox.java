package com.example.testproject.N11Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.testproject.N11Methods.Methods;

import java.util.List;

import org.openqa.selenium.By;

public class PasswordBox extends Methods {

    public By passwordInput = By.id("password");

    public PasswordBox(WebDriver driver){
        super(driver);
    }

    public void typeTextPassword(String text){
        setText(passwordInput, text);
    }

    public boolean isInvalidPasswordOrEpostaAlertExist(){
        List<WebElement> webElements = driver.findElements(By.xpath("//div[contains(text(), 'E-posta adresiniz veya şifreniz hatalı')]"));
        return !webElements.isEmpty();
    }

    public boolean isPasswordAlertExists(){
        List<WebElement> webElements = driver.findElements(By.xpath("//div[contains(text(), 'Bu alanın doldurulması zorunludur.')]"));
        return !webElements.isEmpty();
    }

    public boolean isPasswordAlertMinCharExist(){
        List<WebElement> webElements = driver.findElements(By.xpath("//div[contains(text(), 'Girilen değer en az 6 karakter olmalıdır.')]"));
        return !webElements.isEmpty();
    }

    public boolean isPasswordAlertMaxCharExist(){
        List<WebElement> webElements = driver.findElements(By.xpath("//div[contains(text(), 'Girilen değer en fazla 15 karakter olmalıdır.')]"));
        return !webElements.isEmpty();
    }

}