package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariDriver;

public class HomestepsDefinition {
    public static WebDriver driver=new ChromeDriver();


    @Given("I navigate to the home page")
    public void i_navigate_to_the_home_page() {
//        ChromeOptions options=new ChromeOptions();
//        options.addArguments("--remote-allow-origins=*");
//        System.setProperty("webdriver.chrome.driver", "/Users/gerontiliparteliani/Downloads/chrome-mac-arm64/GoogleChromeforTesting.app");
//       WebDriverManager.chromedriver().setup();
//       WebDriver driver = new ChromeDriver();
       driver.get("https://www.google.com");

    }
    @When("click to search")
    public void click_to_search() {
            driver.findElement(By.name("q")).sendKeys("test");
    }

    @Given("I go to the page")
    public void i_go_to_the_page() {
        driver.get("https://www.google.com");
    }

    @Given("I type to a page")
    public void i_type_to_a_page() {
       driver.get("https://www.google.com");
    }

    @When("I click on search")
    public void i_click_on_search() {
        driver.findElement(By.name("q"));
    }

    @Then("I wait")
    public void i_wait() throws InterruptedException {
       Thread.sleep(200);
    }

    @When("I write a text")
    public void i_write_a_text() throws InterruptedException {
        driver.findElement(By.id("APjFqb")).sendKeys("hello");
        Thread.sleep(2000);
    }

    @Then("I go back to page")
    public void i_go_back_to_page() {
        driver.quit();
    }




}
