package com.formation.epsi;

import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxGoogleTest {
	/**
	 * Test open google with Selenium on Firefox
	 */
	public void testOpenGoogle() {	
		// Ancienne méthode :
		// Appel de la racine du projet
		// String projectPath = System.getProperty("user.dir");
		// Ajout de firefox webdriver (GeckoDriver)
		// System.setProperty("webdriver.gecko.driver", projectPath + "/drivers/geckodriver/geckodriver.exe");
		
		
		// Set up WebDriverManager
		WebDriverManager.firefoxdriver().setup();
		
		// Instanciation de l'objet
		WebDriver driver = new FirefoxDriver();
		
		// Naviguer vers l'url
		driver.get("https://www.google.fr");
		driver.quit();
	}
}
