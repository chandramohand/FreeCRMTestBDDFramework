package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\MyWorkspace_0328\\FreeCRMTestBDDFramework\\src\\main\\java\\Features\\Deals.Feature",
					glue = {"stepDefinitions"},
					monochrome=true, //display the console output in a proper readable format
					format= {"pretty","html:test-output","json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //"json:json_output/cucumber.json"},
					strict=true, //it will check if any step is not defined in step definition file
					dryRun=false //to check the mapping is proper between feature file and step def file
					)

	
	public class TestRunner {	
	

}
