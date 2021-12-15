package com.seleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Guru {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/login.html");

        

         WebElement emailsearchbutton = driver.findElement(By.id("email"));


        emailsearchbutton.click();
         emailsearchbutton.sendKeys("yashmandaviya1997@gmail.com");
          WebElement password= driver.findElement(By.name("passwd"));
          password.click();
          password.sendKeys("Yash@123");
          WebElement signinbutton = driver.findElement(By.id("SubmitLogin"));
          signinbutton.click();
         driver.close();
    }
}

