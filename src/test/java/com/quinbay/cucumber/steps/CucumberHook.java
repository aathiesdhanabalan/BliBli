package com.quinbay.cucumber.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * @author kumar on 12/01/21
 * @project X-search
 */
public class CucumberHook {

    static WebDriver driver;
    @Before
    public void testBefore(){
        System.setProperty("webdriver.chrome.driver","/Users/athies/Downloads/PageObjectModel/src/main/resources/driver/chromedriver");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/");
        System.out.println("This is a demo of before hook");
    }
    @After
    public void testAfter(){
        System.out.println("This is a demo of after hook");
        driver.quit();
        driver.close();
    }
    public WebDriver getDriver(){
        return driver;
    }
}