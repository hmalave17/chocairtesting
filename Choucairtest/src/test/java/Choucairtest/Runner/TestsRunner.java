package Choucairtest.Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "./src/test/resources/Features/", 
				 glue = { "Choucairtest.stepDefinitions" },
				 tags = "@RegressionTest"
                 )

public class TestsRunner {

}
