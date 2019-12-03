package co.com.devco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.devco.userinterfaces.TwitterSearchPage.INPUT_BOX_SEARCH;
import static co.com.devco.userinterfaces.TwitterSearchPage.INPUT_SEARCH;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Search implements Task {

    private String wordToSearch;

    Search(String wordToSearch){
        this.wordToSearch = wordToSearch;
    }

    public static Performable twitterUserName(String userName) {
        return instrumented(Search.class, userName);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(INPUT_BOX_SEARCH, isVisible()),
                Click.on(INPUT_BOX_SEARCH),
                Enter.theValue(wordToSearch).into(INPUT_SEARCH)
        );
    }



}
