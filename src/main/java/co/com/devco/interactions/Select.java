package co.com.devco.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.devco.userinterface.pages.YoutubeHomePage.BUTTON_FIND_VIDEO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Select implements Interaction {

    public static Performable buttonFinder(){
        return instrumented(Select.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BUTTON_FIND_VIDEO)
        );
    }
}
