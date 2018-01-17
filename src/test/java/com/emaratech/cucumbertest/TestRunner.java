package com.emaratech.cucumbertest;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
 
import java.io.File;
import java.net.InetAddress;
import java.net.UnknownHostException;
 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/Feature"
		,glue= "com/emaratech/tests"
		,plugin = {"com.cucumber.listener.ExtentCucumberFormatter:TestExecutionReports/VisionCore_RestAPI_AutomatedTestExecution_Report.html"}
		,format = {"pretty","html:target/cucumber"}
		,monochrome = true
		)
 
public class TestRunner {
 
		
	@AfterClass
    public static void teardown() throws UnknownHostException {
       
		Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
        Reporter.setSystemInfo("USER", System.getProperty("user.name"));
        Reporter.setSystemInfo("OS", System.getProperty("os.name"));
        Reporter.setSystemInfo("HOST NAME", InetAddress.getLocalHost().getHostName());
                          		
	}
	
	/*@BeforeClass
	public static void setup() throws UnknownHostException {
	   
		ExtentProperties extentProperties = ExtentProperties.INSTANCE;
	    extentProperties.setReportPath("TestExecutionReports/VisionCore_RestAPI_AutomatedTestExecution_Report.html");
	    extentProperties.setExtentXServerUrl("http://localhost:1337");
	    extentProperties.setProjectName("VisionCore_RestAPI_Services");
	    //"com.emaratech.tests.restAPI_VisionCore_HealthCore", ,
	    
		   
	}*/

}