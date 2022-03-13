package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import java.util.concurrent.TimeUnit;

public class Main {

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


        //Регистрация пользователя.

        driver.findElement(By.xpath("//a[@class='login']")).click();
        driver.findElement(By.xpath("//input[@class='is_required validate account_input form-control']")).sendKeys("JoeBiden@mail.ru");
        driver.findElement(By.xpath("//button[@class='btn btn-default button button-medium exclusive']")).click();
        driver.findElement(By.xpath("//input[@id='id_gender1']")).click();
        driver.findElement(By.xpath("//input[@class='is_required validate form-control']")).sendKeys("Joe");
        driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys("Biden");
        driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("12345");
        driver.findElement(By.xpath("//select[@id='days']")).sendKeys("5");
        driver.findElement(By.xpath("//select[@id='months']")).sendKeys("May");
        driver.findElement(By.xpath("//select[@id='years']")).sendKeys("1994");
        driver.findElement(By.xpath("//input[@id='newsletter']")).click();
        driver.findElement(By.xpath("//input[@id='company']")).sendKeys("Professional");
        driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("666-Street,98989");
        driver.findElement(By.xpath("//input[@id='address2']")).sendKeys("Tower");
        driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Osten");
        driver.findElement(By.xpath("//select[@id='id_state']")).sendKeys("Texas");
        driver.findElement(By.xpath("//input[@class='form-control uniform-input text']")).sendKeys("19840");
        driver.findElement(By.xpath("//select[@id='id_country']")).sendKeys("United States");
        driver.findElement(By.xpath("//textarea[@id='other']")).sendKeys("(555)111-8929");
        driver.findElement(By.xpath("//input[@id='phone']")).sendKeys(" (934) 444 5557");
        driver.findElement(By.xpath("//input[@id='phone_mobile']")).sendKeys("(222)444 5555");
        driver.findElement(By.xpath("//input[@id='alias']")).sendKeys("Automator");
        driver.findElement(By.xpath("//button[@id='submitAccount']")).click();
        driver.quit();




    }

}
