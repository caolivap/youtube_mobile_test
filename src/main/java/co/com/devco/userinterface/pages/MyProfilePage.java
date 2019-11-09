package co.com.devco.userinterface.pages;

import net.serenitybdd.screenplay.targets.Target;

import static co.com.devco.automation.mobile.locator.ElementFinder.theElementBy;
import static co.com.devco.userinterface.locators.MyProfileLocator.*;

public class MyProfilePage {
    public static final Target OPT_MY_CHANNEL = Target.the("My channel Option").located(theElementBy(OPT_MY_CHANNEL_LOCATOR));
    public static final Target LNK_OPTION_VER_TODO = Target.the("My channel Option").located(theElementBy(LNK_OPTION_VER_TODO_LOCATOR));
    public static final Target BTN_SUBSCRIBE = Target.the("Button Subscribe").located(theElementBy(BTN_SUBSCRIBE_LOCATOR));
}
