1package testRunner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty","html:target/cucumber.htmi"},
                         monochrome = true ,
                         dryRun = false ,
                         features = "C:\\Users\\Sruja\\eclipse-workspace\\LMS_hackathon_phase2\\Features",
                         glue = {"stepDefinition" ,"Hooks"})
                         
                         
		

public class TestRunner {

}
