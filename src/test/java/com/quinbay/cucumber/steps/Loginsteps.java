package com.quinbay.cucumber.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Loginsteps {

   static WebDriver driver;
    @Given("I am on Facebook login page")
    public void iEnterLoginPageAs(){
        CucumberHook ob=new CucumberHook();
        driver=ob.getDriver();
        System.out.println("User in login page");
    }

    @When("I enter username as {string}")
    public void iEnterUsernameAs(String arg0) {
        WebElement usrname=driver.findElement(By.xpath("//input[@id='email']"));
        usrname.click();
        usrname.sendKeys(arg0);
        System.out.println("User enters name"+arg0);
    }

    @And("I enter password ad {string}")
    public void iEnterPasswordAd(String arg0) {
        WebElement pass=driver.findElement(By.xpath("//input[@id='pass']"));
        pass.click();
        pass.sendKeys(arg0);
        System.out.println("User enters password"+arg0);
    }

    @Then("Login should fail")
    public void loginShouldFail() throws InterruptedException {
        try{
            WebElement login=driver.findElement(By.xpath("//button[@name='login']"));
            login.submit();
            WebElement sorry=driver.findElement(By.xpath("//div[@class='core']"));
            if(sorry.isDisplayed())
            System.out.println("Login Button click and fails");
            else{
                System.out.println("Login pass");
                throw new Exception();
            }
            WebElement list = driver.findElement(By.xpath("//div[@id='error_box']"));
            if(list.isDisplayed())
                System.out.println("Login sucessfully failed");
            else
                throw new Exception();
        }
        catch (Exception e) {
            System.out.println("Invalid login");
        }
        driver.quit();
        driver.close();
    }

    @And("This is a test")
    public void thisIsATest() {
        System.out.println("This is a test package");
    }
}
