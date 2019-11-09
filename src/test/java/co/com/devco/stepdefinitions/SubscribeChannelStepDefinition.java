package co.com.devco.stepdefinitions;

import co.com.devco.exceptions.NoChannelSubscribeException;
import co.com.devco.interactions.Go;
import co.com.devco.questions.SubscribeButton;
import co.com.devco.tasks.Subscribe;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static co.com.devco.exceptions.NoChannelSubscribeException.NO_CHANNEL_SUBSCRIBE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SubscribeChannelStepDefinition {

    @Given("^that (.*) configure his channel$")
    public void thatJuanConfigureHisChannel(String actor) {
        theActorCalled(actor).attemptsTo(
                Go.toMyChannel()
        );
    }

    @When("^He see the subscription$")
    public void heSeeTheSubscription() {
        theActorInTheSpotlight().attemptsTo(
                Subscribe.toChannel()
        );

    }

    @Then("^He should see all the channels to subscribe$")
    public void heShouldSeeAllTheChannelsToSubscribe() {
        theActorInTheSpotlight().should(seeThat(SubscribeButton.isVisible())
                .orComplainWith(NoChannelSubscribeException.class, NO_CHANNEL_SUBSCRIBE)
        );
    }
}
