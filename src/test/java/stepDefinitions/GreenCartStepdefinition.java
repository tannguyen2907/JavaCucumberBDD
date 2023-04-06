package stepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;


public class GreenCartStepdefinition {
    public WebDriver driver;
    @Given("User is on the GreenCart landing page")
    public void user_is_on_the_green_cart_landing_page() throws Throwable{
//       System.setProperty("webdriver.chrome.driver","src/test/java/chromeDriver");
       driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        
    }
    @When("User search with ShortName {string} and extracted actual name of product")
    public void user_search_with_short_name_and_extracted_actual_name_of_product(String veg) {
       driver.findElement(By.xpath("//input[@type='search']")).sendKeys(veg);
       String ProductName = driver.findElement(By.cssSelector("h4.product-name")).getText().split("-")[0].trim();
        System.out.println(ProductName);
       assert ProductName.equals(veg);

    }
    @Then("User search for the same shortname {string} in offers page to check if the product exist")
    public void user_search_for_the_same_shortname_in_offers_page_to_check_if_the_product_exist(String veg) {
        System.out.println("Alo");
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys(veg);
    }
}
