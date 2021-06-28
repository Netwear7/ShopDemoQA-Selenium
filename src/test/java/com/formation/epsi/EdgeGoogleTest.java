package com.formation.epsi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EdgeGoogleTest {
	/**
	 * Test open google with Selenium on Edge
	 */
	public void testOpenGoogle() {
		// Ancienne méthode :
		// Appel de la racine du projet
		// String projectPath = System.getProperty("user.dir");
		// Ajout de MsEdge webdriver (MsEdgeDriver)
		// System.setProperty("webdriver.edge.driver", projectPath + "/drivers/msedgedriver/msedgedriver.exe");
		
		
		// Set up WebDriverManager
		WebDriverManager.edgedriver().setup();
		
		// Instanciation de l'objet
		WebDriver driver = new EdgeDriver();
		
		// Naviguer vers l'url
		driver.get("https://www.google.fr");
		driver.quit();
	}
}
