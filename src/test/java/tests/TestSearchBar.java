package tests;

import static org.junit.Assert.assertEquals;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import pages.HomePage;
import pages.Products;

public class TestSearchBar {
	
	WebDriver driver;
	HomePage objHomePage;
	Products objProducts;
	
	
	/**
	 * Executed before Test
	 */
	@Before
    public void setup(){
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
        driver.get("https://shop.demoqa.com/");
        driver.manage().window().maximize();
    }
	
	/**
	 * Executed after Test
	 */
	@After
    public void tearDown(){
		driver.close();
    }
	
	/**
	 * Test "dress" onsearch input and get 16 Products
	 */
	@Test
	public void testSearchOnDemoShopQa() {
		// Instance of POM homepage
		objHomePage = new HomePage(driver);
		
		// Rechercher l'element search et cliquer dessus
		objHomePage.clickSearchElement();
		
		// Rechercher l'input de recherche, écrire "dress" dedans, et presser ENTRER
		objHomePage.setSearchInputElement("Dress");

		objProducts = new Products(driver);
		assertEquals(16, objProducts.getNumberOfArticles());
	}
}
