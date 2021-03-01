package steps;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.*;
import utils.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import utils.Driver;
import java.io.IOException;
import java.util.List;

import static utils.Driver.driver;
import static utils.Driver.setUpDriver;
import static utils.PropertyReader.prop;

public class AbuseReportSteps extends BasePage {
    BasePage b=new BasePage();
    CategoryPage categoryPage=new CategoryPage();
    @BeforeTest
    public void setupDriverTest() throws IOException , InterruptedException{
        setUpDriver();
        Thread.sleep(1000);
    }

    @Test(priority = 1)
    public void clickCategoryTab() throws InterruptedException {
        categoryPage.navigate();
    }
    @Test (priority = 2)
    public void clicktext() throws InterruptedException
    {
       categoryPage.second_navigate();
    }
    @Test (priority = 3)
    public void element_id_founder() throws InterruptedException{
        categoryPage.find_element();
    }
    @Test (priority = 4)
    public void scrolltoelement() throws InterruptedException{
        categoryPage.scrollclick();
    }
    @AfterTest
    public void AfterTest()
    {
        driver.quit();
    }

}
