package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class App {

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--incognito");
        options.addArguments("disable-popup-blocking");


        WebDriver driver = new ChromeDriver(options);
        driver.get("https://ribomaniya.ru/");



       driver.findElement(By.xpath("//div[@class='dropdown-submenu']//a")).click();
       driver.findElement(By.xpath("//div[@class='px-0 p-1 p-sm-3 mt-auto']//a")).click();
       driver.quit();





    }

}