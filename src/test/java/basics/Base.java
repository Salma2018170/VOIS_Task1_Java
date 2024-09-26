package basics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import web.pages.*;

public class Base {
    protected WebDriver driver;
    //URL
    String URL="https://www.amazon.com/";
    //Pages
    protected HomePage homePage;
    protected CategoryPage categoryPage;
    protected SubCategoryPage subCategoryPage;
    protected CartPage cartPage;
    protected TodaysDealsPage dealsPage;
    @BeforeClass
    public void setUp(){
        driver=new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1024,768));
        driver.get(URL);
        homePage=new HomePage(driver);
    }

//    @AfterClass
//    public void tearDown(){
//        driver.quit();
//    }
}
