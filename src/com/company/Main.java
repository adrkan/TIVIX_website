package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main
    {
    private WebDriver driver;

    public static void main(String[] args) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "C:\\TestFiles\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.tivix.com/");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='services'])[1]/following::span[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='UI/UX DESIGN'])[1]/following::button[1]")).click();
        Thread.sleep(1000);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Below the links to the subpages of Case Studies");
        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='services'])[1]/following::span[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='UI/UX DESIGN'])[2]/following::button[1]")).click();
        Thread.sleep(1000);
        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='services'])[1]/following::span[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='UI/UX DESIGN'])[3]/following::button[1]")).click();
        Thread.sleep(1000);
        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='services'])[1]/following::span[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='API DEVELOPMENT'])[1]/following::button[1]")).click();
        Thread.sleep(1000);
        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='services'])[1]/following::span[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='WEB APP DEVELOPMENT'])[5]/following::button[1]")).click();
        System.out.println(driver.getCurrentUrl());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public void tearDown() {
        driver.quit();
    }

}