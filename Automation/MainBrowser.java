package Automation;

public class MainBrowser {
	
	public static void main(String[] args) {
        // Creating an object of Browser class
        Browser browser = new Browser();

        // Launching a browser
        String browserName = browser.launchBrowser("Chrome");

        // Loading a URL
        browser.loadURL("https://www.google.com");
    }
}


