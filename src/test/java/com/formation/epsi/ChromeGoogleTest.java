package com.formation.epsi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeGoogleTest {
	public void testOpenGoogle() {
		// TODO Auto-generated method stub
		
		// Appel de la racine du projet
		String projectPath = System.getProperty("user.dir");
		
		// Ajout de Chrome webdriver (ChromeDriver)
		System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver/chromedriver.exe");
		
		// Instanciation de l'objet
		WebDriver driver = new ChromeDriver();
		
		// Naviguer vers l'url
		driver.get("https://www.google.fr");
	}
}
