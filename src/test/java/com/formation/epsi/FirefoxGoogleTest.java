package com.formation.epsi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxGoogleTest {
	public void testOpenGoogle() {
		// TODO Auto-generated method stub
		
		// Appel de la racine du projet
		String projectPath = System.getProperty("user.dir");
		
		// Ajout de firefox webdriver (GeckoDriver)
		System.setProperty("webdriver.gecko.driver", projectPath + "/drivers/geckodriver/geckodriver.exe");
		
		// Instanciation de l'objet
		WebDriver driver = new FirefoxDriver();
		
		// Naviguer vers l'url
		driver.get("https://www.google.fr");
	}
}
