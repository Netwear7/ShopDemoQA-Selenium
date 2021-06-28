package com.formation.epsi;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Test Open google with Firefox
		FirefoxGoogleTest testFirefox = new FirefoxGoogleTest();
		testFirefox.testOpenGoogle();
		
		// Test Open google with Google Chrome
		ChromeGoogleTest testChrome = new ChromeGoogleTest();
		testChrome.testOpenGoogle();
		
		// Test Open google with Microsoft Edge
		EdgeGoogleTest testEdge = new EdgeGoogleTest();
		testEdge.testOpenGoogle();
	}
}