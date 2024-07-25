package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariDriver;

public class HomestepsDefinition {
    public static WebDriver driver;

    @Before
    public void setUp(){
        driver=new ChromeDriver();
    }
    @After
    public void tearDown(){
        if(driver!=null){
            driver.quit();
        }
    }


    @Given("I type to a page")
    public void i_type_to_a_page() {
        driver.get("https://www.google.com");

    }



    @Then("I wait")
    public void i_wait() {


    }

    @When("I write a text")
    public void i_write_a_text() {

    }

    @Then("I go back to page")
    public void i_go_back_to_page() {

    }


    @When("I click search button")
    public void iClickSearchButton() {
       WebElement element= driver.findElement(By.xpath("//input[@value='Google Search']"));
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()",element);
    }

    @Then("I wait {int} seconds")
    public void iWaitSeconds(int number) throws InterruptedException {
        Thread.sleep(number*1000);
    }

    @Then("I quit chrome")
    public void iQuitChrome() {
        driver.quit();
    }


    @When("I turn  search field to red")
    public void iTurnSearchFieldToRed() {
        WebElement element=driver.findElement(By.name("q"));
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.background='red'",element);
        element.sendKeys("background is red");
    }

    @When("I turn search field to green")
    public void iTurnSearchFieldToGreen() {
        WebElement element=driver.findElement(By.name("q"));
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.background='green'",element);
        element.sendKeys("background is green");
    }

    @When("I refresh browser")
    public void iRefreshBrowser() {
        driver.navigate().refresh();
    }
}
