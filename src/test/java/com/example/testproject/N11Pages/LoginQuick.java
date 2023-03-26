package com.example.testproject.N11Pages;
import org.openqa.selenium.WebDriver;
import com.example.testproject.N11Methods.Methods;
import org.openqa.selenium.By;

public class LoginQuick extends Methods {

     public By quickLoginButton = By.xpath("//a[@class='quickLogin ']");

     public LoginQuick(WebDriver driver){
        super(driver);
     }

    public LoginQuick clickQuickLoginButton(){
        click(quickLoginButton);
        return this;
    }

}