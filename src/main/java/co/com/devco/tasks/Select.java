package co.com.devco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.devco.userinterfaces.TwitterHomePage.SEARCH_BUTTON;
import static co.com.devco.userinterfaces.TwitterSearchPage.ACCEPT_BTN_LOCATION;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Select implements Task {

    public static Performable finderButton() {
        return instrumented(Select.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ACCEPT_BTN_LOCATION),
                Click.on(SEARCH_BUTTON)
        );
    }
}
