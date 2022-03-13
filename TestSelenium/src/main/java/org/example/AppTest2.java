package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class AppTest2 {
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

        //Выбор и оплата товара.

        driver.findElement(By.xpath("//a[@href='http://automationpractice.com/index.php?id_category=3&controller=category'][1]")).click();
        driver.findElement(By.xpath("//img[@class='replace-2x img-responsive'][1]")).click();
        driver.findElement(By.xpath("//p[@id='add_to_cart']")).click();
        driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']")).click();
        driver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']")).click();
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("JoeBiden@mail.ru");
        driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("12345");
        driver.findElement(By.xpath("//i[@class='icon-lock left']")).click();
        driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']")).click();
        driver.findElement(By.xpath("//input[@id='cgv']")).click();
        driver.findElement(By.xpath("//button[@class='button btn btn-default standard-checkout button-medium']")).click();
        driver.findElement(By.xpath("//a[@class='bankwire']")).click();
        driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']")).click();
        driver.quit();



    }
}
