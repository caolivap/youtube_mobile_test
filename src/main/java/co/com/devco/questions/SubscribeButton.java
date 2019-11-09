package co.com.devco.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.devco.userinterface.pages.MyProfilePage.BTN_SUBSCRIBE;

public class SubscribeButton implements Question<Boolean> {

    public static SubscribeButton isVisible(){
        return new SubscribeButton();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return BTN_SUBSCRIBE.resolveFor(actor).isVisible();
    }
}
