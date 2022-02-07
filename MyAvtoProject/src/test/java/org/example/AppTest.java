package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 * Unit test for simple App.
 */
public class AppTest 
{


    @Test
    public void shouldAnswerWithTrue()
    {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--incognito");
        options.addArguments("disable-popup-blocking");


        WebDriver driver = new ChromeDriver(options);


        driver.get("https://ribomaniya.ru/");

        WebElement webElement = driver.findElement(By.xpath("//div[@class='dropdown-submenu']//a"));
        webElement.click();
        WebElement webElement1 = driver.findElement(By.xpath("//div[@class='px-0 p-1 p-sm-3 mt-auto']//a"));
        webElement1.click();
        WebElement webElement2 = driver.findElement(By.xpath("//div[@class='px-0 p-1 p-sm-3 fs-4 fw-bold mt-auto']//a"));
        webElement2.click();
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(webElement2));





        driver.quit();


       WebElement webElement3 = driver.findElement(By.xpath("//*[local-name() = 'a' and contains(@class, 'dropdown-item') and text() = 'Катушки']"));
       webElement3.click();



































    }
}
