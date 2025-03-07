package Automation;

public class EdgeBrowser {

	  public static void main(String[] args) {
	        // Creating an object of Browser class
	        Browser browser = new Browser();

	        // Launching Edge Browser
	        String browserName = browser.launchBrowser("Edge");

	        // Loading a URL
	        browser.loadURL("https://www.microsoft.com");
	    }
	}