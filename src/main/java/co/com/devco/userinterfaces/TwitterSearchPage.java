package co.com.devco.userinterfaces;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class TwitterSearchPage {

    public static final Target INPUT_BOX_SEARCH = Target.the("The Input Box Search").located(MobileBy.id("query_view"));

    public static final Target INPUT_SEARCH = Target.the("The Input Search").located(MobileBy.id("query"));

}
