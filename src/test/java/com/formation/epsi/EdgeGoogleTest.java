package com.formation.epsi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeGoogleTest {
	public void testOpenGoogle() {
		// TODO Auto-generated method stub
		
		// Appel de la racine du projet
		String projectPath = System.getProperty("user.dir");
		
		// Ajout de MsEdge webdriver (MsEdgeDriver)
		System.setProperty("webdriver.edge.driver", projectPath + "/drivers/msedgedriver/msedgedriver.exe");
		
		// Instanciation de l'objet
		WebDriver driver = new EdgeDriver();
		
		// Naviguer vers l'url
		driver.get("https://www.google.fr");
	}
}
