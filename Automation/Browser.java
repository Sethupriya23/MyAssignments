package Automation;

public class Browser {

	   // Method to launch a browser
	
    public String launchBrowser(String browserName) {
        System.out.println("Browser launched successfully: " + browserName);
        return browserName;
    }

    // Method to load a URL
    
    public void loadURL(String url) {
        System.out.println("Application URL loaded successfully: " + url);
    }
}