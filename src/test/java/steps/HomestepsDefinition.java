package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
//import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Test.*;
import org.hamcrest.MatcherAssert.*;
import org.hamcrest.Matchers.*;
import org.assertj.core.api.Assertions.*;



public class HomestepsDefinition {
    public static WebDriver driver;


    @Before
    public static void setUp(){
        driver=new ChromeDriver();


    }
    @After
    public static void tearDown(){
        if(driver!=null){
            driver.quit();
        }
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

    @Then("I reload browser")
    public void iReloadBrowser() {

        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("location.reload");
    }

    @When("I go back")
    public void iGoBack() {
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.history.back()");
    }

//StoriAI stepdefs>>>>>>>>>>>>>>>>>>>>>>>>>>
    @Given("I navigate to {string}")
    public void iNavigateTo(String mywebsite) {
        driver.get("https://"+mywebsite);
    }



    @Then("log in page should be present")
    public void logInPageShouldBePresent() {
       WebElement element= driver.findElement(By.xpath("//p[@class='display-sm-sb text-gray-900 text-center']"));
       element.isDisplayed();
       element.getText().equals("Log in to your account");

    }

    @Then("the website should have title as  {string}")
    public void theWebsiteShouldHaveTitleAs(String expectedTitle) {
       String title=driver.getTitle();
        System.out.println("title "
                +title);
        Assertions.assertThat(title).isEqualTo(expectedTitle);


    }

    @When("I type username as {string}")
    public void iTypeUsernameAs(String userName) {
        WebElement enterUser=driver.findElement(By.xpath("//input[@type='text']"));
        enterUser.sendKeys(userName);
    }

    @And("I type password as {string}")
    public void iTypePasswordAs(String password) throws InterruptedException {
        WebElement passwordField=driver.findElement(By.xpath("//input[@type='password']"));
        passwordField.sendKeys(password);

    }

    @And("I click Sign in button")
    public void iClickSignInButton() {
        WebElement signInbutton= driver.findElement(By.xpath("//button[normalize-space()='Sign in']"));
        signInbutton.click();

    }



    @And("I accept the alert")
    public void iAcceptTheAlert() {

        driver.findElement(By.xpath("//button[normalize-space()='Accept']")).click();
    }



    @Then("I Should land on home page")
    public void iShouldLandOnHomePage() {
        WebElement ele= driver.findElement(By.xpath("//p[contains(text(),'Manage your posts and content.')]"));
        ele.isDisplayed();
    }

    @When("I click log out I should get logged out")
    public void iClickLogOutIShouldGetLoggedOut() {
        WebElement profile=driver.findElement(By.xpath("//img[@id='header-profile-image']"));
        profile.click();
        WebElement logOut=driver.findElement(By.xpath("//p[contains(text(),'Logout')]"));
        logOut.click();
       WebElement element= driver.findElement(By.xpath("//p[@class='display-sm-sb text-gray-900 text-center']"));
        element.isDisplayed();
        element.getText().equals("Log in to your account");

    }

    @Then("I should see an error message as {string}")
    public void iShouldSeeAnErrorMessageAs(String error) {
       String message= driver.findElement(By.xpath("//p[contains(text(),'Invalid login attempt.')]")).getText();
       Assertions.assertThat(message.equals(error)).isTrue();


    }
}
