package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {

    WebDriver driver;
    String productName1;
    String productName2;
//    private final By  = By.id("add-to-cart-sauce-labs-backpack");

//    private final  add-to-cart-sauce-labs-bike-light



    // constructor
    public ProductPage(WebDriver driver)
    {
        this.driver=driver;
    }


//    Actions
    public void SelectProduct(String productName1, String productName2){
        By Product1 = By.id(productName1);
        driver.findElement(Product1).click();

        By Prpduct2 = By.id("add-to-cart-sauce-labs-"+productName2);
        driver.findElement(Prpduct2).click();







//        By Product2 = By.id(productName2);
//
//
//        driver.findElement(Product2).click();
    }

}
