package multicart.cuck.test.runner;




import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.SnippetType;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/"},
					glue = {"multicart.steps.defination", "multicart.steps.hook"},
					plugin = {"pretty",
								"json:target/cucumber-reports/cucumber.json",
								"html:target/cucumber-reports"},
					tags = {"@wip"},
					snippets = SnippetType.CAMELCASE
					)
public class RunCuckTest {
	

}
