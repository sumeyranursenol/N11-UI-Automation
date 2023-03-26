package com.example.testproject.N11Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.example.testproject.N11Methods.Methods;
import java.util.List;
import org.openqa.selenium.By;

public class EmailBox extends Methods {

    public By eMailInput = By.id("email");

    public EmailBox(WebDriver driver){
        super(driver);
    }

    public void typeTextEmail(String text){
        setText(eMailInput, text);
    }

    public boolean isEmailAlertExists(){
        List<WebElement> webElements = driver.findElements(By.xpath("//div[contains(text(), 'Lütfen e-posta adresinizi girin.')]"));
        return !webElements.isEmpty();
    }

    public boolean isEmailAlertValidExists(){
        List<WebElement> webElements = driver.findElements(By.xpath("//div[contains(text(), 'Lütfen geçerli bir e-posta adresi girin.')]"));
        return !webElements.isEmpty();
    }
    
}