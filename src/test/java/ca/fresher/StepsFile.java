package ca.fresher;

import java.util.concurrent.TimeUnit;
import junit.framework.TestCase;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepsFile extends TestCase{
	int input1, input2;
	@Given("^the inputs \"([^\"]*)\" and \"([^\"]*)\"$")
	public void the_inputs_and(String arg1, String arg2) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		input1=Integer.valueOf(arg1);
		input2=Integer.valueOf(arg2);
		
	}

	@When("^I select the \"([^\"]*)\" as option$")
	public void I_select_the_as_option(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
	}

	@Then("^the Result field should be \"([^\"]*)\"$")
	public void the_Result_field_should_be(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		assertEquals(arg1, String.valueOf(input1+input2));    
	}

}
