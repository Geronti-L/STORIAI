package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/feature",
        glue = "steps",
        plugin = {"pretty","html:target/report.html","json:target/report.json"},
        publish = true,
        tags = "@TestAll"

)
public class TestRunner {


    @BeforeClass
    public static void setUp() {

    }

    @AfterClass
    public static void tearDown() {

    }



}

