package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test3 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--incognito");
        options.addArguments("disable-popup-blocking");


        WebDriver driver = new ChromeDriver(options);
        driver.get("https://ribomaniya.ru/");

        driver.findElement(By.xpath("//a[local-name() = 'a' and contains(@class, 'dropdown-item') and text() = 'Приманки']")).click();
        driver.findElement(By.xpath("//a[local-name() = 'a' and contains(@class, 'btn btn-primary btn-shadow') and text() = 'подробнее']")).click();

        driver.quit();







    }
}
