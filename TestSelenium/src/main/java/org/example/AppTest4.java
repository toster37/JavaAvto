package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class AppTest4 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("incognito");
        options.addArguments("disable-popup-blocking");
        WebDriver driver = new ChromeDriver(options);
        driver.get("http://automationpractice.com");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //Авторизация пользователя.

        driver.findElement(By.xpath("//a[@class='login']")).click();
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("JoeBiden@mail.ru");
        driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("12345");
        driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
        driver.quit();




    }
}
