package stepdefenitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefenition {
	
	 @Given("^User landing on a home page$")
	    public void user_landing_on_a_home_page() throws Throwable {
		 System.out.println("Landing to Loging Page");
	       // throw new PendingException();
	    }

	    @When("^User log into homw page with UserName and Password$")
	    public void user_log_into_homw_page_with_username_and_password() throws Throwable {
	    	System.out.println("User name + Password");
	        //throw new PendingException();
	    }

	    @Then("^Home Page is Populated$")
	    public void home_page_is_populated() throws Throwable {
	    	System.out.println("Home page is populated");
	       // throw new PendingException();
	    }

	    @And("^cards are displayed$")
	    public void cards_are_displayed() throws Throwable {
	    	System.out.println("cards ae displayed");
	        //throw new PendingException();
	    }

}
