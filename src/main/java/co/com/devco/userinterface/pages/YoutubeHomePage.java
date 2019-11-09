package co.com.devco.userinterface.pages;

import net.serenitybdd.screenplay.targets.Target;

import static co.com.devco.automation.mobile.locator.ElementFinder.theElementBy;
import static co.com.devco.userinterface.locators.YoutubeHomeLocator.*;

public class YoutubeHomePage {
    public static final Target BUTTON_FIND_VIDEO = Target.the("Button Video Finder").located(theElementBy(BUTTON_FIND_VIDEO_LOCATOR));
    public static final Target FIELD_SEARCH = Target.the("Field to searchs videos").located(theElementBy(FIELD_SEARCH_LOCATOR));
    public static final Target ITEM_FIRST_VIDEO = Target.the("First video item").located(theElementBy(ITEM_FIRST_VIDEO_LOCATOR));
    public static final Target BTN_MY_PROFILE = Target.the("Button My Profile").located(theElementBy(BTN_MY_PROFILE_LOCATOR));

    private YoutubeHomePage(){}
}
