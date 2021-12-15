package com.seleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googletranslater {
    public static void main(String[] args) {


        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.google.com/search?q=google+translate&oq=google&aqs=chrome.4.69i59j46i131i199i433i465i512j0i433i512l2j0i131i433i512j69i60l3.6598j1j7&sourceid=chrome&ie=UTF-8");


    }

}