package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {


    @Given("user is on login page")
    public void user_is_on_login_page() {
        System.out.println("inside step- user is on login page");
//        throw new io.cucumber.java.PendingException();
    }

    @When("user enters username and password")
    public void user_enters_username_and_password() {
        System.out.println("inside step- user enters username and password");
//        throw new io.cucumber.java.PendingException();
    }

    @And("clicks on login button")
    public void clicks_on_login_button() {
        System.out.println("inside step- clicks on login button");
//        throw new io.cucumber.java.PendingException();
    }

    @Then("user is navigate to the login page")
    public void user_is_navigate_to_the_login_page() {
        System.out.println("inside step- user is navigate to the login page");
//        throw new io.cucumber.java.PendingException();
    }

}
