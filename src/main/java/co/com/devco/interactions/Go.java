package co.com.devco.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.devco.userinterface.pages.MyProfilePage.OPT_MY_CHANNEL;
import static co.com.devco.userinterface.pages.YoutubeHomePage.BTN_MY_PROFILE;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Go implements Interaction {

    public static Performable toMyChannel(){
        return instrumented(Go.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_MY_PROFILE),
                Click.on(OPT_MY_CHANNEL)
        );
    }
}
