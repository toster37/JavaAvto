package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test5 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--incognito");
        options.addArguments("disable-popup-blocking");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://ribomaniya.ru/");


        driver.findElement(By.id("title-search-input")).sendKeys("Запчасти");
        driver.findElement(By.id("title-search-input")).submit();
        driver.findElement(By.xpath("//img[@class='card-img p-2 p-lg-3 border shadow mt-3 bg-white']")).click();
        driver.quit();




    }
}
