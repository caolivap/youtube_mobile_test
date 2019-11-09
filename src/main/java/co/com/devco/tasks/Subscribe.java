package co.com.devco.tasks;

import co.com.devco.automation.mobile.actions.Scroll;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.devco.userinterface.pages.MyProfilePage.LNK_OPTION_VER_TODO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Subscribe implements Task {

    public static Performable toChannel(){
        return instrumented(Subscribe.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.untilVisibleTarget(LNK_OPTION_VER_TODO),
                Click.on(LNK_OPTION_VER_TODO)
        );
    }
}
