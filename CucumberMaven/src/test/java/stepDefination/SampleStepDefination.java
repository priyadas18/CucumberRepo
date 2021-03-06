package stepDefination;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SampleStepDefination {
	
	@Given("^User is on the Hompage$")
	public void User_is_on_the_Hompage() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    System.out.println("We are on the Homepage");
	}

	@When("^enter the <\"([^\"]*)\"> and <\"([^\"]*)\">$")
	public void enter_the_and_(String name, String password) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    System.out.println("The user name "+name);
	    System.out.println("The password "+password);
	}

	@Then("^user should be successfully login to the application$")
	public void user_should_be_successfully_login_to_the_application() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		System.out.println("User Successfully loggedIn");
	}

}
