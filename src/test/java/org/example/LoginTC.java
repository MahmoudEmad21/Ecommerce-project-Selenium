package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTC {

    public static WebDriver driver;
    LoginPage  l;
    ProductPage P;
    String productName = "add-to-cart-sauce-labs-bike-light";
    String ProductName2 = "backpack";


    @BeforeTest
    public void OpenBrowser(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.saucedemo.com");
}
    @Test
    public void LoginTestCase() throws InterruptedException {
        l = new LoginPage(driver);
        l.LoginSteps();
        Thread.sleep(3000);

        P = new ProductPage(driver);
        P.SelectProduct(productName,ProductName2);
        Thread.sleep(3000);

    }


    @AfterTest
    public void closeBrowser(){
        driver.close();
    }
}
