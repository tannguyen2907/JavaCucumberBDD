//package stepDefinitions;
//
//import io.cucumber.java.After;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.ExpectedCondition;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class login{
//
////Opening Firefox Browser and launching the login page of application
//
//    private final WebDriver driver = new FirefoxDriver();
//
//    @Given("user navigates to the login page by opening Firefox")
//    public void user_is_on_login_page()
//    {
//        driver.get("//Login Page URL");
//    }
//
////Entering correct username and password values
//
//    @When("user enters correct username and password values")
//    public void enter_Username_Password()
//    { driver.findElement(By.xpath(".//*[@id='username']/a")).sendkeys(“//CorrectUsername value”);
//            driver.findElement(By.xpath(".//*[@id='password']/a")).sendkeys(“//CorrectPassword value”);
//    }
//
////Open homepage upon login
//
//    @Then("user gets directed to homepage")
//    public void direct_to_homepage() throws Throwable
//    {
//        driver.get(“Homepage url”);
//    }
//
//    @After()
//    public void closeBrowser()
//    {
//        driver.quit();
//    }
//
//
//}