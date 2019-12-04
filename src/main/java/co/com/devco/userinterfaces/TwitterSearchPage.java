package co.com.devco.userinterfaces;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TwitterSearchPage {

    public static final Target ACCEPT_BTN_LOCATION = Target.the("The Button for accept the GPS location option").located(By.xpath("//android.widget.Button[@text='ACEPTAR']"));

    public static final Target INPUT_BOX_SEARCH = Target.the("The Input Box Search").located(MobileBy.id("query_view"));

    public static final Target INPUT_SEARCH = Target.the("The Input Search").located(MobileBy.id("query"));

    public static final Target RESULT_USER_ACCOUNT = Target.the("The Result User Account").locatedBy("//android.widget.TextView[@text='{0}']");

}
