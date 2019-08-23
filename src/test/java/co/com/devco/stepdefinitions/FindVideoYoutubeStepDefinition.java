package co.com.devco.stepdefinitions;

import co.com.devco.exceptions.VideoDoesNotBelongToTheBandException;
import co.com.devco.interactions.Select;
import co.com.devco.questions.FirstVideo;
import co.com.devco.tasks.Find;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static co.com.devco.exceptions.VideoDoesNotBelongToTheBandException.OTHER_VIDEO_LISTED_MESSAGE;
import static co.com.devco.models.builders.VideoBuilder.video;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FindVideoYoutubeStepDefinition {

    @Given("^that (.*) wants to search a Video$")
    public void thatJuanWantsSearchVideo(String nameActor) {
        theActorCalled(nameActor).attemptsTo(
                Select.buttonFinder()
        );
    }

    @When("^He searchs (.*)$")
    public void heSearchsVideo(String songName) {
        theActorInTheSpotlight().attemptsTo(
                Find.the(video().
                        withSongName(songName)
                )
        );
    }

    @Then("^He should see that the first video belongs to (.*) Band$")
    public void heShouldSeeTheFirstVideoBelongsTo(String nameband) {
        theActorInTheSpotlight().should(seeThat(
                FirstVideo.listedBelongsTo(nameband)).orComplainWith(
                VideoDoesNotBelongToTheBandException.class, OTHER_VIDEO_LISTED_MESSAGE
                )
        );
    }
}
