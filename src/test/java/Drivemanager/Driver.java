

package Drivemanager;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {

    // ThreadLocal ensures each thread gets its own driver for multi-tenant parallel tests
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    /**
     * Initialize WebDriver (if not already initialized for this thread)
     */
    public static void initDriver() {
        if (driver.get() == null) { // Only initialize if not already
            WebDriverManager.chromedriver().setup();

            ChromeOptions options = new ChromeOptions();
             options.addArguments("--headless=new"); // Uncomment if headless needed
            options.setAcceptInsecureCerts(true);
            options.addArguments("force-device-scale-factor=0.70");
            options.addArguments("high-dpi-support=0.80");

            Map<String, Integer> timeouts = new HashMap<>();
            timeouts.put("implicit", 30000);
            options.setCapability("timeouts", timeouts);

            // Set ChromeDriver for this thread
            driver.set(new ChromeDriver(options));
            driver.get().manage().window().maximize();
        }
    }

    /**
     * Get WebDriver for current thread
     */
    public static WebDriver getDriver() {
        return driver.get();
    }

    /**
     * Quit WebDriver for current thread
     */
    public static void quitDriver() {
        if (driver.get() != null) {
            driver.get().quit();
            driver.remove(); // Remove driver from ThreadLocal storage
        }
    }
}
//package Drivemanager;
//
//import java.util.HashMap;
//
//import java.util.Map;
//
//import org.openqa.selenium.WebDriver;
//
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import org.openqa.selenium.chrome.ChromeOptions;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class Driver {
//
//
//	public static WebDriver driver;
//
//	static {		
//
//		WebDriverManager.chromedriver().setup();
//
//		ChromeOptions options = new ChromeOptions();
////		options.addArguments("--headless=new");
//		options.setAcceptInsecureCerts(true); 
//
//		options.addArguments("force-device-scale-factor=0.70");
//
//		options.addArguments("high-dpi-support=0.80");
//
//		Map<String, Integer> timeouts = new HashMap<String, Integer>();
//
//		timeouts.put("implicit", 30000);
//
//		options.setCapability("timeouts", timeouts);
//
//		driver = new ChromeDriver(options);
//
//	}
//
//	public void setupBrowser() {
//
//	}
//
//	public static WebDriver getDriver() {
//
//		return driver;
//
//	}
//
//}
//

