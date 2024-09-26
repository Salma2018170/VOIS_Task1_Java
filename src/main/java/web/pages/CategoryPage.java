package web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CategoryPage {
    private WebDriver driver;
    //Locator
    By itemField=By.cssSelector(".s-main-slot .s-result-item:nth-of-type(1)");
    public CategoryPage(WebDriver driver){
        this.driver=driver;
    }
    public SubCategoryPage selectItem(){
        driver.findElement(itemField).click();
        return new SubCategoryPage(driver);
    }
}
