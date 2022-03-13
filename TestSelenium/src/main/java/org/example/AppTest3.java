package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class AppTest3 {
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


        //Проверка работы функции "Связаться с нами" отправка формы.


        driver.findElement(By.xpath("//a[@href='http://automationpractice.com/index.php?controller=contact']")).click();
        Select dropdown = new Select(driver.findElement(By.xpath("//select[@class='form-control']")));
        dropdown.selectByVisibleText("Customer service");
        driver.findElement(By.xpath("//input[@class='form-control grey validate']")).sendKeys("JoeBiden@mail.ru");
        driver.findElement(By.xpath("//textarea[@class='form-control']")).sendKeys("Спасибо за этот тренажёр.");
        driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']")).click();
        driver.quit();

    }
}
