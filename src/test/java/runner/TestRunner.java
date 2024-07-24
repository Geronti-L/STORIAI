package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/feature",
        glue = "src/test/java/steps",
        plugin = {"pretty","html:target/cucumber-reports.html"},
        publish = true,
        tags = "@test"

)
public class TestRunner {
    @BeforeClass
    public static void setup() {
    }

    @AfterClass
    public static void teardown() {
    }

}
