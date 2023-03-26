package com.example.testproject.N11Test;

import com.example.testproject.N11Pages.N11LoginPage;
import com.example.testproject.N11Pages.N11MainPage;
import com.example.testproject.N11Pages.EmailBox;
import com.example.testproject.N11Pages.LoginApple;
import com.example.testproject.N11Pages.LoginFacebook;
import com.example.testproject.N11Pages.LoginQuick;
import com.example.testproject.N11Pages.PasswordBox;

import org.testng.Assert;
import org.testng.annotations.Test;


public class N11MainTest extends N11BaseTest {

    private static final String N11LoginPage = null;
    N11MainPage n11MainPage;
    N11LoginPage n11LoginPage;
    EmailBox eMailBox;
    PasswordBox passwordBox;
    

    @Test
    public void emptyArea(){
        n11LoginPage.clickLoginButtonLoginPage();
        Assert.assertTrue(eMailBox.isEmailAlertExists(), "Lütfen e-posta adresinizi girin.");
        Assert.assertTrue(passwordBox.isPasswordAlertExists(), "Bu alanın doldurulması zorunludur.");
    }

    @Test
    public void successLogin(){
        eMailBox.typeTextEmail("sumeyrasenol123@gmail.com");
        passwordBox.typeTextPassword("sum.58.58");
        n11LoginPage.clickLoginButtonLoginPage();
        Assert.assertTrue();
    }

    @Test
    public void validEmailInvalidPassword(){
        eMailBox.typeTextEmail("sumeyrasenol123@gmail.com");
        passwordBox.typeTextPassword("testpassword");
        n11LoginPage.clickLoginButtonLoginPage();
        Assert.assertTrue(passwordBox.isInvalidPasswordOrEpostaAlertExist(), "E-posta adresiniz veya şifreniz hatalı");
    }
     @Test
     public void invalidEmailValidPassword(){
        eMailBox.typeTextEmail("text");
        passwordBox.typeTextPassword("sum.58.58");
        n11LoginPage.clickLoginButtonLoginPage();
        Assert.assertTrue(passwordBox.isInvalidPasswordOrEpostaAlertExist(), "E-posta adresiniz veya şifreniz hatalı");
     }


    @Test
    public void invalidEmailInvalidPassword(){
        eMailBox.typeTextEmail("text");
        passwordBox.typeTextPassword("testpassword");
        n11LoginPage.clickLoginButtonLoginPage();
        Assert.assertTrue(eMailBox.isEmailAlertValidExists(), "Lütfen geçerli bir e-posta adresi girin.");
    }

    @Test
    public void minPasswordChar(){
        eMailBox.typeTextEmail("sumeyrasenol123@gmail.com");
        passwordBox.typeTextPassword("a");
        n11LoginPage.clickLoginButtonLoginPage();
        Assert.assertTrue(passwordBox.isPasswordAlertMinCharExist(), "Girilen değer en az 6 karakter olmalıdır.");
    }
    @Test
    public void maxPasswordChar(){
        eMailBox.typeTextEmail("sumeyrasenool123@gmail.com");
        passwordBox.typeTextPassword("12345678910121314");
        n11LoginPage.clickLoginButtonLoginPage();
        Assert.assertTrue(passwordBox.isPasswordAlertMaxCharExist(), "Girilen değer en fazla 15 karakter olmalıdır.");
    }

    @Test
    public void loginWithApple(){
        n11LoginPage.clickLoginWithAppleButton();
        Assert.assertTrue();
    }

    @Test
    public void quickLogin(){
        N11LoginPage.clickQuickLoginButton();
        Assert.assertTrue();
    }
    

    @Test
    public void loginWithFacebook(){
        N11LoginPage.clickLoginWithFacebookButton();
        Assert.assertTrue();
    }
    

}