package Runner;

import org.testng.annotations.BeforeClass;

import Stepdefinitions.loginpage_steps;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features = {"src/test/resources/Features/Alogin.feature"}
///Registrar Loginpage.feature","src/test/resources/prakash/Registrar Dashboard.feature","src/test/resources/prakash/Registrar Applications.feature","src/test/resources/prakash/Registrar Domainpage.feature","src/test/resources/prakash/Registrar Invoice.feature","src/test/resources/prakash/Registar settings DRuserManagement.feature","src/test/resources/prakash/Registrar settings Registrantusermanagement.feature","src/test/resources/prakash/Registrar settings Registrantofficers.feature","src/test/resources/prakash/Registrar settings Roles.feature","src/test/resources/prakash/Registrar settings Department.feature"}
		,
glue = {"Stepdefinitions","hooks"},
dryRun = false,
plugin = {"pretty","html:target/cucu-report.html","json:target/cuc"}
//,"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
//"org.simplestudio.cucumber.XlsFormatter"}
,monochrome = true
		,publish = true)
 
public class Runnerclass extends AbstractTestNGCucumberTests {
	
	@BeforeClass
    public void releaseBrowsers() {
        // Release the latch so all browsers start at the same time
        loginpage_steps.releaseAllBrowsers();
    }
	

	@Override
    @org.testng.annotations.DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
	
}
  