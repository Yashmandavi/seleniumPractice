package com.seleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nop {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.className("ico-register")).click();
       WebElement Selectionofgender = driver.findElement(By.id("gender"));
       driver.findElement(By.className("male")).click();

        driver.findElement(By.id("FirstName")).sendKeys("yash");
        driver.findElement(By.id("LastName")).sendKeys("mandaviya");
        driver.findElement(By.name("DateOfBirthDay")).sendKeys("7");
        driver.findElement(By.name("DateOfBirthMonth")).sendKeys("10");
        driver.findElement(By.name("DateOfBirthYear")).sendKeys("1997");
        driver.findElement(By.id("Email")).sendKeys("yashmandaviya121310@gmail.com");
        driver.findElement(By.id("Company")).sendKeys("YASH");

        driver.findElement(By.name("Password")).sendKeys("Yash@123");

        driver.findElement(By.name("ConfirmPassword")).sendKeys("Yash@123");
        driver.findElement(By.name("register-button")).click();
        /////////////////////////////////////////////////////////////////////////////
        driver.findElement(By.id("dialog-notifications-success")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[2]/li[1]/ul/li[1]/a")).click();

        driver.findElement(By.className("products-orderby")).sendKeys("5");
        driver.findElement(By.name("products-pagesize")).sendKeys("6");
        driver.findElement(By.className("button-2 product-box-add-to-cart-button")).click();

    }
}
