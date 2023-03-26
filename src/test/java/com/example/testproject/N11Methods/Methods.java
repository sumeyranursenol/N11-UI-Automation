package com.example.testproject.N11Methods;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Methods {
    public WebDriver driver;
    public WebDriverWait wait;

    public Methods(WebDriver driver){
        this.driver = driver;
    }

    public void waitFor(By locator){
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public WebElement findByLocator(By locator){   
        return driver.findElement(locator);
    }

    public void tabHandle(){
        ArrayList<String> tabs_windows = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs_windows.get(1));
    }

    public void click(By locator){   
        waitFor(locator);
        findByLocator(locator).click();
    }

    public void setText(By locator, String text){   
        waitFor(locator);
        findByLocator(locator).sendKeys(text);
    }
    
    public boolean isDisplayed(By locator){   
        waitFor(locator);
        return findByLocator(locator).isDisplayed();
    }
}
