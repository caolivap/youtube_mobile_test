package co.com.devco.userinterface.locators;

import co.com.devco.automation.mobile.locator.Locator;

import static co.com.devco.automation.mobile.locator.Locator.locator;

public class ListedVideosLocator {
    public static final Locator CARD_VIDEO_LOCATOR = locator().withAndroidXpathDynamic("//android.view.ViewGroup[contains(@content-desc,'{0}')]").withIosXpathStatic("");

    private ListedVideosLocator(){}
}
