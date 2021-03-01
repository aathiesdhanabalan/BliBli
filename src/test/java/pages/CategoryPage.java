package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.BasePage;

import static utils.Driver.driver;
import static utils.PropertyReader.prop;


public class CategoryPage {
    BasePage b=new BasePage();
    public void find_element()
    {
        WebElement webElement= driver.findElementById("blibli.mobile.commerce:id/tv_search_count");
        Assert.assertTrue(webElement.getText().contains(prop.getProperty("product")));
    }
    public void navigate()
    {
        b.clickByText(prop.getProperty("Category"), 10);
    }

    public void second_navigate() {
        b.clickByText(prop.getProperty("Text_name"),10);
        b.clickByText(prop.getProperty("product"),10 );
        b.clickByText(prop.getProperty("Variable"),10);
    }

    public void scrollclick() {
        b.scrollToElementWithText(prop.getProperty( "endtext"),10);
        b.clickByText(prop.getProperty("endtext"),10);
    }
}
