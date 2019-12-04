package co.com.devco.stepdefinitions;

import co.com.devco.questions.Result;
import co.com.devco.tasks.Search;
import co.com.devco.tasks.Select;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.is;

public class FindTwitterUserStepDefinition {

    @Given("^that (.*) wants to see Twitter users$")
    public void thatActorWantsToSeeTweets(String actorName) {
        theActorCalled(actorName).attemptsTo(
                Select.finderButton()
        );
    }

    @When("^He searchs (.*)$")
    public void heSearchsUserName(String userName) {
        theActorInTheSpotlight().attemptsTo(
                Search.twitterUserName(userName)
        );
    }

    @Then("^He should see that the first result belongs to (.*) account$")
    public void heShouldSeeThatTheFirstResultBelongsToUserAccount(String userAccount) {
        theActorInTheSpotlight().should(seeThat("The user account found", Result.ofUserAccount(userAccount), is(userAccount)));
    }

}
