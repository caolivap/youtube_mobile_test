package co.com.devco.userinterface.locators;

import co.com.devco.automation.mobile.locator.Locator;

import static co.com.devco.automation.mobile.locator.Locator.locator;

public class MyProfileLocator {
    public static final Locator OPT_MY_CHANNEL_LOCATOR = locator().withAndroidXpathStatic("//android.widget.TextView[contains(@text ,'Tu canal')]").withIosXpathStatic("");
    public static final Locator LNK_OPTION_VER_TODO_LOCATOR = locator().withAndroidXpathStatic("(//android.widget.TextView[contains(@text ,'VER TODO')])[3]").withIosXpathStatic("");
    public static final Locator BTN_SUBSCRIBE_LOCATOR = locator().withAndroidXpathStatic("(//android.widget.TextView[contains(@content-desc,'¿Deseas anular tu suscripción')])[1]").withIosXpathStatic("");

    private MyProfileLocator(){}
}
