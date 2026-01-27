package hooks;

import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.*;
import com.aventstack.extentreports.markuputils.*;
import com.aventstack.extentreports.reporter.*;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.aventstack.extentreports.reporter.configuration.ViewName;
import Datepicker.Dateformatter;
import Drivemanager.Driver;
import io.cucumber.java.*;

public class Hooks {

    // Thread-safe driver for each thread
    ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    // ExtentReports (shared), ExtentTest (thread-local)
    private static ExtentReports extent;
    private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();

    public static ExtentTest getExtentTest() {
        return test.get();
    }
    
    public static void removeExtentTest() {
        test.remove();
    }

    @BeforeAll
    public static void beforeAll() throws Exception {
        System.out.println("================ BEFORE ALL ================");

        // Initialize ExtentReports only once
        ExtentSparkReporter srp = new ExtentSparkReporter("Reports/UMS_Report.html")
                .viewConfigurer()
                .viewOrder()
                .as(new ViewName[] { ViewName.DASHBOARD, ViewName.TEST, ViewName.CATEGORY })
                .apply();
        srp.config().setTheme(Theme.STANDARD);
        srp.config().setDocumentTitle("UMS Consolidated Report");
        srp.config().setReportName("Extent Report for All Scenarios");

        extent = new ExtentReports();
        extent.attachReporter(srp);
    }

    @AfterAll
    public static void afterAll() throws Exception {
        System.out.println("================ AFTER ALL ================");
        if (extent != null) {
            extent.flush(); // Finalize the report
        }
    }

    @Before
    public void beforeScenario(Scenario scenario) throws Exception {
        // Initialize WebDriver for this thread
        Driver.initDriver();
        driver.set(Driver.getDriver());

        // Create a new ExtentTest for this scenario
        test.set(extent.createTest(scenario.getName()));
    }

    @AfterStep
    public void afterStep(Scenario scenario) {
        if (scenario.isFailed()) {
            String screenshotBase64 = Dateformatter.Capsre(); // Your screenshot logic
            String logMessage = MarkupHelper.createLabel("Failed Step", ExtentColor.RED).getMarkup()
                    + "<br><img src='data:image/png;base64," + screenshotBase64 + "' height='200' width='300'/>";
            test.get().fail(logMessage);
        }
    }

    @After
    public void afterScenario() {
//        // Quit WebDriver for this thread
//        if (driver.get() != null) {
//            driver.get().quit();
//            driver.remove();
//        }
//        test.remove(); // Remove ExtentTest from ThreadLocal
//        
     // Quit the WebDriver for this scenario/thread
        Driver.quitDriver();

        // Remove ExtentTest for this thread
        Hooks.removeExtentTest();
    }
}


/*package hooks;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.aventstack.extentreports.reporter.configuration.ViewName;
import Datepicker.Dateformatter;
import Drivemanager.Driver;
import io.cucumber.java.*;

public class Hooks {

    static WebDriver driver = Driver.getDriver();
    
    static ExtentReports exp;
    static ExtentTest test1;
    
    public static ExtentTest getExtentTest() {
        return test1;
    }

    @BeforeAll
    public static void before_all() throws Exception {
        System.out.println("================ BEFORE ALL ================");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

        // Initialize ExtentReports and configure it once
        ExtentSparkReporter srp = new ExtentSparkReporter("Reports/UMS_Report.html")
                .viewConfigurer()
                .viewOrder()
                .as(new ViewName[] { ViewName.DASHBOARD, ViewName.TEST, ViewName.CATEGORY })
                .apply();
        srp.config().setTheme(Theme.STANDARD);
        srp.config().setDocumentTitle("UMS Consolidated Report");
        srp.config().setReportName("Extent Report for All Scenarios");

        exp = new ExtentReports();
        exp.attachReporter(srp);
    }

    @AfterAll
    public static void after_all() throws Exception {
        System.out.println("================ AFTER ALL ================");
        if (exp != null) {
            exp.flush(); // Finalize the report
        }
        
       // driver.quit(); // Close WebDriver after all tests
    }

    @AfterStep
    public void afterStep(Scenario scenario) {
    	ExtentColor color = ExtentColor.RED;
        String screenshotBase64 = Dateformatter.Capsre();
	    
	    // Construct the log message with color label and embedded image
	    String logMessage = MarkupHelper.createLabel("failed step", color).getMarkup() +
	                        "<br><img src='data:image/png;base64," + screenshotBase64 + "' height='200' width='300'/>";

        if (scenario.isFailed()) {
            test1.fail(logMessage);
        } 
    }

    @Before
    public void bef(Scenario scenario) throws Exception {
    	
        // Create a new test for each scenario
        test1 = exp.createTest(scenario.getName());
    }

    @After
    public void cleanup() throws Exception {
        // You no longer need to flush here since it's done in @AfterAll
    	
    }
}*/
