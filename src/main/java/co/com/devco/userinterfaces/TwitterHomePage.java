package co.com.devco.userinterfaces;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class TwitterHomePage {

    public static final Target SEARCH_BUTTON = Target.the("The Twitter Search Button").located(MobileBy.id("moments"));
}
