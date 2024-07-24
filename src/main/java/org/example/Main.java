package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
//        System.setProperty("webdriver.chrome.driver", "/Users/gerontiliparteliani/Desktop/GoogleChromeforTesting.app");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
        System.out.println("Hello world!");
        driver.quit();
    }
}