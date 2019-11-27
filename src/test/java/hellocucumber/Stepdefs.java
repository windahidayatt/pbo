package hellocucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import static org.junit.Assert.*;

class IsItFriday {
    static String isItFriday(String today) {
        return "Nope";
    }
    static String isItFridayy(String today2) {
        return "Thank You";
    }
}

public class Stepdefs {
    private String today;
    private String today2;
    private String actualAnswer;
    private String actualAnswer2;

    @Given("today is Sunday")
    public void today_is_Sunday() {
        today = "Sunday";
        today2 = "Sunday";
    }

    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_Friday_yet() {
        actualAnswer = IsItFriday.isItFriday(today);
        actualAnswer2 = IsItFriday.isItFridayy(today2);
    }

//    @Then("I should be told {string}")
//    public void i_should_be_told(String expectedAnswer) {
//        assertEquals(expectedAnswer, actualAnswer);
//    }
    @Then("^I should be told \"([^\"]*)\"$")
    public void i_should_be_told(String expectedAnswer) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(expectedAnswer, actualAnswer);
    }
    @Then("^I should be say \"([^\"]*)\"$")
    public void i_should_be_say(String expectedAnswer) throws Exception {
        // Write code here that turns the phrase above into concrete action
        assertEquals(expectedAnswer, actualAnswer2);
    }

}