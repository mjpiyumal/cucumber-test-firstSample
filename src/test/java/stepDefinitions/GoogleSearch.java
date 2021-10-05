package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GoogleSearch {

    WebDriver driver = null;

    @Given("browser is open")
    public void browser_is_open() {

        String project_path = System.getProperty("user.dir");

        System.out.println("Inside step- browser is open");
        System.setProperty("webdriver.chrome.driver", project_path + "/src/test/resources/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);

//        driver.manage().window().maximize();
    }

    @And("user is on google search page")
    public void user_is_on_google_search_page() {
        System.out.println("Inside step- browser is open");

        driver.navigate().to("https://www.google.com/");
    }

    @When("user enters a text in search box")
    public void user_enters_a_text_in_search_box() throws InterruptedException {
        System.out.println("Inside step- user is on google search page");

        driver.findElement(By.name("q")).sendKeys("vcLabs");

        Thread.sleep(2000);
    }

    @And("his enter")
    public void his_enter() {
        System.out.println("Inside step- his enter");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    }

    @Then("user is navigated to search result")
    public void user_is_navigated_to_search_result() {
        System.out.println("Inside step- user is navigated to search result");

        driver.getPageSource().contains("Welcome to vcLABs");

        driver.close();
        driver.quit();
    }

}
