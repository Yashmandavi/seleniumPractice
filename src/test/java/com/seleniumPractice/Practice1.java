package com.seleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Practice1 {
    WebDriver driver;
    String baseUrl = "https://demo.nopcommerce.com/";
     @Before
    public void function(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

    }
    @Test
    public void click() {
        driver.get(baseUrl);
        WebElement loginbutton = driver.findElement(By.className("ico-login"));
        loginbutton.click();


        WebElement email = driver.findElement(By.className("email"));
        email.click();
        email.sendKeys("yashmandaviya1997@gmail.com");

        WebElement password = driver.findElement(By.className("password"));
        password.click();
        password.sendKeys("Yash@123");

    }

    @After
    public void close(){
      driver.close();
    }
}
