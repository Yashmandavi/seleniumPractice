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

public class SeleniumPracticeJUnit {
    WebDriver driver;
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

    }


    @Test
    public void openHomepage(){
   driver.get(baseUrl);
   WebElement registerButton = driver.findElement(By.cssSelector(".ico-register"));
   registerButton.click();
  

    }


    @After
    public void tearDown(){
      //  driver.close();

    }
}
