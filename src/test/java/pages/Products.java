package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Products {
	
	WebDriver driver;
	By productsElements = By.className("noo-product-item");
	
	public Products(WebDriver driver){
		this.driver = driver;
	}
	
	/**
	 * Get number of Products
	 */
	public int getNumberOfArticles(){
		List<WebElement> listProducts = driver.findElements(productsElements);
		return listProducts.size();
	}
}
