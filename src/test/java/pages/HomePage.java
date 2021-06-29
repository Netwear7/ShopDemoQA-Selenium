package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;
	By searchElement = By.className("noo-search");
	By searchInputElement = By.name("s");
	By productsElements = By.className("noo-product-item");

	
	public HomePage(WebDriver driver){
		this.driver = driver;
	}
	
	public void setSearchInputElement(String strSearch){
		driver.findElement(searchInputElement).sendKeys(strSearch + Keys.ENTER);
	}
	
    //Click on searchElement link
    public void clickSearchElement(){
    	driver.findElement(searchElement).click();
    }
}