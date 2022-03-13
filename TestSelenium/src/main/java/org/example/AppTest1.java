package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import java.util.concurrent.TimeUnit;

public class AppTest1 {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("incognito");
        options.addArguments("disable-popup-blocking");

        WebDriver driver = new ChromeDriver(options);
        driver.get("http://automationpractice.com");
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);



                //Добавить в корзину товар и удалить.

                driver.findElement(By.xpath("//a[@class='sf-with-ul'][1]")).click();
                driver.findElement(By.xpath("//img[@class='replace-2x img-responsive'][1]")).click();
                driver.findElement(By.xpath("//p[@id='add_to_cart']")).click();
                driver.findElement(By.xpath("//span[@class='cross']")).click();
                driver.findElement(By.xpath("//a[@href='http://automationpractice.com/index.php?controller=order'][1]")).click();
                driver.findElement(By.xpath("//i[@class='icon-trash']")).click();
                driver.quit();





    }
}

