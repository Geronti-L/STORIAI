package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/feature",
        glue = "src/test/java/steps",
        plugin = {"pretty","html:target/report/cucumber.html"},
        publish = true,
        tags = "@test"

)
public class TestRunner {

}
