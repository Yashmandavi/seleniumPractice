package com.seleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmail {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://mail.google.com/mail/u/0/?tab=rm&ogbl#inbox");
        driver.navigate().to("https://demo.nopcommerce.com/register?returnUrl=%2F");
        driver.navigate().refresh();

    }
}
