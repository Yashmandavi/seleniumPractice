package com.seleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Practice2 {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://github.com/");
        driver.get("https://demo.nopcommerce.com/");

        driver.navigate().back();
         driver.manage().window().fullscreen();
         driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.navigate().forward();

        driver.navigate().refresh();

    }
}
