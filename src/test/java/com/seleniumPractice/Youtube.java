package com.seleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Youtube {
    WebDriver driver;
    String baseUrl = "https://www.youtube.com/";

    @Before
    public void youTubePlayer(){
        WebDriverManager.chromedriver().setup();
        driver =  new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

    }

    @Test
    public void playTime() {
        driver.get(baseUrl);
         WebElement signinbutton=  driver.findElement(By.id("text"));
         signinbutton.click();



        WebElement agreebutton = driver.findElement(By.className("style-scope ytd-button-renderer style-primary size-default"));
        agreebutton.click();

    }
         @Test
        public void music1(){
         WebElement searchbutton = driver.findElement(By.id("search"));

        searchbutton.click();


         }

    @Before
    public void tearDown(){

    }

}

