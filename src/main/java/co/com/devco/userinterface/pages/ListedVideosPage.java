package co.com.devco.userinterface.pages;

import net.serenitybdd.screenplay.targets.Target;

import static co.com.devco.automation.mobile.locator.ElementFinder.dynamicElement;
import static co.com.devco.userinterface.locators.ListedVideosLocator.CARD_VIDEO_LOCATOR;

public class ListedVideosPage {
    public static final Target CARD_VIDEO = Target.the("Card listed videos").locatedBy(dynamicElement(CARD_VIDEO_LOCATOR));

    private ListedVideosPage(){}
}
