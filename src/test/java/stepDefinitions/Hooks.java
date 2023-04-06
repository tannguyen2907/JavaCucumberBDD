package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {
//    public WebDriver driver;
    @Before("@BeforeTesting")
    public void beforeValidation() {
        System.out.println("Mobile Before Hooks");
    }
    @After("@AfterTesting")
    public void afterValidation() {
        System.out.println("After Tesing Hooks");
//        driver.quit();
    }
}
