package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	    tags = "",
	    features = {"src/test/resources/Features"},
	    glue = {"StepDefinition"},
	    plugin = {"pretty", "html:target/htmlreport.html"}
	)

public class CucumberRunner extends AbstractTestNGCucumberTests{

}
