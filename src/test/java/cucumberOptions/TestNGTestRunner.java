package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java", glue="stepDefinitions", monochrome=true, dryRun=true)
public class TestNGTestRunner extends AbstractTestNGCucumberTests{

}
