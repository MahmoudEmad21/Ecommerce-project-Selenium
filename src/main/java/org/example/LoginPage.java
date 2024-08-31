package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LoginPage {
    WebDriver driver;
    private final By userNameField = By.id("user-name");
    private final By passwordField = By.id("password");
    private final By submitButton = By.id("login-button");
//    private final By UserText = By.xpath("//*[@id='login_credentials']/text()[2]");
//    private final By PassText = By.xpath("/html/body/div[2]/div[2]/div/div[2]/text()[2]");


    // constructor
    public LoginPage(WebDriver driver)
    {
        this.driver=driver;
    }


    public void LoginSteps(){
//        String UserName = driver.findElement(UserText).getText();
//        String Pass = driver.findElement(PassText).getText();
        driver.findElement(userNameField).sendKeys("standard_user");
        driver.findElement(passwordField).sendKeys("secret_sauce");
        driver.findElement(submitButton).click();
    }



}
