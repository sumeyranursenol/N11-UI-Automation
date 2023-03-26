package com.example.testproject.N11Pages;
import org.openqa.selenium.WebDriver;
import com.example.testproject.N11Methods.Methods;
import org.openqa.selenium.By;

public class LoginApple extends Methods {

   public By loginWithAppleButton = By.xpath("//a[@class='apple-login-btn']");

   public LoginApple(WebDriver driver){
      super(driver);
   }

   public LoginApple clickLoginWithAppleButton(){
      click(loginWithAppleButton);
      return this;
   }
   

}