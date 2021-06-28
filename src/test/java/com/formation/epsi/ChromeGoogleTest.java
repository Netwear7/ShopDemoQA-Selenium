package com.formation.epsi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeGoogleTest {
	/**
	 * Test open google with Selenium on Chrome
	 */
	public void testOpenGoogle() {		
		// Ancienne méthode :
		// Appel de la racine du projet
		// String projectPath = System.getProperty("user.dir");
		// Ajout de Chrome webdriver (ChromeDriver)
		// System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver/chromedriver.exe");
		
		
		// Set up WebDriverManager
		WebDriverManager.chromedriver().setup();
		
		// Instanciation de l'objet
		WebDriver driver = new ChromeDriver();
		
		// Naviguer vers l'url
		driver.get("https://www.google.fr");
		driver.quit();
	}
}
